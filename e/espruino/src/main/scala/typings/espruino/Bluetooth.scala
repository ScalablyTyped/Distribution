package typings.espruino

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Bluetooth")
@js.native
/**
  * 
  * @return  
  */
class Bluetooth () extends Serial {
  /* CompleteClass */
  override def removeListener(event: String, listener: js.Any): js.Any = js.native
}

/**
* <p>The Bluetooth Serial port - used when data is sent or received over Bluetooth Smart on nRF51/nRF52 chips.</p>
* 
* @url http://www.espruino.com/Reference#l__global_Bluetooth
*/
@JSGlobal("Bluetooth")
@js.native
object Bluetooth extends TopLevel[Serial]

