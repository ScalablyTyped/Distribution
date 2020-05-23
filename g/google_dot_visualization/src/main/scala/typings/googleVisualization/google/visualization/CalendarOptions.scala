package typings.googleVisualization.google.visualization

import typings.googleVisualization.anon.CellColor
import typings.googleVisualization.anon.Colors
import typings.googleVisualization.anon.IsHtml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarOptions extends js.Object {
  var calendar: CellColor
  var colorAxis: js.UndefOr[Colors] = js.undefined
  var forceIFrame: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var noDataPattern: js.UndefOr[js.Object] = js.undefined
  var tooltip: IsHtml
  var width: js.UndefOr[Double] = js.undefined
}

object CalendarOptions {
  @scala.inline
  def apply(
    calendar: CellColor,
    tooltip: IsHtml,
    colorAxis: Colors = null,
    forceIFrame: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    noDataPattern: js.Object = null,
    width: js.UndefOr[Double] = js.undefined
  ): CalendarOptions = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    if (colorAxis != null) __obj.updateDynamic("colorAxis")(colorAxis.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIFrame)) __obj.updateDynamic("forceIFrame")(forceIFrame.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (noDataPattern != null) __obj.updateDynamic("noDataPattern")(noDataPattern.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarOptions]
  }
}

