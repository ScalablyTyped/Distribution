package typings.espruino

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>Library for communication with the WIZnet Ethernet module</p>
* 
* @url http://www.espruino.com/Reference#l_WIZnet_undefined
*/
@js.native
trait WIZnet extends /**
  * 
  * @return  
  */
Instantiable0[WIZnet]

/**
* 
*/
@JSGlobal("WIZnet")
@js.native
object WIZnet extends js.Object {
  /**
    * <p>Initialise the WIZnet module and return an Ethernet object</p>
    * 
    * @param spi 
    * @param cs 
    * @return  
    * @url http://www.espruino.com/Reference#l_WIZnet_connect
    */
  def connect(spi: js.Any, cs: Pin): Ethernet = js.native
}

