package typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs

import typings.echarts.Anon_Max
import typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.DataObject
import typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.Label
import typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.Pointer
import typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.SplitArea
import typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.SplitLine
import typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.Tick
import typings.echarts.echartsNs.EChartOptionNs.TextStyleWithRich
import typings.echarts.echartsStrings.center
import typings.echarts.echartsStrings.end
import typings.echarts.echartsStrings.middle
import typings.echarts.echartsStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CartesianAxis extends js.Object {
  /**
    * Settings related to axis label.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.axisLabel
    */
  var axisLabel: js.UndefOr[Label] = js.undefined
  /**
    * Settings related to axis line.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.axisLine
    */
  var axisLine: js.UndefOr[Line] = js.undefined
  /**
    * axisPointer settings on the axis.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.axisPointer
    */
  var axisPointer: js.UndefOr[Pointer] = js.undefined
  /**
    * Settings related to axis tick.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.axisTick
    */
  var axisTick: js.UndefOr[Tick] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.boundaryGap
    */
  var boundaryGap: js.UndefOr[Boolean | (js.Array[String | Double])] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.data
    */
  var data: js.UndefOr[js.Array[String | Double | DataObject]] = js.undefined
  /**
    * The index of grid which this axis belongs to.
    * Defaults to be in the first grid.
    *
    * @default 0
    */
  var gridIndex: js.UndefOr[Double] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option or API.
    */
  var id: js.UndefOr[String] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.interval
    */
  var interval: js.UndefOr[Double] = js.undefined
  /**
    * Whether axis is inversed. New option from ECharts 3.
    *
    * @default false
    */
  var inverse: js.UndefOr[Boolean] = js.undefined
  /**
    * Base of logarithm, which is valid only for numeric axes with type:
    * `'log'`.
    *
    * @default 10
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.logBase
    */
  var logBase: js.UndefOr[Double] = js.undefined
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
  var max: js.UndefOr[Double | String | (js.Function1[/* value */ Anon_Max, Double])] = js.undefined
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
  var min: js.UndefOr[Double | String | (js.Function1[/* value */ Anon_Max, Double])] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.minInterval
    */
  var minInterval: js.UndefOr[js.Any] = js.undefined
  /**
    * Name of axis.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Gap between axis name and axis line.
    *
    * @default 15
    */
  var nameGap: js.UndefOr[Double] = js.undefined
  /**
    * Location of axis name.
    *
    * @default 'start'
    */
  var nameLocation: js.UndefOr[start | middle | center | end] = js.undefined
  /**
    * Rotation of axis name.
    *
    * @default null
    */
  var nameRotate: js.UndefOr[Double] = js.undefined
  /**
    * Text style of axis name.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.nameTextStyle
    */
  var nameTextStyle: js.UndefOr[TextStyleWithRich] = js.undefined
  /**
    * Offset of this axis relative to default position.
    * Useful when multiple axis of this type has same position value.
    *
    * @default 0
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.offset
    */
  var offset: js.UndefOr[Double] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.scale
    */
  var scale: js.UndefOr[Boolean] = js.undefined
  /**
    * If show this axis.
    *
    * @default 'true'
    */
  var show: js.UndefOr[Boolean] = js.undefined
  /**
    * True for axis that cannot be interacted with.
    *
    * @default false
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Split area of axis in grid area, not shown by default.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.splitArea
    */
  var splitArea: js.UndefOr[SplitArea] = js.undefined
  /**
    * SplitLine of axis in grid area.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.splitLine
    */
  var splitLine: js.UndefOr[SplitLine] = js.undefined
  /**
    * Number of segments that the axis is split into.
    * Note that this number serves only as a recommendation,
    * and the true segments may be adjusted based on readability.
    * This is unavailable for category axis.
    *
    * @default 5
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.splitNumber
    */
  var splitNumber: js.UndefOr[Double] = js.undefined
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
  var triggerEvent: js.UndefOr[Boolean] = js.undefined
  /**
    * z value of all graghical elements in this axis,
    * which controls order of drawing graphical components.
    * Components with smaller z values may be overwritten by those
    * with larger z values.
    * z has a lower priority to zlevel, and will not create new Canvas.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.z
    */
  var z: js.UndefOr[Double] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.undefined
}

object CartesianAxis {
  @scala.inline
  def apply(
    axisLabel: Label = null,
    axisLine: Line = null,
    axisPointer: Pointer = null,
    axisTick: Tick = null,
    boundaryGap: Boolean | (js.Array[String | Double]) = null,
    data: js.Array[String | Double | DataObject] = null,
    gridIndex: Int | Double = null,
    id: String = null,
    interval: Int | Double = null,
    inverse: js.UndefOr[Boolean] = js.undefined,
    logBase: Int | Double = null,
    max: Double | String | (js.Function1[/* value */ Anon_Max, Double]) = null,
    min: Double | String | (js.Function1[/* value */ Anon_Max, Double]) = null,
    minInterval: js.Any = null,
    name: String = null,
    nameGap: Int | Double = null,
    nameLocation: start | middle | center | end = null,
    nameRotate: Int | Double = null,
    nameTextStyle: TextStyleWithRich = null,
    offset: Int | Double = null,
    scale: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    splitArea: SplitArea = null,
    splitLine: SplitLine = null,
    splitNumber: Int | Double = null,
    triggerEvent: js.UndefOr[Boolean] = js.undefined,
    z: Int | Double = null,
    zlevel: Int | Double = null
  ): CartesianAxis = {
    val __obj = js.Dynamic.literal()
    if (axisLabel != null) __obj.updateDynamic("axisLabel")(axisLabel)
    if (axisLine != null) __obj.updateDynamic("axisLine")(axisLine)
    if (axisPointer != null) __obj.updateDynamic("axisPointer")(axisPointer)
    if (axisTick != null) __obj.updateDynamic("axisTick")(axisTick)
    if (boundaryGap != null) __obj.updateDynamic("boundaryGap")(boundaryGap.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (gridIndex != null) __obj.updateDynamic("gridIndex")(gridIndex.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse)
    if (logBase != null) __obj.updateDynamic("logBase")(logBase.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minInterval != null) __obj.updateDynamic("minInterval")(minInterval)
    if (name != null) __obj.updateDynamic("name")(name)
    if (nameGap != null) __obj.updateDynamic("nameGap")(nameGap.asInstanceOf[js.Any])
    if (nameLocation != null) __obj.updateDynamic("nameLocation")(nameLocation.asInstanceOf[js.Any])
    if (nameRotate != null) __obj.updateDynamic("nameRotate")(nameRotate.asInstanceOf[js.Any])
    if (nameTextStyle != null) __obj.updateDynamic("nameTextStyle")(nameTextStyle)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (splitArea != null) __obj.updateDynamic("splitArea")(splitArea)
    if (splitLine != null) __obj.updateDynamic("splitLine")(splitLine)
    if (splitNumber != null) __obj.updateDynamic("splitNumber")(splitNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(triggerEvent)) __obj.updateDynamic("triggerEvent")(triggerEvent)
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartesianAxis]
  }
}

