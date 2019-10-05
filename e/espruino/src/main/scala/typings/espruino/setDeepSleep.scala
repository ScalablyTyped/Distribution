package typings.espruino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("setDeepSleep")
@js.native
object setDeepSleep extends js.Object {
  /**
  * <p>Set whether we can enter deep sleep mode, which reduces power consumption to around 100uA. This only works on STM32 Espruino Boards.</p>
  * <p>Please see <a href="http://www.espruino.com/Power+Consumption">http://www.espruino.com/Power+Consumption</a> for more details on this.</p>
  * 
  * @param sleep 
  * @url http://www.espruino.com/Reference#l__global_setDeepSleep
  */
  def apply(sleep: Boolean): Unit = js.native
}

