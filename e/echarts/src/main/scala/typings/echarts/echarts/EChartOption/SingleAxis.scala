package typings.echarts.echarts.EChartOption

import typings.echarts.Anon_Max
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.DataObject
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Label
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Pointer
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.SplitArea
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.SplitLine
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Tick
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Type
import typings.echarts.echarts.EChartOption.BasicComponents.Line
import typings.echarts.echartsStrings.center
import typings.echarts.echartsStrings.end
import typings.echarts.echartsStrings.horizontal
import typings.echarts.echartsStrings.middle
import typings.echarts.echartsStrings.start
import typings.echarts.echartsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An axis with a single dimension. It can be used to display data in one dimension
  *
  * @see https://ecomfe.github.io/echarts-doc/public/en/option.html#xAxis
  */
trait SingleAxis extends CartesianAxis {
  /**
    * Distance between grid component and the bottom side of the container.
    * bottom value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    *
    * @default '5%'
    */
  var bottom: js.UndefOr[String | Double] = js.undefined
  /**
    * Height of grid component. Adaptive by default.
    *
    * @default 'auto'
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
    * Distance between grid component and the left side of the container.
    * left value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%';
    * and it can also be 'left', 'center', or 'right'.
    * If the left value is set to be 'left', 'center', or 'right',
    * then the component will be aligned automatically based on position.
    *
    * @default '5%'
    */
  var left: js.UndefOr[String | Double] = js.undefined
  /**
    * Orientation of the axis. By default, it's 'horizontal'.
    * You can set it to be 'vertical' to make a vertical axis.
    *
    * @default 'horizontal'
    */
  var orient: js.UndefOr[horizontal | vertical] = js.undefined
  /**
    * Distance between grid component and the right side of the container.
    * right value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%'.
    *
    * @default '5%'
    */
  var right: js.UndefOr[String | Double] = js.undefined
  /**
    * Distance between grid component and the top side of the container.
    * top value can be instant pixel value like 20;
    * it can also be percentage value relative to container width like '20%';
    * and it can also be 'top', 'middle', or 'bottom'.
    * If the left value is set to be 'top', 'middle', or 'bottom',
    * then the component will be aligned automatically based on position.
    *
    * @default '5%'
    */
  var top: js.UndefOr[String | Double] = js.undefined
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
    * @see https://echarts.apache.org/en/option.html#singleAxis.type
    */
  var `type`: js.UndefOr[Type] = js.undefined
  /**
    * Width of grid component. Adaptive by default.
    *
    * @default 'auto'
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object SingleAxis {
  @scala.inline
  def apply(
    axisLabel: Label = null,
    axisLine: Line = null,
    axisPointer: Pointer = null,
    axisTick: Tick = null,
    bottom: String | Double = null,
    boundaryGap: Boolean | (js.Array[String | Double]) = null,
    data: js.Array[String | Double | DataObject] = null,
    gridIndex: Int | Double = null,
    height: String | Double = null,
    id: String = null,
    interval: Int | Double = null,
    inverse: js.UndefOr[Boolean] = js.undefined,
    left: String | Double = null,
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
    orient: horizontal | vertical = null,
    right: String | Double = null,
    scale: js.UndefOr[Boolean] = js.undefined,
    show: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    splitArea: SplitArea = null,
    splitLine: SplitLine = null,
    splitNumber: Int | Double = null,
    top: String | Double = null,
    triggerEvent: js.UndefOr[Boolean] = js.undefined,
    `type`: Type = null,
    width: String | Double = null,
    z: Int | Double = null,
    zlevel: Int | Double = null
  ): SingleAxis = {
    val __obj = js.Dynamic.literal()
    if (axisLabel != null) __obj.updateDynamic("axisLabel")(axisLabel.asInstanceOf[js.Any])
    if (axisLine != null) __obj.updateDynamic("axisLine")(axisLine.asInstanceOf[js.Any])
    if (axisPointer != null) __obj.updateDynamic("axisPointer")(axisPointer.asInstanceOf[js.Any])
    if (axisTick != null) __obj.updateDynamic("axisTick")(axisTick.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (boundaryGap != null) __obj.updateDynamic("boundaryGap")(boundaryGap.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (gridIndex != null) __obj.updateDynamic("gridIndex")(gridIndex.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
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
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (splitArea != null) __obj.updateDynamic("splitArea")(splitArea.asInstanceOf[js.Any])
    if (splitLine != null) __obj.updateDynamic("splitLine")(splitLine.asInstanceOf[js.Any])
    if (splitNumber != null) __obj.updateDynamic("splitNumber")(splitNumber.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (!js.isUndefined(triggerEvent)) __obj.updateDynamic("triggerEvent")(triggerEvent.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleAxis]
  }
}

