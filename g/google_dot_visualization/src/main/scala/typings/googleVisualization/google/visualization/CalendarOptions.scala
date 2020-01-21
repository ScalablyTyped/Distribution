package typings.googleVisualization.google.visualization

import typings.googleVisualization.AnonCellColor
import typings.googleVisualization.AnonColors
import typings.googleVisualization.AnonIsHtml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarOptions extends js.Object {
  var calendar: AnonCellColor
  var colorAxis: js.UndefOr[AnonColors] = js.undefined
  var forceIFrame: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var noDataPattern: js.UndefOr[js.Object] = js.undefined
  var tooltip: AnonIsHtml
  var width: js.UndefOr[Double] = js.undefined
}

object CalendarOptions {
  @scala.inline
  def apply(
    calendar: AnonCellColor,
    tooltip: AnonIsHtml,
    colorAxis: AnonColors = null,
    forceIFrame: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    noDataPattern: js.Object = null,
    width: Int | Double = null
  ): CalendarOptions = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    if (colorAxis != null) __obj.updateDynamic("colorAxis")(colorAxis.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIFrame)) __obj.updateDynamic("forceIFrame")(forceIFrame.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (noDataPattern != null) __obj.updateDynamic("noDataPattern")(noDataPattern.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarOptions]
  }
}

