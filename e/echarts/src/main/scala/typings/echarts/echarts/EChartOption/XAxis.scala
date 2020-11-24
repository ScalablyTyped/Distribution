package typings.echarts.echarts.EChartOption

import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis
import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Type
import typings.echarts.echartsStrings.bottom
import typings.echarts.echartsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The x axis in cartesian(rectangular) coordinate.
  * Usually a single grid component can place at most 2 x axis,
  * one on the bottom and another on the top.
  * offset can be used to avoid overlap when you need to put more
  * than two x axis.
  *
  * @see https://echarts.apache.org/en/option.html#xAxis
  */
@js.native
trait XAxis extends CartesianAxis {
  
  /**
    * The first x axis in grid defaults to be on the bottom of the grid,
    * and the second x axis is on the other side against the first x axis.
    *
    * @default ''
    */
  var position: js.UndefOr[top | bottom] = js.native
  
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
  var `type`: js.UndefOr[Type] = js.native
}
object XAxis {
  
  @scala.inline
  def apply(): XAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XAxis]
  }
  
  @scala.inline
  implicit class XAxisOps[Self <: XAxis] (val x: Self) extends AnyVal {
    
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
    def setPosition(value: top | bottom): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
