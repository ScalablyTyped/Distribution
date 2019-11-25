package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartTooltip extends js.Object {
  var ignoreBounds: js.UndefOr[Boolean] = js.undefined
  var isHtml: js.UndefOr[Boolean] = js.undefined
  var showColorCode: js.UndefOr[Boolean] = js.undefined
  var textStyle: js.UndefOr[ChartTextStyle] = js.undefined
  var trigger: js.UndefOr[String] = js.undefined
}

object ChartTooltip {
  @scala.inline
  def apply(
    ignoreBounds: js.UndefOr[Boolean] = js.undefined,
    isHtml: js.UndefOr[Boolean] = js.undefined,
    showColorCode: js.UndefOr[Boolean] = js.undefined,
    textStyle: ChartTextStyle = null,
    trigger: String = null
  ): ChartTooltip = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreBounds)) __obj.updateDynamic("ignoreBounds")(ignoreBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(isHtml)) __obj.updateDynamic("isHtml")(isHtml.asInstanceOf[js.Any])
    if (!js.isUndefined(showColorCode)) __obj.updateDynamic("showColorCode")(showColorCode.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTooltip]
  }
}

