package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Indicator extends js.Object {
  /** Specifies animation duration for indicator rendering.
               * @Default {null}
               */
  var animationDuration: js.UndefOr[scala.Boolean] = js.undefined
  /** The dPeriod value for stochastic indicator.
               * @Default {3}
               */
  var dPeriod: js.UndefOr[scala.Double] = js.undefined
  /** Enables/disables the animation.
               * @Default {false}
               */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Color of the technical indicator.
               * @Default {#00008B}
               */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Options to customize the histogram in MACD indicator.
               */
  var histogram: js.UndefOr[IndicatorsHistogram] = js.undefined
  /** Specifies the k period in stochastic indicator.
               * @Default {3}
               */
  var kPeriod: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the long period in MACD indicator.
               * @Default {26}
               */
  var longPeriod: js.UndefOr[scala.Double] = js.undefined
  /** Options to customize the lower line in indicators.
               */
  var lowerLine: js.UndefOr[IndicatorsLowerLine] = js.undefined
  /** Options to customize the MACD line.
               */
  var macdLine: js.UndefOr[IndicatorsMacdLine] = js.undefined
  /** Specifies the type of the MACD indicator.
               * @Default {line. See MACDType}
               */
  var macdType: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies period value in indicator.
               * @Default {14}
               */
  var period: js.UndefOr[scala.Double] = js.undefined
  /** Options to customize the period line in indicators.
               */
  var periodLine: js.UndefOr[IndicatorsPeriodLine] = js.undefined
  /** Name of the series for which indicator has to be drawn.
               */
  var seriesName: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the short period in MACD indicator.
               * @Default {13}
               */
  var shortPeriod: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the standard deviation value for Bollinger band indicator.
               * @Default {2}
               */
  var standardDeviations: js.UndefOr[scala.Double] = js.undefined
  /** Options to customize the tooltip.
               */
  var tooltip: js.UndefOr[IndicatorsTooltip] = js.undefined
  /** Trigger value of MACD indicator.
               * @Default {9}
               */
  var trigger: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the type of indicator that has to be rendered.
               * @Default {sma. See IndicatorsType}
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Options to customize the upper line in indicators
               */
  var upperLine: js.UndefOr[IndicatorsUpperLine] = js.undefined
  /** Specifies the visibility of indicator.
               * @Default {visible}
               */
  var visibility: js.UndefOr[java.lang.String] = js.undefined
  /** Width of the indicator line.
               * @Default {2}
               */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** Name of the horizontal axis used for indicator. Primary X axis is used when x axis name is not specified.
               */
  var xAxisName: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the vertical axis used for indicator. Primary Y axis is used when y axis name is not specified
               */
  var yAxisName: js.UndefOr[java.lang.String] = js.undefined
}

