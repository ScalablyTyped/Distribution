package typings
package echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CartesianAxis extends js.Object {
  /**
    * Settings related to axis label.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.axisLabel
    */
  var axisLabel: js.UndefOr[echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.Label] = js.undefined
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
  var axisPointer: js.UndefOr[echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.Pointer] = js.undefined
  /**
    * Settings related to axis tick.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.axisTick
    */
  var axisTick: js.UndefOr[echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.Tick] = js.undefined
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
  var boundaryGap: js.UndefOr[scala.Boolean | (js.Array[java.lang.String | scala.Double])] = js.undefined
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
  var data: js.UndefOr[
    js.Array[
      java.lang.String | echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.DataObject
    ]
  ] = js.undefined
  /**
    * The index of grid which this axis belongs to.
    * Defaults to be in the first grid.
    *
    * @default 0
    */
  var gridIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option or API.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
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
  var interval: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether axis is inversed. New option from ECharts 3.
    *
    * @default false
    */
  var inverse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Base of logarithm, which is valid only for numeric axes with type:
    * `'log'`.
    *
    * @default 10
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.logBase
    */
  var logBase: js.UndefOr[scala.Double] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.max
    */
  var max: js.UndefOr[scala.Double | java.lang.String] = js.undefined
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
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.min
    */
  var min: js.UndefOr[scala.Double | java.lang.String] = js.undefined
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
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Gap between axis name and axis line.
    *
    * @default 15
    */
  var nameGap: js.UndefOr[scala.Double] = js.undefined
  /**
    * Location of axis name.
    *
    * @default 'start'
    */
  var nameLocation: js.UndefOr[
    echartsLib.echartsLibStrings.start | echartsLib.echartsLibStrings.middle | echartsLib.echartsLibStrings.center | echartsLib.echartsLibStrings.end
  ] = js.undefined
  /**
    * Rotation of axis name.
    *
    * @default null
    */
  var nameRotate: js.UndefOr[scala.Double] = js.undefined
  /**
    * Text style of axis name.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.nameTextStyle
    */
  var nameTextStyle: js.UndefOr[echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.TextStyle] = js.undefined
  /**
    * Offset of this axis relative to default position.
    * Useful when multiple axis of this type has same position value.
    *
    * @default 0
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.offset
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
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
  var scale: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If show this axis.
    *
    * @default 'true'
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * True for axis that cannot be interacted with.
    *
    * @default false
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Split area of axis in grid area, not shown by default.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.splitArea
    */
  var splitArea: js.UndefOr[echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.SplitArea] = js.undefined
  /**
    * SplitLine of axis in grid area.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.splitLine
    */
  var splitLine: js.UndefOr[echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.SplitLine] = js.undefined
  /**
    * Number of segments that the axis is split into.
    * Note that this number serves only as a recommendation,
    * and the true segments may be adjusted based on readability.
    * This is unavailable for category axis.
    *
    * @default 5
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.splitNumber
    */
  var splitNumber: js.UndefOr[scala.Double] = js.undefined
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
  var triggerEvent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * z value of all graghical elements in this axis,
    * which controls order of drawing graphical components.
    * Components with smaller z values may be overwritten by those
    * with larger z values.
    * z has a lower priority to zlevel, and will not create new Canvas.
    *
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.z
    */
  var z: js.UndefOr[scala.Double] = js.undefined
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
  var zlevel: js.UndefOr[scala.Double] = js.undefined
}

