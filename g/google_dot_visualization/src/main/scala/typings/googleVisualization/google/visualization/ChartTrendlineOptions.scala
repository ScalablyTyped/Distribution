package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.exponential
import typings.googleVisualization.googleVisualizationStrings.linear
import typings.googleVisualization.googleVisualizationStrings.polynomial
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
    degree: js.UndefOr[Double] = js.undefined,
    labelInLegend: String = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    pointSize: js.UndefOr[Double] = js.undefined,
    pointsVisible: js.UndefOr[Boolean] = js.undefined,
    showR2: js.UndefOr[Boolean] = js.undefined,
    `type`: linear | exponential | polynomial = null,
    visibleInLegend: js.UndefOr[Boolean] = js.undefined
  ): ChartTrendlineOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(degree)) __obj.updateDynamic("degree")(degree.get.asInstanceOf[js.Any])
    if (labelInLegend != null) __obj.updateDynamic("labelInLegend")(labelInLegend.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pointSize)) __obj.updateDynamic("pointSize")(pointSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pointsVisible)) __obj.updateDynamic("pointsVisible")(pointsVisible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showR2)) __obj.updateDynamic("showR2")(showR2.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleInLegend)) __obj.updateDynamic("visibleInLegend")(visibleInLegend.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTrendlineOptions]
  }
}

