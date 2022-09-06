import java.util.Scanner;

public class L2 {

    public static void main(String[] args) {

        // Escape Sequences
        // System.out.println("This is\b a test");
        // System.out.println("This\tis a test");
        // System.out.println("This is a\n test");
        // System.out.println("This is a \"test\"");
        // System.out.println("This is a \'test\'");
        // System.out.println("This\f is a \f test \f");
        // System.out.println("This is a backslash \\");
        // Comments
        // This is a Single line comment
        /*
         * This
         * is
         * a
         * multi line
         * Comment
         */

        /**
         * This is a JavaDoc comment
         */

        // Format Specifiers

        int i = 1234567890;
        boolean b = true;
        char c = 'a';
        short s = 12345;
        float f = 10.2f;
        double d = 344.659;
        // System.out.printf("boolean b = %b\n", b);
        // System.out.printf("character c = %c\n", c);
        // System.out.printf("short s = %d\n", s);
        // System.out.printf("integer i = %d\n", i);
        // System.out.printf("float f = %1f\n", f);
        // System.out.printf("double d = %3f\n", d);

        // User Input in Java
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        System.out.println("You entered: " + num);
        input.nextLine();
        System.out.print("Enter a string: ");
        String line = input.nextLine();
        System.out.println("You entered: " + line);

        System.out.print("Enter a float: ");
        float float_value = input.nextFloat();
        System.out.println("You entered: " + float_value);

        System.out.print("Enter a double: ");
        double double_value = input.nextDouble();
        System.out.println("You entered: " + double_value);

        System.out.print("Enter a boolean: ");
        boolean boolean_value = input.nextBoolean();
        System.out.println("You entered: " + boolean_value);

        System.out.print("Enter a character: ");
        char char_value = input.next().charAt(0);
        System.out.println("You entered: " + char_value);

    }

}