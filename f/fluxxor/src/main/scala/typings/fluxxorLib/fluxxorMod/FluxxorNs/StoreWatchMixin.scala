package typings
package fluxxorLib.fluxxorMod.FluxxorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreWatchMixin[StoreState] extends js.Object {
  def getStateFromFlux(): StoreState
}

object StoreWatchMixin {
  @scala.inline
  def apply[StoreState](getStateFromFlux: js.Function0[StoreState]): StoreWatchMixin[StoreState] = {
    val __obj = js.Dynamic.literal(getStateFromFlux = getStateFromFlux)
  
    __obj.asInstanceOf[StoreWatchMixin[StoreState]]
  }
}

