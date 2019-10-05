package typings.espruino

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USB")
@js.native
/**
  * 
  * @return  
  */
class USB () extends Serial {
  /* CompleteClass */
  override def removeListener(event: String, listener: js.Any): js.Any = js.native
}

/**
* <p>The USB Serial port</p>
* 
* @url http://www.espruino.com/Reference#l__global_USB
*/
@JSGlobal("USB")
@js.native
object USB extends TopLevel[Serial]

