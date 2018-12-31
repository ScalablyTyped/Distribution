package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonSeriesOptionsTrendline extends js.Object {
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
  /** Specifies the intercept value of the trendlines.
    * @Default {null}
    */
  var intercept: js.UndefOr[scala.Double] = js.undefined
  /** Name for the trendlines that is to be displayed in the legend text.
    * @Default {trendline}
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Opacity of the trendline.
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the moving average starting period value.
    * @Default {2}
    */
  var period: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the order of the polynomial trendlines.
    * @Default {0}
    */
  var polynomialOrder: js.UndefOr[scala.Double] = js.undefined
  /** Options for customizing the tooltip of the trendlines in the chart.
    */
  var tooltip: js.UndefOr[CommonSeriesOptionsTrendlinesTooltip] = js.undefined
  /** Specifies the type of the trendline for the series.
    * @Default {linear. See TrendlinesType}
    */
  var `type`: js.UndefOr[TrendlinesType | java.lang.String] = js.undefined
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

