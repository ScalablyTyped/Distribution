package typings.googleDotVisualization.google.visualization

import typings.googleDotVisualization.Anon_CellColor
import typings.googleDotVisualization.Anon_Colors
import typings.googleDotVisualization.Anon_IsHtml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarOptions extends js.Object {
  var calendar: Anon_CellColor
  var colorAxis: js.UndefOr[Anon_Colors] = js.undefined
  var forceIFrame: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var noDataPattern: js.UndefOr[js.Object] = js.undefined
  var tooltip: Anon_IsHtml
  var width: js.UndefOr[Double] = js.undefined
}

object CalendarOptions {
  @scala.inline
  def apply(
    calendar: Anon_CellColor,
    tooltip: Anon_IsHtml,
    colorAxis: Anon_Colors = null,
    forceIFrame: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    noDataPattern: js.Object = null,
    width: Int | Double = null
  ): CalendarOptions = {
    val __obj = js.Dynamic.literal(calendar = calendar, tooltip = tooltip)
    if (colorAxis != null) __obj.updateDynamic("colorAxis")(colorAxis)
    if (!js.isUndefined(forceIFrame)) __obj.updateDynamic("forceIFrame")(forceIFrame)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (noDataPattern != null) __obj.updateDynamic("noDataPattern")(noDataPattern)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarOptions]
  }
}

