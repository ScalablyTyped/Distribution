package typings.easyDashXapiDashSupertest.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InspectOptions extends js.Object {
  var colors: js.UndefOr[Boolean] = js.undefined
  var customInspect: js.UndefOr[Boolean] = js.undefined
  var depth: js.UndefOr[Double] = js.undefined
  var showHidden: js.UndefOr[Boolean] = js.undefined
}

object InspectOptions {
  @scala.inline
  def apply(
    colors: js.UndefOr[Boolean] = js.undefined,
    customInspect: js.UndefOr[Boolean] = js.undefined,
    depth: Int | Double = null,
    showHidden: js.UndefOr[Boolean] = js.undefined
  ): InspectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(customInspect)) __obj.updateDynamic("customInspect")(customInspect.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(showHidden)) __obj.updateDynamic("showHidden")(showHidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectOptions]
  }
}

