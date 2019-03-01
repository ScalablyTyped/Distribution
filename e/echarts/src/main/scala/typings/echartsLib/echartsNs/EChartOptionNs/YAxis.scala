package typings
package echartsLib.echartsNs.EChartOptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The y axis in cartesian(rectangular) coordinate.
  * Usually a single grid component can place at most 2 y axis,
  * one on the left and another on the right. offset can be used
  * to avoid overlap when you need to put more than two y axis.
  *
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis
  */
trait YAxis
  extends echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxis {
  /**
    * The first y axis in grid defaults to be the left (`'left'`)
    * of the grid, and the second y axis is on the other side
    * against the first y axis.
    */
  var position: js.UndefOr[echartsLib.echartsLibStrings.left | echartsLib.echartsLibStrings.right] = js.undefined
  /**
    * Options:
    * + 'value' - Numerical axis, suitable for continuous data.
    * + 'category' Category axis, suitable for discrete category data.
    *   Data should only be set via 'data' for this type.
    * + 'time' Time axis, suitable for continuous time series data.
    *   As compared to value axis, it has a better formatting for time
    *   and a different tick calculation method.
    *   For example, it decides to use month, week, day or hour for tick
    *   based on the range of span.
    * + 'log' Log axis, suitable for log data.
    *
    * @default 'value'
    * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#yAxis.type
    */
  var `type`: js.UndefOr[echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.Type] = js.undefined
}

object YAxis {
  @scala.inline
  def apply(
    axisLabel: echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.Label = null,
    axisLine: echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.Line = null,
    axisPointer: echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.Pointer = null,
    axisTick: echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.Tick = null,
    boundaryGap: scala.Boolean | (js.Array[java.lang.String | scala.Double]) = null,
    data: js.Array[
      java.lang.String | echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.DataObject
    ] = null,
    gridIndex: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    interval: scala.Int | scala.Double = null,
    inverse: js.UndefOr[scala.Boolean] = js.undefined,
    logBase: scala.Int | scala.Double = null,
    max: scala.Double | java.lang.String = null,
    min: scala.Double | java.lang.String = null,
    minInterval: js.Any = null,
    name: java.lang.String = null,
    nameGap: scala.Int | scala.Double = null,
    nameLocation: echartsLib.echartsLibStrings.start | echartsLib.echartsLibStrings.middle | echartsLib.echartsLibStrings.center | echartsLib.echartsLibStrings.end = null,
    nameRotate: scala.Int | scala.Double = null,
    nameTextStyle: echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.TextStyle = null,
    offset: scala.Int | scala.Double = null,
    position: echartsLib.echartsLibStrings.left | echartsLib.echartsLibStrings.right = null,
    scale: js.UndefOr[scala.Boolean] = js.undefined,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    splitArea: echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.SplitArea = null,
    splitLine: echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.SplitLine = null,
    splitNumber: scala.Int | scala.Double = null,
    triggerEvent: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: echartsLib.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.Type = null,
    z: scala.Int | scala.Double = null,
    zlevel: scala.Int | scala.Double = null
  ): YAxis = {
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
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (splitArea != null) __obj.updateDynamic("splitArea")(splitArea)
    if (splitLine != null) __obj.updateDynamic("splitLine")(splitLine)
    if (splitNumber != null) __obj.updateDynamic("splitNumber")(splitNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(triggerEvent)) __obj.updateDynamic("triggerEvent")(triggerEvent)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAxis]
  }
}

