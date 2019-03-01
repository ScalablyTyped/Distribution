package typings
package easyDashXDashHeadersLib.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InspectOptions extends js.Object {
  var colors: js.UndefOr[scala.Boolean] = js.undefined
  var customInspect: js.UndefOr[scala.Boolean] = js.undefined
  var depth: js.UndefOr[scala.Double] = js.undefined
  var showHidden: js.UndefOr[scala.Boolean] = js.undefined
}

object InspectOptions {
  @scala.inline
  def apply(
    colors: js.UndefOr[scala.Boolean] = js.undefined,
    customInspect: js.UndefOr[scala.Boolean] = js.undefined,
    depth: scala.Int | scala.Double = null,
    showHidden: js.UndefOr[scala.Boolean] = js.undefined
  ): InspectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors)
    if (!js.isUndefined(customInspect)) __obj.updateDynamic("customInspect")(customInspect)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(showHidden)) __obj.updateDynamic("showHidden")(showHidden)
    __obj.asInstanceOf[InspectOptions]
  }
}

