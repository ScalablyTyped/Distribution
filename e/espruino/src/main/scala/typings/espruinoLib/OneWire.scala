package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>Create a software OneWire implementation on the given pin</p>
* 
* @url http://www.espruino.com/Reference#l_OneWire_OneWire
*/
@js.native
trait OneWire
  extends /**
     * 
     * @param pin 
     * @return  
     */
ScalablyTyped.runtime.Instantiable1[/* pin */ Pin, js.Any] {
  /**
       * <p>Read a byte</p>
       * 
       * @param count 
       * @return  
       * @url http://www.espruino.com/Reference#l_OneWire_read
       */
  def read(count: js.Any): js.Any = js.native
  /**
       * <p>Perform a reset cycle</p>
       * 
       * @return  
       * @url http://www.espruino.com/Reference#l_OneWire_reset
       */
  def reset(): scala.Boolean = js.native
  /**
       * <p>Search for devices</p>
       * 
       * @param command 
       * @return  
       * @url http://www.espruino.com/Reference#l_OneWire_search
       */
  def search(command: scala.Double): js.Any = js.native
  /**
       * <p>Select a ROM - always performs a reset first</p>
       * 
       * @param rom 
       * @url http://www.espruino.com/Reference#l_OneWire_select
       */
  def select(rom: js.Any): scala.Unit = js.native
  /**
       * <p>Skip a ROM</p>
       * 
       * @url http://www.espruino.com/Reference#l_OneWire_skip
       */
  def skip(): scala.Unit = js.native
  /**
       * <p>Write one or more bytes</p>
       * 
       * @param data 
       * @param power 
       * @url http://www.espruino.com/Reference#l_OneWire_write
       */
  def write(data: js.Any, power: scala.Boolean): scala.Unit = js.native
}

