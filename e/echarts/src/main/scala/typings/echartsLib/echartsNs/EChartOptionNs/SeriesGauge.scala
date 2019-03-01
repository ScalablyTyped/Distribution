package typings
package echartsLib.echartsNs.EChartOptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * **Gauge chart**
  *
  * **Example:**
  *
  * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge)
  *
  *
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge
  */
trait SeriesGauge extends Series {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.animation
    */
  var animation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.gauge)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.gauge)
    *
    * See
    * [this example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.gauge)
    *
    *
    * @default
    * 1000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.gauge)
    *
    *
    * @default
    * 300
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[js.Function | scala.Double] = js.undefined
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://ecomfe.github.io/echarts-examples/public/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.animationEasing
    */
  var animationEasing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger than
    * threshold.
    *
    *
    * @default
    * 2000
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.animationThreshold
    */
  var animationThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Axis tick label.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.axisLabel
    */
  var axisLabel: js.UndefOr[echartsLib.Anon_BackgroundColorBorderColorBorderRadius] = js.undefined
  /**
    * The related configuration about the axis line of gauge chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.axisLine
    */
  var axisLine: js.UndefOr[echartsLib.Anon_LineStyleShow] = js.undefined
  /**
    * The tick line style.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.axisTick
    */
  var axisTick: js.UndefOr[echartsLib.Anon_LengthLineStyle] = js.undefined
  /**
    * Whether the scale in gauge chart increases clockwise.
    *
    *
    * @default
    * "true"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.clockwise
    */
  var clockwise: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The detail about gauge chart which is used to show data.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.detail
    */
  var detail: js.UndefOr[echartsLib.Anon_BackgroundColorBorderColorBorderRadiusBorderWidthColor] = js.undefined
  /**
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.emphasis
    */
  var emphasis: js.UndefOr[echartsLib.Anon_ItemStyleAnonBorderColor] = js.undefined
  /**
    * The end angle of gauge chart.
    *
    *
    * @default
    * -45
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.endAngle
    */
  var endAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.id
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The style of gauge chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.itemStyle
    */
  var itemStyle: js.UndefOr[echartsLib.Anon_BorderColorBorderTypeBorderWidth] = js.undefined
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.markArea
    */
  var markArea: js.UndefOr[
    echartsLib.Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasing
  ] = js.undefined
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.markLine
    */
  var markLine: js.UndefOr[
    echartsLib.Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdate
  ] = js.undefined
  /**
    * Mark point in a chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.markPoint
    */
  var markPoint: js.UndefOr[echartsLib.Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDuration] = js.undefined
  /**
    * The maximum data value which map to
    * [maxAngle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.maxAngle)
    * .
    *
    *
    * @default
    * 100
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.max
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum data value which map to
    * [minAngle](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.minAngle)
    * .
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.min
    */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
    * Series name used for displaying in
    * [tooltip](https://ecomfe.github.io/echarts-doc/public/en/option.html#tooltip)
    * and filtering with
    * [legend](https://ecomfe.github.io/echarts-doc/public/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Gauge chart pointer.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.pointer
    */
  var pointer: js.UndefOr[echartsLib.Anon_LengthShow] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.radius
    */
  var radius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The style of split line.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.splitLine
    */
  var splitLine: js.UndefOr[echartsLib.Anon_Length] = js.undefined
  /**
    * The number of split segments of gauge chart scale.
    *
    *
    * @default
    * 10
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.splitNumber
    */
  var splitNumber: js.UndefOr[scala.Double] = js.undefined
  /**
    * The start angle of gauge chart. The direct right side of
    * [circle center](https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.center)
    * is `0` degree, the right above it is `90` degree, the direct
    * left side of it is `180` degree.
    *
    *
    * @default
    * 225
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.startAngle
    */
  var startAngle: js.UndefOr[scala.Double] = js.undefined
  /**
    * The title of gauge chart.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.title
    */
  var title: js.UndefOr[echartsLib.Anon_BackgroundColorBorderColorBorderRadiusBorderWidth] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.tooltip
    */
  var tooltip: js.UndefOr[echartsLib.Anon_BackgroundColorBorderColor] = js.undefined
  /**
    * @default
    * "gauge"
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#series-gauge.type
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SeriesGauge {
  @scala.inline
  def apply(
    animation: js.UndefOr[scala.Boolean] = js.undefined,
    animationDelay: js.Function | scala.Double = null,
    animationDelayUpdate: js.Function | scala.Double = null,
    animationDuration: js.Function | scala.Double = null,
    animationDurationUpdate: js.Function | scala.Double = null,
    animationEasing: java.lang.String = null,
    animationEasingUpdate: java.lang.String = null,
    animationThreshold: scala.Int | scala.Double = null,
    axisLabel: echartsLib.Anon_BackgroundColorBorderColorBorderRadius = null,
    axisLine: echartsLib.Anon_LineStyleShow = null,
    axisTick: echartsLib.Anon_LengthLineStyle = null,
    clockwise: js.UndefOr[scala.Boolean] = js.undefined,
    detail: echartsLib.Anon_BackgroundColorBorderColorBorderRadiusBorderWidthColor = null,
    emphasis: echartsLib.Anon_ItemStyleAnonBorderColor = null,
    endAngle: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    itemStyle: echartsLib.Anon_BorderColorBorderTypeBorderWidth = null,
    markArea: echartsLib.Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdateAnimationEasing = null,
    markLine: echartsLib.Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDurationAnimationDurationUpdate = null,
    markPoint: echartsLib.Anon_AnimationAnimationDelayAnimationDelayUpdateAnimationDuration = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    pointer: echartsLib.Anon_LengthShow = null,
    radius: scala.Double | java.lang.String = null,
    splitLine: echartsLib.Anon_Length = null,
    splitNumber: scala.Int | scala.Double = null,
    startAngle: scala.Int | scala.Double = null,
    title: echartsLib.Anon_BackgroundColorBorderColorBorderRadiusBorderWidth = null,
    tooltip: echartsLib.Anon_BackgroundColorBorderColor = null,
    `type`: java.lang.String = null
  ): SeriesGauge = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation)
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (animationEasingUpdate != null) __obj.updateDynamic("animationEasingUpdate")(animationEasingUpdate)
    if (animationThreshold != null) __obj.updateDynamic("animationThreshold")(animationThreshold.asInstanceOf[js.Any])
    if (axisLabel != null) __obj.updateDynamic("axisLabel")(axisLabel)
    if (axisLine != null) __obj.updateDynamic("axisLine")(axisLine)
    if (axisTick != null) __obj.updateDynamic("axisTick")(axisTick)
    if (!js.isUndefined(clockwise)) __obj.updateDynamic("clockwise")(clockwise)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis)
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (markArea != null) __obj.updateDynamic("markArea")(markArea)
    if (markLine != null) __obj.updateDynamic("markLine")(markLine)
    if (markPoint != null) __obj.updateDynamic("markPoint")(markPoint)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (pointer != null) __obj.updateDynamic("pointer")(pointer)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (splitLine != null) __obj.updateDynamic("splitLine")(splitLine)
    if (splitNumber != null) __obj.updateDynamic("splitNumber")(splitNumber.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SeriesGauge]
  }
}

