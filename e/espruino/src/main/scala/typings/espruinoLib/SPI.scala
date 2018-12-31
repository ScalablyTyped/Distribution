package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>Create a software SPI port. This has limited functionality (no baud rate), but it can work on any pins.</p>
* <p>Use <code>SPI.setup</code> to configure this port.</p>
* 
* @url http://www.espruino.com/Reference#l_SPI_SPI
*/
@js.native
trait SPI
  extends /**
  * 
  * @return  
  */
org.scalablytyped.runtime.Instantiable0[SPI] {
  /**
    * <p>Try and find an SPI hardware device that will work on this pin (eg. <code>SPI1</code>)</p>
    * <p>May return undefined if no device can be found.</p>
    * 
    * @param pin 
    * @return  
    * @url http://www.espruino.com/Reference#l_SPI_find
    */
  def find(pin: Pin): js.Any = js.native
  /**
    * <p>Send data down SPI, and return the result. Sending an integer will return an integer, a String will return a String, and anything else will return a Uint8Array.</p>
    * <p>Sending multiple bytes in one call to send is preferable as they can then be transmitted end to end. Using multiple calls to send() will result in significantly slower transmission speeds.</p>
    * <p>For maximum speeds, please pass either Strings or Typed Arrays as arguments. Note that you can even pass arrays of arrays, like <code>[1,[2,3,4],5]</code></p>
    * 
    * @param data 
    * @param nss_pin 
    * @return  
    * @url http://www.espruino.com/Reference#l_SPI_send
    */
  def send(data: js.Any, nss_pin: Pin): js.Any = js.native
  /**
    * <p>Send data down SPI, using 4 bits for each &#39;real&#39; bit (MSB first). This can be useful for faking one-wire style protocols</p>
    * <p>Sending multiple bytes in one call to send is preferable as they can then be transmitted end to end. Using multiple calls to send() will result in significantly slower transmission speeds.</p>
    * 
    * @param data 
    * @param bit0 
    * @param bit1 
    * @param nss_pin 
    * @url http://www.espruino.com/Reference#l_SPI_send4bit
    */
  def send4bit(data: js.Any, bit0: scala.Double, bit1: scala.Double, nss_pin: Pin): scala.Unit = js.native
  /**
    * <p>Send data down SPI, using 8 bits for each &#39;real&#39; bit (MSB first). This can be useful for faking one-wire style protocols</p>
    * <p>Sending multiple bytes in one call to send is preferable as they can then be transmitted end to end. Using multiple calls to send() will result in significantly slower transmission speeds.</p>
    * 
    * @param data 
    * @param bit0 
    * @param bit1 
    * @param nss_pin 
    * @url http://www.espruino.com/Reference#l_SPI_send8bit
    */
  def send8bit(data: js.Any, bit0: scala.Double, bit1: scala.Double, nss_pin: Pin): scala.Unit = js.native
  /**
    * <p>Set up this SPI port as an SPI Master.</p>
    * 
    * @param options 
    * @url http://www.espruino.com/Reference#l_SPI_setup
    */
  def setup(options: js.Any): scala.Unit = js.native
  /**
    * <p>Write a character or array of characters to SPI - without reading the result back.</p>
    * <p>For maximum speeds, please pass either Strings or Typed Arrays as arguments.</p>
    * 
    * @param data 
    * @url http://www.espruino.com/Reference#l_SPI_write
    */
  def write(data: js.Any): scala.Unit = js.native
}

