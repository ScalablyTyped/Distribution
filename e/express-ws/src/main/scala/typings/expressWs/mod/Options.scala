package typings.expressWs.mod

import typings.ws.mod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var leaveRouterUntouched: js.UndefOr[Boolean] = js.undefined
  var wsOptions: js.UndefOr[ServerOptions] = js.undefined
}

object Options {
  @scala.inline
  def apply(leaveRouterUntouched: js.UndefOr[Boolean] = js.undefined, wsOptions: ServerOptions = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(leaveRouterUntouched)) __obj.updateDynamic("leaveRouterUntouched")(leaveRouterUntouched.get.asInstanceOf[js.Any])
    if (wsOptions != null) __obj.updateDynamic("wsOptions")(wsOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

