package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarOptions extends js.Object {
  var calendar: googleDotVisualizationLib.Anon_CellColor
  var colorAxis: js.UndefOr[googleDotVisualizationLib.Anon_Colors] = js.undefined
  var forceIFrame: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var noDataPattern: js.UndefOr[js.Object] = js.undefined
  var tooltip: googleDotVisualizationLib.Anon_IsHtml
  var width: js.UndefOr[scala.Double] = js.undefined
}

object CalendarOptions {
  @scala.inline
  def apply(
    calendar: googleDotVisualizationLib.Anon_CellColor,
    tooltip: googleDotVisualizationLib.Anon_IsHtml,
    colorAxis: googleDotVisualizationLib.Anon_Colors = null,
    forceIFrame: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    noDataPattern: js.Object = null,
    width: scala.Int | scala.Double = null
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

