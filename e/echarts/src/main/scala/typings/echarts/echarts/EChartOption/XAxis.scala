package typings.echarts.echarts.EChartOption

import typings.echarts.AnonMax
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.DataObject
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Label
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Pointer
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.SplitArea
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.SplitLine
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Tick
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Type
import typings.echarts.echarts.EChartOption.BasicComponents.Line
import typings.echarts.echartsStrings.bottom
import typings.echarts.echartsStrings.center
import typings.echarts.echartsStrings.end
import typings.echarts.echartsStrings.middle
import typings.echarts.echartsStrings.start
import typings.echarts.echartsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The x axis in cartesian(rectangular) coordinate.
  * Usually a single grid component can place at most 2 x axis,
  * one on the bottom and another on the top.
  * offset can be used to avoid overlap when you need to put more
  * than two x axis.
  *
  * @see https://echarts.apache.org/en/option.html#xAxis
  */
trait XAxis extends CartesianAxis {
  /**
    * The first x axis in grid defaults to be on the bottom of the grid,
    * and the second x axis is on the other side against the first x axis.
    *
    * @default ''
    */
  var position: js.UndefOr[top | bottom] = js.undefined
  /**
    * Options:
    * + 'value' - Numerical axis, suitable for continuous data.
    * + 'category' Category axis, suitable for discrete category data.
    *   Data should only be set via data for this type.
    * + 'time' Time axis, suitable for continuous time series data.
    *   As compared to value axis, it has a better formatting for time
    *   and a different tick calculation method.
    *   For example, it decides to use month, week, day or hour for tick
    *   based on the range of span.
    * + 'log' Log axis, suitable for log data.
    *
    * @default 'value'
    * @see https://echarts.apache.org/en/option.html#xAxis.type
    */
  var `type`: js.UndefOr[Type] = js.undefined
}

object XAxis {
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
    max: Double | String | (js.Function1[/* value */ AnonMax, Double]) = null,
    min: Double | String | (js.Function1[/* value */ AnonMax, Double]) = null,
    minInterval: js.Any = null,
    name: String = null,
    nameGap: Int | Double = null,
    nameLocation: start | middle | center | end = null,
    nameRotate: Int | Double = null,
    nameTextStyle: TextStyleWithRich = null,
    offset: Int | Double = null,
    position: top | bottom = null,
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
  ): XAxis = {
    val __obj = js.Dynamic.literal()
    if (axisLabel != null) __obj.updateDynamic("axisLabel")(axisLabel.asInstanceOf[js.Any])
    if (axisLine != null) __obj.updateDynamic("axisLine")(axisLine.asInstanceOf[js.Any])
    if (axisPointer != null) __obj.updateDynamic("axisPointer")(axisPointer.asInstanceOf[js.Any])
    if (axisTick != null) __obj.updateDynamic("axisTick")(axisTick.asInstanceOf[js.Any])
    if (boundaryGap != null) __obj.updateDynamic("boundaryGap")(boundaryGap.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (gridIndex != null) __obj.updateDynamic("gridIndex")(gridIndex.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (logBase != null) __obj.updateDynamic("logBase")(logBase.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minInterval != null) __obj.updateDynamic("minInterval")(minInterval.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nameGap != null) __obj.updateDynamic("nameGap")(nameGap.asInstanceOf[js.Any])
    if (nameLocation != null) __obj.updateDynamic("nameLocation")(nameLocation.asInstanceOf[js.Any])
    if (nameRotate != null) __obj.updateDynamic("nameRotate")(nameRotate.asInstanceOf[js.Any])
    if (nameTextStyle != null) __obj.updateDynamic("nameTextStyle")(nameTextStyle.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (splitArea != null) __obj.updateDynamic("splitArea")(splitArea.asInstanceOf[js.Any])
    if (splitLine != null) __obj.updateDynamic("splitLine")(splitLine.asInstanceOf[js.Any])
    if (splitNumber != null) __obj.updateDynamic("splitNumber")(splitNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(triggerEvent)) __obj.updateDynamic("triggerEvent")(triggerEvent.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAxis]
  }
}

