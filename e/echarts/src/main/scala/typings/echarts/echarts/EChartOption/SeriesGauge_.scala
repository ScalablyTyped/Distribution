package typings.echarts.echarts.EChartOption

import typings.echarts.anon.AnimationDurationUpdate
import typings.echarts.anon.AnimationEasing
import typings.echarts.anon.AnimationEasingUpdate
import typings.echarts.anon.BorderType
import typings.echarts.anon.ExtraCssText
import typings.echarts.anon.ItemStyleBorderType
import typings.echarts.anon.LengthLineStyle
import typings.echarts.anon.LengthShow
import typings.echarts.anon.LineStyleShow
import typings.echarts.anon.OffsetCenter
import typings.echarts.anon.Rich
import typings.echarts.anon.SplitNumber
import typings.echarts.anon.TextBorderColor
import typings.echarts.echarts.EChartOption.SeriesGauge.DataObject
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
trait SeriesGauge_ extends js.Object {
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
  var axisLabel: js.UndefOr[Rich] = js.undefined
  /**
    * The related configuration about the axis line of gauge chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLine
    */
  var axisLine: js.UndefOr[LineStyleShow] = js.undefined
  /**
    * The tick line style.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisTick
    */
  var axisTick: js.UndefOr[SplitNumber] = js.undefined
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
    * Data array of series, which can be a single data value.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-gauge.data)
    *
    * Or, if need extra dimensions for components like [visualMap](https://echarts.apache.org/en/option.html#visualMap)
    * to map to graphic attributes like color, it can also be in the form of array.
    *
    * In this case, we can assigin the second value in each arrary item to [visualMap](https://echarts.apache.org/en/option.html#visualMap) component.
    * More likely, we need to assign name to each data item, in which case each item should be an object:
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.data
    */
  var data: js.UndefOr[
    js.Array[
      (js.Array[Unit | String | Double | DataObject]) | DataObject | Double | String | Unit
    ]
  ] = js.undefined
  /**
    * The detail about gauge chart which is used to show data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.detail
    */
  var detail: js.UndefOr[TextBorderColor] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-gauge.emphasis
    */
  var emphasis: js.UndefOr[ItemStyleBorderType] = js.undefined
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
  var itemStyle: js.UndefOr[BorderType] = js.undefined
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.markArea
    */
  var markArea: js.UndefOr[AnimationEasingUpdate] = js.undefined
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.markLine
    */
  var markLine: js.UndefOr[AnimationEasing] = js.undefined
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.markPoint
    */
  var markPoint: js.UndefOr[AnimationDurationUpdate] = js.undefined
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
  var pointer: js.UndefOr[LengthShow] = js.undefined
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
  var splitLine: js.UndefOr[LengthLineStyle] = js.undefined
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
  var title: js.UndefOr[OffsetCenter] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.tooltip
    */
  var tooltip: js.UndefOr[ExtraCssText] = js.undefined
  /**
    * @default
    * "gauge"
    * @see https://echarts.apache.org/en/option.html#series-gauge.type
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object SeriesGauge_ {
  @scala.inline
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    animationDelay: js.Function | Double = null,
    animationDelayUpdate: js.Function | Double = null,
    animationDuration: js.Function | Double = null,
    animationDurationUpdate: js.Function | Double = null,
    animationEasing: String = null,
    animationEasingUpdate: String = null,
    animationThreshold: js.UndefOr[Double] = js.undefined,
    axisLabel: Rich = null,
    axisLine: LineStyleShow = null,
    axisTick: SplitNumber = null,
    clockwise: js.UndefOr[Boolean] = js.undefined,
    data: js.Array[
      (js.Array[Unit | String | Double | DataObject]) | DataObject | Double | String | Unit
    ] = null,
    detail: TextBorderColor = null,
    emphasis: ItemStyleBorderType = null,
    endAngle: js.UndefOr[Double] = js.undefined,
    id: String = null,
    itemStyle: BorderType = null,
    markArea: AnimationEasingUpdate = null,
    markLine: AnimationEasing = null,
    markPoint: AnimationDurationUpdate = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    name: String = null,
    pointer: LengthShow = null,
    radius: Double | String = null,
    splitLine: LengthLineStyle = null,
    splitNumber: js.UndefOr[Double] = js.undefined,
    startAngle: js.UndefOr[Double] = js.undefined,
    title: OffsetCenter = null,
    tooltip: ExtraCssText = null,
    `type`: String = null
  ): SeriesGauge_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.get.asInstanceOf[js.Any])
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (animationEasingUpdate != null) __obj.updateDynamic("animationEasingUpdate")(animationEasingUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(animationThreshold)) __obj.updateDynamic("animationThreshold")(animationThreshold.get.asInstanceOf[js.Any])
    if (axisLabel != null) __obj.updateDynamic("axisLabel")(axisLabel.asInstanceOf[js.Any])
    if (axisLine != null) __obj.updateDynamic("axisLine")(axisLine.asInstanceOf[js.Any])
    if (axisTick != null) __obj.updateDynamic("axisTick")(axisTick.asInstanceOf[js.Any])
    if (!js.isUndefined(clockwise)) __obj.updateDynamic("clockwise")(clockwise.get.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (!js.isUndefined(endAngle)) __obj.updateDynamic("endAngle")(endAngle.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (markArea != null) __obj.updateDynamic("markArea")(markArea.asInstanceOf[js.Any])
    if (markLine != null) __obj.updateDynamic("markLine")(markLine.asInstanceOf[js.Any])
    if (markPoint != null) __obj.updateDynamic("markPoint")(markPoint.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pointer != null) __obj.updateDynamic("pointer")(pointer.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (splitLine != null) __obj.updateDynamic("splitLine")(splitLine.asInstanceOf[js.Any])
    if (!js.isUndefined(splitNumber)) __obj.updateDynamic("splitNumber")(splitNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startAngle)) __obj.updateDynamic("startAngle")(startAngle.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesGauge_]
  }
}

