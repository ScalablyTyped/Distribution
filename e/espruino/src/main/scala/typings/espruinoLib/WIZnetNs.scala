package typings
package espruinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* 
*/
@JSGlobal("WIZnet")
@js.native
object WIZnetNs extends js.Object {
  /**
       * <p>Initialise the WIZnet module and return an Ethernet object</p>
       * 
       * @param spi 
       * @param cs 
       * @return  
       * @url http://www.espruino.com/Reference#l_WIZnet_connect
       */
  def connect(spi: js.Any, cs: espruinoLib.Pin): espruinoLib.Ethernet = js.native
}

