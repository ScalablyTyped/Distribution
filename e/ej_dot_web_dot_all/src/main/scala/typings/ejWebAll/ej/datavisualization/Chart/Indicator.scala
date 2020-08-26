package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Indicator extends js.Object {
  /** Specifies animation duration for indicator rendering.
    * @Default {null}
    */
  var animationDuration: js.UndefOr[Boolean] = js.native
  /** The dPeriod value for stochastic indicator.
    * @Default {3}
    */
  var dPeriod: js.UndefOr[Double] = js.native
  /** Enables/disables the animation.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.native
  /** Color of the technical indicator.
    * @Default {#00008B}
    */
  var fill: js.UndefOr[String] = js.native
  /** Options to customize the histogram in MACD indicator.
    */
  var histogram: js.UndefOr[IndicatorsHistogram] = js.native
  /** Specifies the k period in stochastic indicator.
    * @Default {3}
    */
  var kPeriod: js.UndefOr[Double] = js.native
  /** Specifies the long period in MACD indicator.
    * @Default {26}
    */
  var longPeriod: js.UndefOr[Double] = js.native
  /** Options to customize the lower line in indicators.
    */
  var lowerLine: js.UndefOr[IndicatorsLowerLine] = js.native
  /** Options to customize the MACD line.
    */
  var macdLine: js.UndefOr[IndicatorsMacdLine] = js.native
  /** Specifies the type of the MACD indicator.
    * @Default {line. See MACDType}
    */
  var macdType: js.UndefOr[String] = js.native
  /** Specifies period value in indicator.
    * @Default {14}
    */
  var period: js.UndefOr[Double] = js.native
  /** Options to customize the period line in indicators.
    */
  var periodLine: js.UndefOr[IndicatorsPeriodLine] = js.native
  /** Name of the series for which indicator has to be drawn.
    */
  var seriesName: js.UndefOr[String] = js.native
  /** Specifies the short period in MACD indicator.
    * @Default {13}
    */
  var shortPeriod: js.UndefOr[Double] = js.native
  /** Specifies the standard deviation value for Bollinger band indicator.
    * @Default {2}
    */
  var standardDeviations: js.UndefOr[Double] = js.native
  /** Options to customize the tooltip.
    */
  var tooltip: js.UndefOr[IndicatorsTooltip] = js.native
  /** Trigger value of MACD indicator.
    * @Default {9}
    */
  var trigger: js.UndefOr[Double] = js.native
  /** Specifies the type of indicator that has to be rendered.
    * @Default {sma. See IndicatorsType}
    */
  var `type`: js.UndefOr[String] = js.native
  /** Options to customize the upper line in indicators
    */
  var upperLine: js.UndefOr[IndicatorsUpperLine] = js.native
  /** Specifies the visibility of indicator.
    * @Default {visible}
    */
  var visibility: js.UndefOr[String] = js.native
  /** Width of the indicator line.
    * @Default {2}
    */
  var width: js.UndefOr[Double] = js.native
  /** Name of the horizontal axis used for indicator. Primary X axis is used when x axis name is not specified.
    */
  var xAxisName: js.UndefOr[String] = js.native
  /** Name of the vertical axis used for indicator. Primary Y axis is used when y axis name is not specified
    */
  var yAxisName: js.UndefOr[String] = js.native
}

object Indicator {
  @scala.inline
  def apply(): Indicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Indicator]
  }
  @scala.inline
  implicit class IndicatorOps[Self <: Indicator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimationDuration(value: Boolean): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setDPeriod(value: Double): Self = this.set("dPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDPeriod: Self = this.set("dPeriod", js.undefined)
    @scala.inline
    def setEnableAnimation(value: Boolean): Self = this.set("enableAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAnimation: Self = this.set("enableAnimation", js.undefined)
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setHistogram(value: IndicatorsHistogram): Self = this.set("histogram", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistogram: Self = this.set("histogram", js.undefined)
    @scala.inline
    def setKPeriod(value: Double): Self = this.set("kPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKPeriod: Self = this.set("kPeriod", js.undefined)
    @scala.inline
    def setLongPeriod(value: Double): Self = this.set("longPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongPeriod: Self = this.set("longPeriod", js.undefined)
    @scala.inline
    def setLowerLine(value: IndicatorsLowerLine): Self = this.set("lowerLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowerLine: Self = this.set("lowerLine", js.undefined)
    @scala.inline
    def setMacdLine(value: IndicatorsMacdLine): Self = this.set("macdLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMacdLine: Self = this.set("macdLine", js.undefined)
    @scala.inline
    def setMacdType(value: String): Self = this.set("macdType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMacdType: Self = this.set("macdType", js.undefined)
    @scala.inline
    def setPeriod(value: Double): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setPeriodLine(value: IndicatorsPeriodLine): Self = this.set("periodLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriodLine: Self = this.set("periodLine", js.undefined)
    @scala.inline
    def setSeriesName(value: String): Self = this.set("seriesName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesName: Self = this.set("seriesName", js.undefined)
    @scala.inline
    def setShortPeriod(value: Double): Self = this.set("shortPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortPeriod: Self = this.set("shortPeriod", js.undefined)
    @scala.inline
    def setStandardDeviations(value: Double): Self = this.set("standardDeviations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardDeviations: Self = this.set("standardDeviations", js.undefined)
    @scala.inline
    def setTooltip(value: IndicatorsTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTrigger(value: Double): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUpperLine(value: IndicatorsUpperLine): Self = this.set("upperLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpperLine: Self = this.set("upperLine", js.undefined)
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setXAxisName(value: String): Self = this.set("xAxisName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxisName: Self = this.set("xAxisName", js.undefined)
    @scala.inline
    def setYAxisName(value: String): Self = this.set("yAxisName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxisName: Self = this.set("yAxisName", js.undefined)
  }
  
}

