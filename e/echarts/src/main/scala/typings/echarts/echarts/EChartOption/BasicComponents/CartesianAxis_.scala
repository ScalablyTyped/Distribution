package typings.echarts.echarts.EChartOption.BasicComponents

import typings.echarts.anon.Max
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.DataObject
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Label
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.MinorSplitLine
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.MinorTick
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Pointer
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.SplitArea
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.SplitLine
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Tick
import typings.echarts.echarts.EChartOption.TextStyleWithRich
import typings.echarts.echartsStrings.center
import typings.echarts.echartsStrings.end
import typings.echarts.echartsStrings.middle
import typings.echarts.echartsStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CartesianAxis_ extends js.Object {
  
  /**
    * Settings related to axis label.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.axisLabel
    */
  var axisLabel: js.UndefOr[Label] = js.native
  
  /**
    * Settings related to axis line.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.axisLine
    */
  var axisLine: js.UndefOr[Line] = js.native
  
  /**
    * axisPointer settings on the axis.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.axisPointer
    */
  var axisPointer: js.UndefOr[Pointer] = js.native
  
  /**
    * Settings related to axis tick.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.axisTick
    */
  var axisTick: js.UndefOr[Tick] = js.native
  
  /**
    * The boundary gap on both sides of a coordinate axis.
    * The setting and behavior of category axes and non-category axes are
    * different. The `boundaryGap` of category axis can be set to either
    * `true` or `false`. Default value is set to be `true`, in which case
    * `axisTick` is served only as a separation line, and labels and data
    * appear only in the center part of two axis ticks, which is called
    * band. For non-category axis, including time, numerical value, and
    * log axes, `boundaryGap` is an array of two values, representing the
    * spanning range between minimum and maximum value.
    * The value can be set in numeric value or relative percentage,
    * which becomes invalid after setting `min` and `max`.
    *
    * @example
    * boundaryGap: ['20%', '20%']
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.boundaryGap
    */
  var boundaryGap: js.UndefOr[Boolean | (js.Array[String | Double])] = js.native
  
  /**
    * Category data, available in type: `'category'` axis.
    * If `type` is not specified, but `axis.data` is specified,
    * the `type` is auto set as `'category'`.
    * If type is specified as `'category'`,
    * but axis.data is not specified, `axis.data` will be
    * auto collected from `series.data`.
    * It brings convenience, but we should notice that
    * `axis.data` provides then value range of the `'category'` axis.
    * If it is auto collected from `series.data`,
    * Only the values appearing in series.data can be collected.
    * For example, if series.data is empty, nothing will be collected.
    *
    * @example
    *  // Name list of all categories
    *  data: ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday']
    *  // Each item could also be a specific configuration item.
    *  // In this case, `value` is used as the category name.
    *  data: [{
    *      value: 'Monday',
    *      // Highlight Monday
    *      textStyle: {
    *          fontSize: 20,
    *          color: 'red'
    *      }
    *  }, 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday']
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.data
    */
  var data: js.UndefOr[js.Array[String | Double | DataObject]] = js.native
  
  /**
    * The index of grid which this axis belongs to.
    * Defaults to be in the first grid.
    *
    * @default 0
    */
  var gridIndex: js.UndefOr[Double] = js.native
  
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option or API.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Compulsively set segmentation interval for axis.
    * As splitNumber is a recommendation value,
    * the calculated tick may not be the same as expected.
    * In this case, interval should be used along with min and max
    * to compulsively set tickings.
    * But in most cases, we do not suggest using this,
    * out automatic calculation is enough for most situations.
    * This is unavailable for category axis.
    * Timestamp should be passed for type: `'time'` axis.
    * Logged value should be passed for type: `'log'` axis.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.interval
    */
  var interval: js.UndefOr[Double] = js.native
  
  /**
    * Whether axis is inversed. New option from ECharts 3.
    *
    * @default false
    */
  var inverse: js.UndefOr[Boolean] = js.native
  
  /**
    * Base of logarithm, which is valid only for numeric axes with type:
    * `'log'`.
    *
    * @default 10
    * @see https://echarts.apache.org/en/option.html#yAxis.logBase
    */
  var logBase: js.UndefOr[Double] = js.native
  
  /**
    * The maximum value of axis.
    * It can be set to a special value `'dataMax'` so that
    * the minimum value on this axis is set to be the maximum label.
    * It will be automatically computed to make sure axis tick is equally
    * distributed when not set.
    * In category axis, it can also be set as the ordinal number.
    * For example, if a catergory axis has
    * `data: ['categoryA', 'categoryB', 'categoryC']`
    * , and the ordinal `2` represents `'categoryC'`.
    * Moreover, it can be set as negative number, like `-3`.
    *
    * @default null
    * @see https://echarts.apache.org/option.html#yAxis.max
    */
  var max: js.UndefOr[Double | String | (js.Function1[/* value */ Max, Double])] = js.native
  
  /**
    * The minimun value of axis.
    * It can be set to a special value `'dataMin'` so that
    * the minimum value on this axis is set to be the minimum label.
    * It will be automatically computed to make sure axis tick is equally
    * distributed when not set. In category axis, it can also be set
    * as the ordinal number.
    * For example, if a catergory axis has
    * `data: ['categoryA', 'categoryB', 'categoryC']`
    * , and the ordinal `2` represents `'categoryC'`.
    * Moreover, it can be set as negative number, like `-3`.
    *
    * @default null
    * @see https://echarts.apache.org/option.html#yAxis.min
    */
  var min: js.UndefOr[Double | String | (js.Function1[/* value */ Max, Double])] = js.native
  
  /**
    * Maximum gap between split lines.
    * For example, in time axis (type is `'time'`),
    * it can be set to be `3600 * 24 * 1000` to make sure
    * that the gap between axis labels is less than or equal to one day.
    * @example
    * {
    *     maxInterval: 3600 * 1000 * 24
    * }
    * It is available only for axis of type `'value'` or `'time'`.
    * @see https://echarts.apache.org/en/option.html#yAxis.minInterval
    */
  var minInterval: js.UndefOr[js.Any] = js.native
  
  /**
    * Minor SplitLine of axis in grid area.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.minorSplitLine
    */
  var minorSplitLine: js.UndefOr[MinorSplitLine] = js.native
  
  /**
    * Settings related to axis minor tick.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.minorTick
    */
  var minorTick: js.UndefOr[MinorTick] = js.native
  
  /**
    * Name of axis.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Gap between axis name and axis line.
    *
    * @default 15
    */
  var nameGap: js.UndefOr[Double] = js.native
  
  /**
    * Location of axis name.
    *
    * @default 'start'
    */
  var nameLocation: js.UndefOr[start | middle | center | end] = js.native
  
  /**
    * Rotation of axis name.
    *
    * @default null
    */
  var nameRotate: js.UndefOr[Double] = js.native
  
  /**
    * Text style of axis name.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.nameTextStyle
    */
  var nameTextStyle: js.UndefOr[TextStyleWithRich] = js.native
  
  /**
    * Offset of this axis relative to default position.
    * Useful when multiple axis of this type has same position value.
    *
    * @default 0
    * @see https://echarts.apache.org/en/option.html#yAxis.offset
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * It is available only in numerical axis, i.e., type: `'value'`.
    * It specifies whether not to contain zero position
    * of axis compulsively.
    * When it is set to be `true`, the axis may not contain zero position,
    * which is useful in the scatter chart for both value axes.
    * This configuration item is unavailable when the `min` and `max`
    * are set.
    *
    * @default false
    * @see https://echarts.apache.org/en/option.html#yAxis.scale
    */
  var scale: js.UndefOr[Boolean] = js.native
  
  /**
    * If show this axis.
    *
    * @default 'true'
    */
  var show: js.UndefOr[Boolean] = js.native
  
  /**
    * True for axis that cannot be interacted with.
    *
    * @default false
    */
  var silent: js.UndefOr[Boolean] = js.native
  
  /**
    * Split area of axis in grid area, not shown by default.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.splitArea
    */
  var splitArea: js.UndefOr[SplitArea] = js.native
  
  /**
    * SplitLine of axis in grid area.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.splitLine
    */
  var splitLine: js.UndefOr[SplitLine] = js.native
  
  /**
    * Number of segments that the axis is split into.
    * Note that this number serves only as a recommendation,
    * and the true segments may be adjusted based on readability.
    * This is unavailable for category axis.
    *
    * @default 5
    * @see https://echarts.apache.org/en/option.html#yAxis.splitNumber
    */
  var splitNumber: js.UndefOr[Double] = js.native
  
  /**
    * Whether the labels of axis triggers and reacts to mouse events.
    * Parameters of event includes:
    *
    * @example
    * {
    *     // Component type: xAxis, yAxis, radiusAxis, angleAxis
    *     // Each of which has an attribute for index, e.g., xAxisIndex for xAxis
    *     componentType: string,
    *     // Value on axis before being formatted.
    *     // Click on value label to trigger event.
    *     value: '',
    *     // Name of axis.
    *     // Click on laben name to trigger event.
    *     name: ''
    * }
    *
    * @default false
    */
  var triggerEvent: js.UndefOr[Boolean] = js.native
  
  /**
    * z value of all graghical elements in this axis,
    * which controls order of drawing graphical components.
    * Components with smaller z values may be overwritten by those
    * with larger z values.
    * z has a lower priority to zlevel, and will not create new Canvas.
    *
    * @see https://echarts.apache.org/en/option.html#yAxis.z
    */
  var z: js.UndefOr[Double] = js.native
  
  /**
    * `zlevel` value of all graghical elements in this axis.
    * `zlevel` is used to make layers with Canvas.
    * Graphical elements with different `zlevel` values will be placed
    * in different Canvases, which is a common optimization technique.
    * We can put those frequently changed elements
    * (like those with animations) to a seperate `zlevel`.
    * Notice that too many Canvases will increase memory cost,
    * and should be used carefully on mobile phones to avoid crash.
    * Canvases with bigger `zlevel` will be placed on Canvases
    * with smaller `zlevel`.
    *
    * @default 0
    * @see https://echarts.apache.org/en/option.html#yAxis.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.native
}
object CartesianAxis_ {
  
  @scala.inline
  def apply(): CartesianAxis_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CartesianAxis_]
  }
  
  @scala.inline
  implicit class CartesianAxis_Ops[Self <: CartesianAxis_] (val x: Self) extends AnyVal {
    
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
    def setAxisLabel(value: Label): Self = this.set("axisLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisLabel: Self = this.set("axisLabel", js.undefined)
    
    @scala.inline
    def setAxisLine(value: Line): Self = this.set("axisLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisLine: Self = this.set("axisLine", js.undefined)
    
    @scala.inline
    def setAxisPointer(value: Pointer): Self = this.set("axisPointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisPointer: Self = this.set("axisPointer", js.undefined)
    
    @scala.inline
    def setAxisTick(value: Tick): Self = this.set("axisTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisTick: Self = this.set("axisTick", js.undefined)
    
    @scala.inline
    def setBoundaryGapVarargs(value: (String | Double)*): Self = this.set("boundaryGap", js.Array(value :_*))
    
    @scala.inline
    def setBoundaryGap(value: Boolean | (js.Array[String | Double])): Self = this.set("boundaryGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundaryGap: Self = this.set("boundaryGap", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: (String | Double | DataObject)*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[String | Double | DataObject]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setGridIndex(value: Double): Self = this.set("gridIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridIndex: Self = this.set("gridIndex", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setInverse(value: Boolean): Self = this.set("inverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverse: Self = this.set("inverse", js.undefined)
    
    @scala.inline
    def setLogBase(value: Double): Self = this.set("logBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogBase: Self = this.set("logBase", js.undefined)
    
    @scala.inline
    def setMaxFunction1(value: /* value */ Max => Double): Self = this.set("max", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMax(value: Double | String | (js.Function1[/* value */ Max, Double])): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMinFunction1(value: /* value */ Max => Double): Self = this.set("min", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMin(value: Double | String | (js.Function1[/* value */ Max, Double])): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMinInterval(value: js.Any): Self = this.set("minInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinInterval: Self = this.set("minInterval", js.undefined)
    
    @scala.inline
    def setMinorSplitLine(value: MinorSplitLine): Self = this.set("minorSplitLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorSplitLine: Self = this.set("minorSplitLine", js.undefined)
    
    @scala.inline
    def setMinorTick(value: MinorTick): Self = this.set("minorTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTick: Self = this.set("minorTick", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameGap(value: Double): Self = this.set("nameGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameGap: Self = this.set("nameGap", js.undefined)
    
    @scala.inline
    def setNameLocation(value: start | middle | center | end): Self = this.set("nameLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameLocation: Self = this.set("nameLocation", js.undefined)
    
    @scala.inline
    def setNameRotate(value: Double): Self = this.set("nameRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameRotate: Self = this.set("nameRotate", js.undefined)
    
    @scala.inline
    def setNameTextStyle(value: TextStyleWithRich): Self = this.set("nameTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameTextStyle: Self = this.set("nameTextStyle", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setScale(value: Boolean): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setSplitArea(value: SplitArea): Self = this.set("splitArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitArea: Self = this.set("splitArea", js.undefined)
    
    @scala.inline
    def setSplitLine(value: SplitLine): Self = this.set("splitLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitLine: Self = this.set("splitLine", js.undefined)
    
    @scala.inline
    def setSplitNumber(value: Double): Self = this.set("splitNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitNumber: Self = this.set("splitNumber", js.undefined)
    
    @scala.inline
    def setTriggerEvent(value: Boolean): Self = this.set("triggerEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerEvent: Self = this.set("triggerEvent", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
    
    @scala.inline
    def setZlevel(value: Double): Self = this.set("zlevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZlevel: Self = this.set("zlevel", js.undefined)
  }
}
