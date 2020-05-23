package typings.echarts.echarts.EChartOption

import typings.echarts.anon.Max
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.DataObject
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Label
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.MinorSplitLine
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.MinorTick
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Pointer
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.SplitArea
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.SplitLine
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Tick
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Type
import typings.echarts.echarts.EChartOption.BasicComponents.Line
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
  * @see https://echarts.apache.org/en/option.html#yAxis
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
    * @see https://echarts.apache.org/en/option.html#yAxis.type
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
    gridIndex: js.UndefOr[Double] = js.undefined,
    id: String = null,
    interval: js.UndefOr[Double] = js.undefined,
    inverse: js.UndefOr[Boolean] = js.undefined,
    logBase: js.UndefOr[Double] = js.undefined,
    max: Double | String | (js.Function1[/* value */ Max, Double]) = null,
    min: Double | String | (js.Function1[/* value */ Max, Double]) = null,
    minInterval: js.Any = null,
    minorSplitLine: MinorSplitLine = null,
    minorTick: MinorTick = null,
    name: String = null,
    nameGap: js.UndefOr[Double] = js.undefined,
    nameLocation: start | middle | center | end = null,
    nameRotate: js.UndefOr[Double] = js.undefined,
    nameTextStyle: TextStyleWithRich = null,
    offset: js.UndefOr[Double] = js.undefined,
    position: left | right = null,
    scale: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    splitArea: SplitArea = null,
    splitLine: SplitLine = null,
    splitNumber: js.UndefOr[Double] = js.undefined,
    triggerEvent: js.UndefOr[Boolean] = js.undefined,
    `type`: Type = null,
    z: js.UndefOr[Double] = js.undefined,
    zlevel: js.UndefOr[Double] = js.undefined
  ): YAxis = {
    val __obj = js.Dynamic.literal()
    if (axisLabel != null) __obj.updateDynamic("axisLabel")(axisLabel.asInstanceOf[js.Any])
    if (axisLine != null) __obj.updateDynamic("axisLine")(axisLine.asInstanceOf[js.Any])
    if (axisPointer != null) __obj.updateDynamic("axisPointer")(axisPointer.asInstanceOf[js.Any])
    if (axisTick != null) __obj.updateDynamic("axisTick")(axisTick.asInstanceOf[js.Any])
    if (boundaryGap != null) __obj.updateDynamic("boundaryGap")(boundaryGap.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(gridIndex)) __obj.updateDynamic("gridIndex")(gridIndex.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logBase)) __obj.updateDynamic("logBase")(logBase.get.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minInterval != null) __obj.updateDynamic("minInterval")(minInterval.asInstanceOf[js.Any])
    if (minorSplitLine != null) __obj.updateDynamic("minorSplitLine")(minorSplitLine.asInstanceOf[js.Any])
    if (minorTick != null) __obj.updateDynamic("minorTick")(minorTick.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(nameGap)) __obj.updateDynamic("nameGap")(nameGap.get.asInstanceOf[js.Any])
    if (nameLocation != null) __obj.updateDynamic("nameLocation")(nameLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(nameRotate)) __obj.updateDynamic("nameRotate")(nameRotate.get.asInstanceOf[js.Any])
    if (nameTextStyle != null) __obj.updateDynamic("nameTextStyle")(nameTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (splitArea != null) __obj.updateDynamic("splitArea")(splitArea.asInstanceOf[js.Any])
    if (splitLine != null) __obj.updateDynamic("splitLine")(splitLine.asInstanceOf[js.Any])
    if (!js.isUndefined(splitNumber)) __obj.updateDynamic("splitNumber")(splitNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(triggerEvent)) __obj.updateDynamic("triggerEvent")(triggerEvent.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zlevel)) __obj.updateDynamic("zlevel")(zlevel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[YAxis]
  }
}

