package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("setBusyIndicator")
@js.native
object setBusyIndicator extends js.Object {
  /**
  * <p>When Espruino is busy, set the pin specified here high. Set this to undefined to disable the feature.</p>
  * 
  * @param pin 
  * @url http://www.espruino.com/Reference#l__global_setBusyIndicator
  */
  def apply(pin: Pin): Unit = js.native
}

