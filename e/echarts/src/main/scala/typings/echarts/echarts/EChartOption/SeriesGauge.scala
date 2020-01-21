package typings.echarts.echarts.EChartOption

import typings.echarts.AnonAnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdate
import typings.echarts.AnonAnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasing
import typings.echarts.AnonAnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasingAnimationEasingUpdate
import typings.echarts.AnonBackgroundColorBorderColor
import typings.echarts.AnonBackgroundColorBorderColorBorderRadius
import typings.echarts.AnonBackgroundColorBorderColorBorderRadiusBorderWidth
import typings.echarts.AnonBackgroundColorBorderColorBorderRadiusBorderWidthColor
import typings.echarts.AnonBorderColorBorderType
import typings.echarts.AnonItemStyleAnonBorderColorBorderType
import typings.echarts.AnonLength
import typings.echarts.AnonLengthLineStyle
import typings.echarts.AnonLengthShow
import typings.echarts.AnonLineStyleShowAnonColorOpacityShadowBlurShadowColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **Gauge chart**
  *
  * **Example:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-gauge)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-gauge
  */
trait SeriesGauge extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-gauge.animation
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-gauge.gauge)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-gauge.gauge)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-gauge.gauge)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-gauge.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-gauge.gauge)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-gauge.animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://echarts.apache.org/examples/en/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-gauge.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-gauge.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[String] = js.undefined
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger than
    * threshold.
    *
    *
    * @default
    * 2000
    * @see https://echarts.apache.org/en/option.html#series-gauge.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Axis tick label.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLabel
    */
  var axisLabel: js.UndefOr[AnonBackgroundColorBorderColorBorderRadius] = js.undefined
  /**
    * The related configuration about the axis line of gauge chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLine
    */
  var axisLine: js.UndefOr[AnonLineStyleShowAnonColorOpacityShadowBlurShadowColor] = js.undefined
  /**
    * The tick line style.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisTick
    */
  var axisTick: js.UndefOr[AnonLengthLineStyle] = js.undefined
  /**
    * Whether the scale in gauge chart increases clockwise.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-gauge.clockwise
    */
  var clockwise: js.UndefOr[Boolean] = js.undefined
  /**
    * The detail about gauge chart which is used to show data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.detail
    */
  var detail: js.UndefOr[AnonBackgroundColorBorderColorBorderRadiusBorderWidthColor] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-gauge.emphasis
    */
  var emphasis: js.UndefOr[AnonItemStyleAnonBorderColorBorderType] = js.undefined
  /**
    * The end angle of gauge chart.
    *
    *
    * @default
    * -45
    * @see https://echarts.apache.org/en/option.html#series-gauge.endAngle
    */
  var endAngle: js.UndefOr[Double] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The style of gauge chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.itemStyle
    */
  var itemStyle: js.UndefOr[AnonBorderColorBorderType] = js.undefined
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.markArea
    */
  var markArea: js.UndefOr[
    AnonAnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasingAnimationEasingUpdate
  ] = js.undefined
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.markLine
    */
  var markLine: js.UndefOr[
    AnonAnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasing
  ] = js.undefined
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.markPoint
    */
  var markPoint: js.UndefOr[
    AnonAnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdate
  ] = js.undefined
  /**
    * The maximum data value which map to
    * [maxAngle](https://echarts.apache.org/en/option.html#series-gauge.maxAngle)
    * .
    *
    *
    * @default
    * 100
    * @see https://echarts.apache.org/en/option.html#series-gauge.max
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * The minimum data value which map to
    * [minAngle](https://echarts.apache.org/en/option.html#series-gauge.minAngle)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.min
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Gauge chart pointer.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.pointer
    */
  var pointer: js.UndefOr[AnonLengthShow] = js.undefined
  /**
    * The radius of gauge chart.
    * It can be a percentage value of the smaller of container half
    * width and half height, also can be an absolute value.
    *
    * {{ use partial-legend-hover-link }}
    *
    *
    * @default
    * '75%'
    * @see https://echarts.apache.org/en/option.html#series-gauge.radius
    */
  var radius: js.UndefOr[Double | String] = js.undefined
  /**
    * The style of split line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.splitLine
    */
  var splitLine: js.UndefOr[AnonLength] = js.undefined
  /**
    * The number of split segments of gauge chart scale.
    *
    *
    * @default
    * 10
    * @see https://echarts.apache.org/en/option.html#series-gauge.splitNumber
    */
  var splitNumber: js.UndefOr[Double] = js.undefined
  /**
    * The start angle of gauge chart. The direct right side of
    * [circle center](https://echarts.apache.org/en/option.html#series-gauge.center)
    * is `0` degree, the right above it is `90` degree, the direct
    * left side of it is `180` degree.
    *
    *
    * @default
    * 225
    * @see https://echarts.apache.org/en/option.html#series-gauge.startAngle
    */
  var startAngle: js.UndefOr[Double] = js.undefined
  /**
    * The title of gauge chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.title
    */
  var title: js.UndefOr[AnonBackgroundColorBorderColorBorderRadiusBorderWidth] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.tooltip
    */
  var tooltip: js.UndefOr[AnonBackgroundColorBorderColor] = js.undefined
  /**
    * @default
    * "gauge"
    * @see https://echarts.apache.org/en/option.html#series-gauge.type
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object SeriesGauge {
  @scala.inline
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    animationDelay: js.Function | Double = null,
    animationDelayUpdate: js.Function | Double = null,
    animationDuration: js.Function | Double = null,
    animationDurationUpdate: js.Function | Double = null,
    animationEasing: String = null,
    animationEasingUpdate: String = null,
    animationThreshold: Int | Double = null,
    axisLabel: AnonBackgroundColorBorderColorBorderRadius = null,
    axisLine: AnonLineStyleShowAnonColorOpacityShadowBlurShadowColor = null,
    axisTick: AnonLengthLineStyle = null,
    clockwise: js.UndefOr[Boolean] = js.undefined,
    detail: AnonBackgroundColorBorderColorBorderRadiusBorderWidthColor = null,
    emphasis: AnonItemStyleAnonBorderColorBorderType = null,
    endAngle: Int | Double = null,
    id: String = null,
    itemStyle: AnonBorderColorBorderType = null,
    markArea: AnonAnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasingAnimationEasingUpdate = null,
    markLine: AnonAnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasing = null,
    markPoint: AnonAnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdate = null,
    max: Int | Double = null,
    min: Int | Double = null,
    name: String = null,
    pointer: AnonLengthShow = null,
    radius: Double | String = null,
    splitLine: AnonLength = null,
    splitNumber: Int | Double = null,
    startAngle: Int | Double = null,
    title: AnonBackgroundColorBorderColorBorderRadiusBorderWidth = null,
    tooltip: AnonBackgroundColorBorderColor = null,
    `type`: String = null
  ): SeriesGauge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (animationEasingUpdate != null) __obj.updateDynamic("animationEasingUpdate")(animationEasingUpdate.asInstanceOf[js.Any])
    if (animationThreshold != null) __obj.updateDynamic("animationThreshold")(animationThreshold.asInstanceOf[js.Any])
    if (axisLabel != null) __obj.updateDynamic("axisLabel")(axisLabel.asInstanceOf[js.Any])
    if (axisLine != null) __obj.updateDynamic("axisLine")(axisLine.asInstanceOf[js.Any])
    if (axisTick != null) __obj.updateDynamic("axisTick")(axisTick.asInstanceOf[js.Any])
    if (!js.isUndefined(clockwise)) __obj.updateDynamic("clockwise")(clockwise.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (markArea != null) __obj.updateDynamic("markArea")(markArea.asInstanceOf[js.Any])
    if (markLine != null) __obj.updateDynamic("markLine")(markLine.asInstanceOf[js.Any])
    if (markPoint != null) __obj.updateDynamic("markPoint")(markPoint.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (splitLine != null) __obj.updateDynamic("splitLine")(splitLine.asInstanceOf[js.Any])
    if (splitNumber != null) __obj.updateDynamic("splitNumber")(splitNumber.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesGauge]
  }
}

