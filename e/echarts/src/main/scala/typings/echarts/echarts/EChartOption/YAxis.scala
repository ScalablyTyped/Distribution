package typings.echarts.echarts.EChartOption

import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Type
import typings.echarts.echartsStrings.left
import typings.echarts.echartsStrings.right
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
@js.native
trait YAxis extends CartesianAxis {
  /**
    * The first y axis in grid defaults to be the left (`'left'`)
    * of the grid, and the second y axis is on the other side
    * against the first y axis.
    */
  var position: js.UndefOr[left | right] = js.native
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
  var `type`: js.UndefOr[Type] = js.native
}

object YAxis {
  @scala.inline
  def apply(): YAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YAxis]
  }
  @scala.inline
  implicit class YAxisOps[Self <: YAxis] (val x: Self) extends AnyVal {
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
    def setPosition(value: left | right): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

