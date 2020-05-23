package typings.falcorRouter.mod

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
    maxPaths: js.UndefOr[Double] = js.undefined,
    maxRefFollow: js.UndefOr[Double] = js.undefined
  ): RouterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPaths)) __obj.updateDynamic("maxPaths")(maxPaths.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRefFollow)) __obj.updateDynamic("maxRefFollow")(maxRefFollow.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterOptions]
  }
}

