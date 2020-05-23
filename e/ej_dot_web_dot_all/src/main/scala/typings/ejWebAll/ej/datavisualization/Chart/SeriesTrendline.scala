package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesTrendline extends js.Object {
  /** Past trends of the current series.
    * @Default {0}
    */
  var backwardForecast: js.UndefOr[Double] = js.undefined
  /** Pattern of dashes and gaps used to stroke the trendline.
    */
  var dashArray: js.UndefOr[String] = js.undefined
  /** Fill color of the trendlines.
    * @Default {#0000FF}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Future trends of the current series.
    * @Default {0}
    */
  var forwardForecast: js.UndefOr[Double] = js.undefined
  /** Specifies the trendline intercept value
    * @Default {null}
    */
  var intercept: js.UndefOr[Double] = js.undefined
  /** Name for the trendlines that is to be displayed in legend text.
    * @Default {Trendline}
    */
  var name: js.UndefOr[String] = js.undefined
  /** Opacity of the trendline.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /** Specifies the moving average starting period  value.
    * @Default {2}
    */
  var period: js.UndefOr[Double] = js.undefined
  /** Specifies the order of polynomial trendlines.
    * @Default {0}
    */
  var polynomialOrder: js.UndefOr[Double] = js.undefined
  /** Options for customizing the trendline tooltip
    */
  var tooltip: js.UndefOr[SeriesTrendlinesTooltip] = js.undefined
  /** Specifies the type of trendline for the series.
    * @Default {linear. See TrendlinesType}
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** Show/hides the trendline.
    */
  var visibility: js.UndefOr[Boolean] = js.undefined
  /** Show/hides the trendline legend.
    * @Default {visible}
    */
  var visibleOnLegend: js.UndefOr[String] = js.undefined
  /** Width of the trendlines.
    * @Default {1}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object SeriesTrendline {
  @scala.inline
  def apply(
    backwardForecast: js.UndefOr[Double] = js.undefined,
    dashArray: String = null,
    fill: String = null,
    forwardForecast: js.UndefOr[Double] = js.undefined,
    intercept: js.UndefOr[Double] = js.undefined,
    name: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    period: js.UndefOr[Double] = js.undefined,
    polynomialOrder: js.UndefOr[Double] = js.undefined,
    tooltip: SeriesTrendlinesTooltip = null,
    `type`: String = null,
    visibility: js.UndefOr[Boolean] = js.undefined,
    visibleOnLegend: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): SeriesTrendline = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backwardForecast)) __obj.updateDynamic("backwardForecast")(backwardForecast.get.asInstanceOf[js.Any])
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(forwardForecast)) __obj.updateDynamic("forwardForecast")(forwardForecast.get.asInstanceOf[js.Any])
    if (!js.isUndefined(intercept)) __obj.updateDynamic("intercept")(intercept.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    if (!js.isUndefined(polynomialOrder)) __obj.updateDynamic("polynomialOrder")(polynomialOrder.get.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visibility)) __obj.updateDynamic("visibility")(visibility.get.asInstanceOf[js.Any])
    if (visibleOnLegend != null) __obj.updateDynamic("visibleOnLegend")(visibleOnLegend.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesTrendline]
  }
}

