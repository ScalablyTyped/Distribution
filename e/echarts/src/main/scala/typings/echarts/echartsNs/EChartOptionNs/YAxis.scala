package typings.echarts.echartsNs.EChartOptionNs

import typings.echarts.Anon_Max
import typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxis
import typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.DataObject
import typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.Label
import typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.Pointer
import typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.SplitArea
import typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.SplitLine
import typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.Tick
import typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.CartesianAxisNs.Type
import typings.echarts.echartsNs.EChartOptionNs.BasicComponentsNs.Line
import typings.echarts.echartsStrings.center
import typings.echarts.echartsStrings.end
import typings.echarts.echartsStrings.left
import typings.echarts.echartsStrings.middle
import typings.echarts.echartsStrings.right
import typings.echarts.echartsStrings.start
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
trait YAxis extends CartesianAxis {
  /**
    * The first y axis in grid defaults to be the left (`'left'`)
    * of the grid, and the second y axis is on the other side
    * against the first y axis.
    */
  var position: js.UndefOr[left | right] = js.undefined
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
  var `type`: js.UndefOr[Type] = js.undefined
}

object YAxis {
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
    position: left | right = null,
    scale: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    splitArea: SplitArea = null,
    splitLine: SplitLine = null,
    splitNumber: Int | Double = null,
    triggerEvent: js.UndefOr[Boolean] = js.undefined,
    `type`: Type = null,
    z: Int | Double = null,
    zlevel: Int | Double = null
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

