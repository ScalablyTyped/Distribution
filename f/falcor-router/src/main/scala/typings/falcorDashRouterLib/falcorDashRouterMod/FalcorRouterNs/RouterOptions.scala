package typings
package falcorDashRouterLib.falcorDashRouterMod.FalcorRouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterOptions extends js.Object {
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var maxPaths: js.UndefOr[scala.Double] = js.undefined
  var maxRefFollow: js.UndefOr[scala.Double] = js.undefined
}

object RouterOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    maxPaths: scala.Int | scala.Double = null,
    maxRefFollow: scala.Int | scala.Double = null
  ): RouterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (maxPaths != null) __obj.updateDynamic("maxPaths")(maxPaths.asInstanceOf[js.Any])
    if (maxRefFollow != null) __obj.updateDynamic("maxRefFollow")(maxRefFollow.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterOptions]
  }
}

