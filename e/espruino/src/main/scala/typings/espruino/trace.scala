package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("trace")
@js.native
object trace extends js.Object {
  /**
  * <p>Output debugging information</p>
  * <p>Note: This is not included on boards with low amounts of flash memory, or the Espruino board.</p>
  * 
  * @param root 
  * @url http://www.espruino.com/Reference#l__global_trace
  */
  def apply(root: js.Any): Unit = js.native
}

