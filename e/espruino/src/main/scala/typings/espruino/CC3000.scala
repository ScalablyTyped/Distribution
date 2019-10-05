package typings.espruino

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* 
* @url http://www.espruino.com/Reference#l_CC3000_undefined
*/
@js.native
trait CC3000 extends /**
  * 
  * @return  
  */
Instantiable0[CC3000]

/**
* 
*/
@JSGlobal("CC3000")
@js.native
object CC3000 extends js.Object {
  /**
    * <p>Initialise the CC3000 and return a WLAN object</p>
    * 
    * @param spi 
    * @param cs 
    * @param en 
    * @param irq 
    * @return  
    * @url http://www.espruino.com/Reference#l_CC3000_connect
    */
  def connect(spi: js.Any, cs: Pin, en: Pin, irq: Pin): WLAN = js.native
}

