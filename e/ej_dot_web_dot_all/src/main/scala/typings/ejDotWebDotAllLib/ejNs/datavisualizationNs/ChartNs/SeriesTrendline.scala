package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesTrendline extends js.Object {
  /** Past trends of the current series.
    * @Default {0}
    */
  var backwardForecast: js.UndefOr[scala.Double] = js.undefined
  /** Pattern of dashes and gaps used to stroke the trendline.
    */
  var dashArray: js.UndefOr[java.lang.String] = js.undefined
  /** Fill color of the trendlines.
    * @Default {#0000FF}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Future trends of the current series.
    * @Default {0}
    */
  var forwardForecast: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the trendline intercept value
    * @Default {null}
    */
  var intercept: js.UndefOr[scala.Double] = js.undefined
  /** Name for the trendlines that is to be displayed in legend text.
    * @Default {Trendline}
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Opacity of the trendline.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the moving average starting period  value.
    * @Default {2}
    */
  var period: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the order of polynomial trendlines.
    * @Default {0}
    */
  var polynomialOrder: js.UndefOr[scala.Double] = js.undefined
  /** Options for customizing the trendline tooltip
    */
  var tooltip: js.UndefOr[SeriesTrendlinesTooltip] = js.undefined
  /** Specifies the type of trendline for the series.
    * @Default {linear. See TrendlinesType}
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Show/hides the trendline.
    */
  var visibility: js.UndefOr[scala.Boolean] = js.undefined
  /** Show/hides the trendline legend.
    * @Default {visible}
    */
  var visibleOnLegend: js.UndefOr[java.lang.String] = js.undefined
  /** Width of the trendlines.
    * @Default {1}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SeriesTrendline {
  @scala.inline
  def apply(
    backwardForecast: scala.Int | scala.Double = null,
    dashArray: java.lang.String = null,
    fill: java.lang.String = null,
    forwardForecast: scala.Int | scala.Double = null,
    intercept: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    period: scala.Int | scala.Double = null,
    polynomialOrder: scala.Int | scala.Double = null,
    tooltip: SeriesTrendlinesTooltip = null,
    `type`: java.lang.String = null,
    visibility: js.UndefOr[scala.Boolean] = js.undefined,
    visibleOnLegend: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): SeriesTrendline = {
    val __obj = js.Dynamic.literal()
    if (backwardForecast != null) __obj.updateDynamic("backwardForecast")(backwardForecast.asInstanceOf[js.Any])
    if (dashArray != null) __obj.updateDynamic("dashArray")(dashArray)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (forwardForecast != null) __obj.updateDynamic("forwardForecast")(forwardForecast.asInstanceOf[js.Any])
    if (intercept != null) __obj.updateDynamic("intercept")(intercept.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (polynomialOrder != null) __obj.updateDynamic("polynomialOrder")(polynomialOrder.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visibility)) __obj.updateDynamic("visibility")(visibility)
    if (visibleOnLegend != null) __obj.updateDynamic("visibleOnLegend")(visibleOnLegend)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesTrendline]
  }
}

