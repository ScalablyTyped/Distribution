package typings.falcorDashRouter.falcorDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterOptions extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var maxPaths: js.UndefOr[Double] = js.undefined
  var maxRefFollow: js.UndefOr[Double] = js.undefined
}

object RouterOptions {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    maxPaths: Int | Double = null,
    maxRefFollow: Int | Double = null
  ): RouterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (maxPaths != null) __obj.updateDynamic("maxPaths")(maxPaths.asInstanceOf[js.Any])
    if (maxRefFollow != null) __obj.updateDynamic("maxRefFollow")(maxRefFollow.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterOptions]
  }
}

