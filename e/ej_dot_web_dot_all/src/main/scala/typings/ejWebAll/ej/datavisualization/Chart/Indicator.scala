package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indicator extends js.Object {
  /** Specifies animation duration for indicator rendering.
    * @Default {null}
    */
  var animationDuration: js.UndefOr[Boolean] = js.undefined
  /** The dPeriod value for stochastic indicator.
    * @Default {3}
    */
  var dPeriod: js.UndefOr[Double] = js.undefined
  /** Enables/disables the animation.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Color of the technical indicator.
    * @Default {#00008B}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Options to customize the histogram in MACD indicator.
    */
  var histogram: js.UndefOr[IndicatorsHistogram] = js.undefined
  /** Specifies the k period in stochastic indicator.
    * @Default {3}
    */
  var kPeriod: js.UndefOr[Double] = js.undefined
  /** Specifies the long period in MACD indicator.
    * @Default {26}
    */
  var longPeriod: js.UndefOr[Double] = js.undefined
  /** Options to customize the lower line in indicators.
    */
  var lowerLine: js.UndefOr[IndicatorsLowerLine] = js.undefined
  /** Options to customize the MACD line.
    */
  var macdLine: js.UndefOr[IndicatorsMacdLine] = js.undefined
  /** Specifies the type of the MACD indicator.
    * @Default {line. See MACDType}
    */
  var macdType: js.UndefOr[String] = js.undefined
  /** Specifies period value in indicator.
    * @Default {14}
    */
  var period: js.UndefOr[Double] = js.undefined
  /** Options to customize the period line in indicators.
    */
  var periodLine: js.UndefOr[IndicatorsPeriodLine] = js.undefined
  /** Name of the series for which indicator has to be drawn.
    */
  var seriesName: js.UndefOr[String] = js.undefined
  /** Specifies the short period in MACD indicator.
    * @Default {13}
    */
  var shortPeriod: js.UndefOr[Double] = js.undefined
  /** Specifies the standard deviation value for Bollinger band indicator.
    * @Default {2}
    */
  var standardDeviations: js.UndefOr[Double] = js.undefined
  /** Options to customize the tooltip.
    */
  var tooltip: js.UndefOr[IndicatorsTooltip] = js.undefined
  /** Trigger value of MACD indicator.
    * @Default {9}
    */
  var trigger: js.UndefOr[Double] = js.undefined
  /** Specifies the type of indicator that has to be rendered.
    * @Default {sma. See IndicatorsType}
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** Options to customize the upper line in indicators
    */
  var upperLine: js.UndefOr[IndicatorsUpperLine] = js.undefined
  /** Specifies the visibility of indicator.
    * @Default {visible}
    */
  var visibility: js.UndefOr[String] = js.undefined
  /** Width of the indicator line.
    * @Default {2}
    */
  var width: js.UndefOr[Double] = js.undefined
  /** Name of the horizontal axis used for indicator. Primary X axis is used when x axis name is not specified.
    */
  var xAxisName: js.UndefOr[String] = js.undefined
  /** Name of the vertical axis used for indicator. Primary Y axis is used when y axis name is not specified
    */
  var yAxisName: js.UndefOr[String] = js.undefined
}

object Indicator {
  @scala.inline
  def apply(
    animationDuration: js.UndefOr[Boolean] = js.undefined,
    dPeriod: js.UndefOr[Double] = js.undefined,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    fill: String = null,
    histogram: IndicatorsHistogram = null,
    kPeriod: js.UndefOr[Double] = js.undefined,
    longPeriod: js.UndefOr[Double] = js.undefined,
    lowerLine: IndicatorsLowerLine = null,
    macdLine: IndicatorsMacdLine = null,
    macdType: String = null,
    period: js.UndefOr[Double] = js.undefined,
    periodLine: IndicatorsPeriodLine = null,
    seriesName: String = null,
    shortPeriod: js.UndefOr[Double] = js.undefined,
    standardDeviations: js.UndefOr[Double] = js.undefined,
    tooltip: IndicatorsTooltip = null,
    trigger: js.UndefOr[Double] = js.undefined,
    `type`: String = null,
    upperLine: IndicatorsUpperLine = null,
    visibility: String = null,
    width: js.UndefOr[Double] = js.undefined,
    xAxisName: String = null,
    yAxisName: String = null
  ): Indicator = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dPeriod)) __obj.updateDynamic("dPeriod")(dPeriod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation.get.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (histogram != null) __obj.updateDynamic("histogram")(histogram.asInstanceOf[js.Any])
    if (!js.isUndefined(kPeriod)) __obj.updateDynamic("kPeriod")(kPeriod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(longPeriod)) __obj.updateDynamic("longPeriod")(longPeriod.get.asInstanceOf[js.Any])
    if (lowerLine != null) __obj.updateDynamic("lowerLine")(lowerLine.asInstanceOf[js.Any])
    if (macdLine != null) __obj.updateDynamic("macdLine")(macdLine.asInstanceOf[js.Any])
    if (macdType != null) __obj.updateDynamic("macdType")(macdType.asInstanceOf[js.Any])
    if (!js.isUndefined(period)) __obj.updateDynamic("period")(period.get.asInstanceOf[js.Any])
    if (periodLine != null) __obj.updateDynamic("periodLine")(periodLine.asInstanceOf[js.Any])
    if (seriesName != null) __obj.updateDynamic("seriesName")(seriesName.asInstanceOf[js.Any])
    if (!js.isUndefined(shortPeriod)) __obj.updateDynamic("shortPeriod")(shortPeriod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(standardDeviations)) __obj.updateDynamic("standardDeviations")(standardDeviations.get.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (!js.isUndefined(trigger)) __obj.updateDynamic("trigger")(trigger.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (upperLine != null) __obj.updateDynamic("upperLine")(upperLine.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (xAxisName != null) __obj.updateDynamic("xAxisName")(xAxisName.asInstanceOf[js.Any])
    if (yAxisName != null) __obj.updateDynamic("yAxisName")(yAxisName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indicator]
  }
}

