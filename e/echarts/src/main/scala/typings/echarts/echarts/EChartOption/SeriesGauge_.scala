package typings.echarts.echarts.EChartOption

import typings.echarts.anon.AnimationEasing
import typings.echarts.anon.AnimationEasingUpdate
import typings.echarts.anon.AnimationThreshold
import typings.echarts.anon.BorderType
import typings.echarts.anon.LengthLineStyle
import typings.echarts.anon.LengthShow
import typings.echarts.anon.LineStyleShow
import typings.echarts.anon.OffsetCenter
import typings.echarts.anon.Padding
import typings.echarts.anon.Rich
import typings.echarts.anon.SplitNumber
import typings.echarts.anon.`2`
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
@js.native
trait SeriesGauge_ extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-gauge.animation
    */
  var animation: js.UndefOr[Boolean] = js.native
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
  var animationDelay: js.UndefOr[js.Function | Double] = js.native
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
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.native
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
  var animationDuration: js.UndefOr[js.Function | Double] = js.native
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
  var animationDurationUpdate: js.UndefOr[js.Function | Double] = js.native
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
  var animationEasing: js.UndefOr[String] = js.native
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-gauge.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[String] = js.native
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
  var animationThreshold: js.UndefOr[Double] = js.native
  /**
    * Axis tick label.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLabel
    */
  var axisLabel: js.UndefOr[Padding] = js.native
  /**
    * The related configuration about the axis line of gauge chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisLine
    */
  var axisLine: js.UndefOr[LineStyleShow] = js.native
  /**
    * The tick line style.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.axisTick
    */
  var axisTick: js.UndefOr[SplitNumber] = js.native
  /**
    * Whether the scale in gauge chart increases clockwise.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-gauge.clockwise
    */
  var clockwise: js.UndefOr[Boolean] = js.native
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
  ] = js.native
  /**
    * The detail about gauge chart which is used to show data.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.detail
    */
  var detail: js.UndefOr[Rich] = js.native
  /**
    * @see https://echarts.apache.org/en/option.html#series-gauge.emphasis
    */
  var emphasis: js.UndefOr[`2`] = js.native
  /**
    * The end angle of gauge chart.
    *
    *
    * @default
    * -45
    * @see https://echarts.apache.org/en/option.html#series-gauge.endAngle
    */
  var endAngle: js.UndefOr[Double] = js.native
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.id
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The style of gauge chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.itemStyle
    */
  var itemStyle: js.UndefOr[BorderType] = js.native
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.markArea
    */
  var markArea: js.UndefOr[AnimationThreshold] = js.native
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.markLine
    */
  var markLine: js.UndefOr[AnimationEasingUpdate] = js.native
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.markPoint
    */
  var markPoint: js.UndefOr[AnimationEasing] = js.native
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
  var max: js.UndefOr[Double] = js.native
  /**
    * The minimum data value which map to
    * [minAngle](https://echarts.apache.org/en/option.html#series-gauge.minAngle)
    * .
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.min
    */
  var min: js.UndefOr[Double] = js.native
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
  var name: js.UndefOr[String] = js.native
  /**
    * Gauge chart pointer.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.pointer
    */
  var pointer: js.UndefOr[LengthShow] = js.native
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
  var radius: js.UndefOr[Double | String] = js.native
  /**
    * The style of split line.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.splitLine
    */
  var splitLine: js.UndefOr[LengthLineStyle] = js.native
  /**
    * The number of split segments of gauge chart scale.
    *
    *
    * @default
    * 10
    * @see https://echarts.apache.org/en/option.html#series-gauge.splitNumber
    */
  var splitNumber: js.UndefOr[Double] = js.native
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
  var startAngle: js.UndefOr[Double] = js.native
  /**
    * The title of gauge chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.title
    */
  var title: js.UndefOr[OffsetCenter] = js.native
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-gauge.tooltip
    */
  var tooltip: js.UndefOr[BaseTooltip] = js.native
  /**
    * @default
    * "gauge"
    * @see https://echarts.apache.org/en/option.html#series-gauge.type
    */
  var `type`: js.UndefOr[String] = js.native
}

object SeriesGauge_ {
  @scala.inline
  def apply(): SeriesGauge_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesGauge_]
  }
  @scala.inline
  implicit class SeriesGauge_Ops[Self <: SeriesGauge_] (val x: Self) extends AnyVal {
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
    def setAnimation(value: Boolean): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAnimationDelay(value: js.Function | Double): Self = this.set("animationDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDelay: Self = this.set("animationDelay", js.undefined)
    @scala.inline
    def setAnimationDelayUpdate(value: js.Function | Double): Self = this.set("animationDelayUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDelayUpdate: Self = this.set("animationDelayUpdate", js.undefined)
    @scala.inline
    def setAnimationDuration(value: js.Function | Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setAnimationDurationUpdate(value: js.Function | Double): Self = this.set("animationDurationUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDurationUpdate: Self = this.set("animationDurationUpdate", js.undefined)
    @scala.inline
    def setAnimationEasing(value: String): Self = this.set("animationEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationEasing: Self = this.set("animationEasing", js.undefined)
    @scala.inline
    def setAnimationEasingUpdate(value: String): Self = this.set("animationEasingUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationEasingUpdate: Self = this.set("animationEasingUpdate", js.undefined)
    @scala.inline
    def setAnimationThreshold(value: Double): Self = this.set("animationThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationThreshold: Self = this.set("animationThreshold", js.undefined)
    @scala.inline
    def setAxisLabel(value: Padding): Self = this.set("axisLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisLabel: Self = this.set("axisLabel", js.undefined)
    @scala.inline
    def setAxisLine(value: LineStyleShow): Self = this.set("axisLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisLine: Self = this.set("axisLine", js.undefined)
    @scala.inline
    def setAxisTick(value: SplitNumber): Self = this.set("axisTick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisTick: Self = this.set("axisTick", js.undefined)
    @scala.inline
    def setClockwise(value: Boolean): Self = this.set("clockwise", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClockwise: Self = this.set("clockwise", js.undefined)
    @scala.inline
    def setDataVarargs(value: ((js.Array[Unit | String | Double | DataObject]) | DataObject | Double | String | Unit)*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(
      value: js.Array[
          (js.Array[Unit | String | Double | DataObject]) | DataObject | Double | String | Unit
        ]
    ): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDetail(value: Rich): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    @scala.inline
    def setEmphasis(value: `2`): Self = this.set("emphasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmphasis: Self = this.set("emphasis", js.undefined)
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemStyle(value: BorderType): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setMarkArea(value: AnimationThreshold): Self = this.set("markArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkArea: Self = this.set("markArea", js.undefined)
    @scala.inline
    def setMarkLine(value: AnimationEasingUpdate): Self = this.set("markLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkLine: Self = this.set("markLine", js.undefined)
    @scala.inline
    def setMarkPoint(value: AnimationEasing): Self = this.set("markPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkPoint: Self = this.set("markPoint", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPointer(value: LengthShow): Self = this.set("pointer", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointer: Self = this.set("pointer", js.undefined)
    @scala.inline
    def setRadius(value: Double | String): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setSplitLine(value: LengthLineStyle): Self = this.set("splitLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitLine: Self = this.set("splitLine", js.undefined)
    @scala.inline
    def setSplitNumber(value: Double): Self = this.set("splitNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplitNumber: Self = this.set("splitNumber", js.undefined)
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    @scala.inline
    def setTitle(value: OffsetCenter): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTooltip(value: BaseTooltip): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

