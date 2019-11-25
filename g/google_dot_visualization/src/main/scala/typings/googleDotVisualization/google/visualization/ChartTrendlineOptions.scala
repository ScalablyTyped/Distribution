package typings.googleDotVisualization.google.visualization

import typings.googleDotVisualization.googleDotVisualizationStrings.exponential
import typings.googleDotVisualization.googleDotVisualizationStrings.linear
import typings.googleDotVisualization.googleDotVisualizationStrings.polynomial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartTrendlineOptions extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var degree: js.UndefOr[Double] = js.undefined
  var labelInLegend: js.UndefOr[String] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var pointSize: js.UndefOr[Double] = js.undefined
  var pointsVisible: js.UndefOr[Boolean] = js.undefined
  var showR2: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[linear | exponential | polynomial] = js.undefined
  var visibleInLegend: js.UndefOr[Boolean] = js.undefined
}

object ChartTrendlineOptions {
  @scala.inline
  def apply(
    color: String = null,
    degree: Int | Double = null,
    labelInLegend: String = null,
    lineWidth: Int | Double = null,
    opacity: Int | Double = null,
    pointSize: Int | Double = null,
    pointsVisible: js.UndefOr[Boolean] = js.undefined,
    showR2: js.UndefOr[Boolean] = js.undefined,
    `type`: linear | exponential | polynomial = null,
    visibleInLegend: js.UndefOr[Boolean] = js.undefined
  ): ChartTrendlineOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (degree != null) __obj.updateDynamic("degree")(degree.asInstanceOf[js.Any])
    if (labelInLegend != null) __obj.updateDynamic("labelInLegend")(labelInLegend.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (!js.isUndefined(pointsVisible)) __obj.updateDynamic("pointsVisible")(pointsVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(showR2)) __obj.updateDynamic("showR2")(showR2.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleInLegend)) __obj.updateDynamic("visibleInLegend")(visibleInLegend.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTrendlineOptions]
  }
}

