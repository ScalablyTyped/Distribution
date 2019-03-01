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

object Indicator {
  @scala.inline
  def apply(
    animationDuration: js.UndefOr[scala.Boolean] = js.undefined,
    dPeriod: scala.Int | scala.Double = null,
    enableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    fill: java.lang.String = null,
    histogram: IndicatorsHistogram = null,
    kPeriod: scala.Int | scala.Double = null,
    longPeriod: scala.Int | scala.Double = null,
    lowerLine: IndicatorsLowerLine = null,
    macdLine: IndicatorsMacdLine = null,
    macdType: java.lang.String = null,
    period: scala.Int | scala.Double = null,
    periodLine: IndicatorsPeriodLine = null,
    seriesName: java.lang.String = null,
    shortPeriod: scala.Int | scala.Double = null,
    standardDeviations: scala.Int | scala.Double = null,
    tooltip: IndicatorsTooltip = null,
    trigger: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    upperLine: IndicatorsUpperLine = null,
    visibility: java.lang.String = null,
    width: scala.Int | scala.Double = null,
    xAxisName: java.lang.String = null,
    yAxisName: java.lang.String = null
  ): Indicator = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration)
    if (dPeriod != null) __obj.updateDynamic("dPeriod")(dPeriod.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (histogram != null) __obj.updateDynamic("histogram")(histogram)
    if (kPeriod != null) __obj.updateDynamic("kPeriod")(kPeriod.asInstanceOf[js.Any])
    if (longPeriod != null) __obj.updateDynamic("longPeriod")(longPeriod.asInstanceOf[js.Any])
    if (lowerLine != null) __obj.updateDynamic("lowerLine")(lowerLine)
    if (macdLine != null) __obj.updateDynamic("macdLine")(macdLine)
    if (macdType != null) __obj.updateDynamic("macdType")(macdType)
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (periodLine != null) __obj.updateDynamic("periodLine")(periodLine)
    if (seriesName != null) __obj.updateDynamic("seriesName")(seriesName)
    if (shortPeriod != null) __obj.updateDynamic("shortPeriod")(shortPeriod.asInstanceOf[js.Any])
    if (standardDeviations != null) __obj.updateDynamic("standardDeviations")(standardDeviations.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (upperLine != null) __obj.updateDynamic("upperLine")(upperLine)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xAxisName != null) __obj.updateDynamic("xAxisName")(xAxisName)
    if (yAxisName != null) __obj.updateDynamic("yAxisName")(yAxisName)
    __obj.asInstanceOf[Indicator]
  }
}

