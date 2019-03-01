package typings
package expressDashWsLib.expressDashWsMod.expressWsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var leaveRouterUntouched: js.UndefOr[scala.Boolean] = js.undefined
  var wsOptions: js.UndefOr[wsLib.wsMod.WebSocketNs.ServerOptions] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    leaveRouterUntouched: js.UndefOr[scala.Boolean] = js.undefined,
    wsOptions: wsLib.wsMod.WebSocketNs.ServerOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leaveRouterUntouched)) __obj.updateDynamic("leaveRouterUntouched")(leaveRouterUntouched)
    if (wsOptions != null) __obj.updateDynamic("wsOptions")(wsOptions)
    __obj.asInstanceOf[Options]
  }
}

