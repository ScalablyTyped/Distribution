package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartTooltip extends js.Object {
  var ignoreBounds: js.UndefOr[scala.Boolean] = js.undefined
  var isHtml: js.UndefOr[scala.Boolean] = js.undefined
  var showColorCode: js.UndefOr[scala.Boolean] = js.undefined
  var textStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var trigger: js.UndefOr[java.lang.String] = js.undefined
}

object ChartTooltip {
  @scala.inline
  def apply(
    ignoreBounds: js.UndefOr[scala.Boolean] = js.undefined,
    isHtml: js.UndefOr[scala.Boolean] = js.undefined,
    showColorCode: js.UndefOr[scala.Boolean] = js.undefined,
    textStyle: ChartTextStyle = null,
    trigger: java.lang.String = null
  ): ChartTooltip = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreBounds)) __obj.updateDynamic("ignoreBounds")(ignoreBounds)
    if (!js.isUndefined(isHtml)) __obj.updateDynamic("isHtml")(isHtml)
    if (!js.isUndefined(showColorCode)) __obj.updateDynamic("showColorCode")(showColorCode)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    __obj.asInstanceOf[ChartTooltip]
  }
}

