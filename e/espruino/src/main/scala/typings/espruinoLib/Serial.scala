package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// write(data: any[]): any;
// on(event: string, handler: (data: any) => any): any;
// setup(boudrate: number, options: any): any;
// read(chars?: number): string;
/**
* <p>This class allows use of the built-in USARTs</p>
* <p>Methods may be called on the USB, Serial1, Serial2, Serial3, Serial4, Serial5 and Serial6 objects. While different processors provide different numbers of USARTs, you can always rely on at least Serial1 and Serial2</p>
* 
* @url http://www.espruino.com/Reference#Serial
*/
@js.native
trait Serial
  extends Object
     with /**
     * 
     * @return  
     */
org.scalablytyped.runtime.Instantiable0[Serial] {
  /**
       * <p>Return how many bytes are available to read. If there is already a listener for data, this will always return 0.</p>
       * 
       * @return  
       * @url http://www.espruino.com/Reference#l_Serial_available
       */
  def available(): scala.Double = js.native
  /**
       * <p>Try and find a USART (Serial) hardware device that will work on this pin (eg. <code>Serial1</code>)</p>
       * <p>May return undefined if no device can be found.</p>
       * 
       * @param pin 
       * @return  
       * @url http://www.espruino.com/Reference#l_Serial_find
       */
  def find(pin: Pin): js.Any = js.native
  def on(eventName: java.lang.String, f: js.Function1[/* str */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
       * <p>Pipe this USART to a stream (an object with a &#39;write&#39; method)</p>
       * 
       * @param destination 
       * @param options 
       * @url http://www.espruino.com/Reference#l_Serial_pipe
       */
  def pipe(destination: js.Any, options: js.Any): scala.Unit = js.native
  /**
       * <p>Print a string to the serial port - without a line feed</p>
       * <p> <strong>Note:</strong> This function replaces any occurances of <code>\n</code> in the string with <code>\r\n</code>. To avoid this, use <code>Serial.write</code>.</p>
       * 
       * @param string 
       * @url http://www.espruino.com/Reference#l_Serial_print
       */
  def print(string: js.Any): scala.Unit = js.native
  /**
       * <p>Print a line to the serial port with a newline (<code>\r\n</code>) at the end of it.</p>
       * <p> <strong>Note:</strong> This function converts data to a string first, eg <code>Serial.print([1,2,3])</code> is equivalent to <code>Serial.print(&quot;1,2,3&quot;). If you&#39;d like to write raw bytes, use</code>Serial.write`.</p>
       * 
       * @param string 
       * @url http://www.espruino.com/Reference#l_Serial_println
       */
  def println(string: js.Any): scala.Unit = js.native
  /**
       * <p>Return a string containing characters that have been received</p>
       * 
       * @param chars 
       * @return  
       * @url http://www.espruino.com/Reference#l_Serial_read
       */
  def read(): js.Any = js.native
  /**
       * <p>Return a string containing characters that have been received</p>
       * 
       * @param chars 
       * @return  
       * @url http://www.espruino.com/Reference#l_Serial_read
       */
  def read(chars: scala.Double): js.Any = js.native
  /**
       * <p>Set this Serial port as the port for the JavaScript console (REPL).</p>
       * <p>Unless <code>force</code> is set to true, changes in the connection state of the board
       * (for instance plugging in USB) will cause the console to change.</p>
       * 
       * @param force 
       * @url http://www.espruino.com/Reference#l_Serial_setConsole
       */
  def setConsole(force: scala.Boolean): scala.Unit = js.native
  def setup(baudrate: scala.Double, options: js.Any): scala.Unit = js.native
  /**
       * <p>Write a character or array of data to the serial port</p>
       * <p>This method writes unmodified data, eg <code>Serial.write([1,2,3])</code> is equivalent to <code>Serial.write(&quot;\1\2\3&quot;)</code>. If you&#39;d like data converted to a string first, use <code>Serial.print</code>.</p>
       * 
       * @param data 
       * @url http://www.espruino.com/Reference#l_Serial_write
       */
  def write(data: js.Any): scala.Unit = js.native
}

