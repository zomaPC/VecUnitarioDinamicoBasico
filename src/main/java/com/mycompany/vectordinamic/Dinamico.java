
package com.mycompany.vectordinamic;
import java.util.Scanner;

public class Dinamico {
    public static void main (String[] args){
        int longitud = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Numeros a ingresar");
         longitud = entrada.nextInt();
         
        int numeros[] = new int[longitud];
        for(int i=0; i<numeros.length; i++){
            System.out.println("Teclea el valor de #" +(i+1));
         numeros[i] = entrada.nextInt();
    }
        for (int i = 0; i<numeros.length ; i++) {
            System.out.print( numeros[i]);
   }
  }
}
