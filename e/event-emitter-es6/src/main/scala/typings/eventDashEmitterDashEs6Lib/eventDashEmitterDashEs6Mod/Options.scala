package typings
package eventDashEmitterDashEs6Lib.eventDashEmitterDashEs6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var emitDelay: js.UndefOr[scala.Double] = js.undefined
  var strictMode: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(emitDelay: scala.Int | scala.Double = null, strictMode: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (emitDelay != null) __obj.updateDynamic("emitDelay")(emitDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(strictMode)) __obj.updateDynamic("strictMode")(strictMode)
    __obj.asInstanceOf[Options]
  }
}

