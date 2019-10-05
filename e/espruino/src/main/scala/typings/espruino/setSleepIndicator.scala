package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("setSleepIndicator")
@js.native
object setSleepIndicator extends js.Object {
  /**
  * <p>When Espruino is asleep, set the pin specified here low (when it&#39;s awake, set it high). Set this to undefined to disable the feature.</p>
  * <p>Please see <a href="http://www.espruino.com/Power+Consumption">http://www.espruino.com/Power+Consumption</a> for more details on this.</p>
  * 
  * @param pin 
  * @url http://www.espruino.com/Reference#l__global_setSleepIndicator
  */
  def apply(pin: Pin): Unit = js.native
}

