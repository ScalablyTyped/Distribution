package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>Create a software I2C port. This has limited functionality (no baud rate), but it can work on any pins.</p>
* <p>Use <code>SPI.setup</code> to configure this port.</p>
* 
* @url http://www.espruino.com/Reference#l_I2C_I2C
*/
@js.native
trait I2C
  extends /**
     * 
     * @return  
     */
org.scalablytyped.runtime.Instantiable0[I2C] {
  /**
       * <p>Try and find an I2C hardware device that will work on this pin (eg. <code>I2C1</code>)</p>
       * <p>May return undefined if no device can be found.</p>
       * 
       * @param pin 
       * @return  
       * @url http://www.espruino.com/Reference#l_I2C_find
       */
  def find(pin: Pin): js.Any = js.native
  /**
       * <p>Request bytes from the given slave device, and return them as a Uint8Array (packed array of bytes). This is like using Arduino Wire&#39;s requestFrom, available and read functions.  Sends a STOP</p>
       * 
       * @param address 
       * @param quantity 
       * @return  
       * @url http://www.espruino.com/Reference#l_I2C_readFrom
       */
  def readFrom(address: js.Any, quantity: scala.Double): stdLib.Uint8Array = js.native
  /**
       * <p>Set up this I2C port</p>
       * <p>If not specified in options, the default pins are used (usually the lowest numbered pins on the lowest port that supports this peripheral)</p>
       * 
       * @param options 
       * @url http://www.espruino.com/Reference#l_I2C_setup
       */
  def setup(options: I2CSetupOptions): scala.Unit = js.native
  /**
       * <p>Transmit to the slave device with the given address. This is like Arduino&#39;s beginTransmission, write, and endTransmission rolled up into one.</p>
       * 
       * @param address 
       * @param data 
       * @url http://www.espruino.com/Reference#l_I2C_writeTo
       */
  def writeTo(address: js.Any, data: js.Any): scala.Unit = js.native
}

