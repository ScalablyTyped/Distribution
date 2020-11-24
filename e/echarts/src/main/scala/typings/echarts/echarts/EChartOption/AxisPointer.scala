package typings.echarts.echarts.EChartOption

import typings.echarts.echarts.EChartOption.BasicComponents.CartesianAxis.Pointer
import typings.echarts.echartsStrings.click
import typings.echarts.echartsStrings.mousemove
import typings.echarts.echartsStrings.mousemoveVerticallineclick
import typings.echarts.echartsStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @todo describe
  */
@js.native
trait AxisPointer extends Pointer {
  
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component
    * in option or API.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * axisPointers can be linked to each other.
    * The term 'link' represents that axes are synchronized
    * and move together.
    * Axes are linked according to the value of axisPointer.
    * See
    * [sampleA](https://echarts.apache.org/examples/en/view.html?c=candlestick-brush&edit=1&reset=1)
    * and
    * [sampleB](https://echarts.apache.org/examples/en/view.html?c=scatter-nutrients-matrix&edit=1&reset=1).
    * link is an array, where each item represents a 'link group'.
    * Axes will be linked when they are refered
    * in the same link group.
    *
    * @example:
    * link: [
    *     {
    *         // All axes with xAxisIndex 0, 3, 4 and yAxisName 'sameName' will be linked.
    *         xAxisIndex: [0, 3, 4],
    *         yAxisName: 'someName'
    *     },
    *     {
    *         // All axes with xAxisId 'aa', 'cc' and all angleAxis will be linked.
    *         xAxisId: ['aa', 'cc'],
    *         angleAxis: 'all'
    *     },
    *     ...
    * ]
    *
    * @see https://echarts.apache.org/en/option.html#axisPointer.link
    */
  var link: js.UndefOr[js.Array[js.Object]] = js.native
  
  /**
    * Conditions to trigger tooltip.
    * Options:
    * + `'mousemove'` - Trigger when mouse moves.
    * + `'click'` - Trigger when mouse clicks.
    * + `'mousemove|click'` - Trigger when mouse clicks and moves.
    *   `'none'` - Do not triggered by `'mousemove'` and `'click'`.
    *   Tooltip can be triggered and hidden manually by calling
    *   `action.tooltip.showTip` and `action.tooltip.hideTip`.
    *   It can also be triggered by `axisPointer.handle` in this case.
    *
    * This attribute is new to ECharts 3.0.
    *
    * @default 'mousemove|click'
    */
  var triggerOn: js.UndefOr[mousemove | click | mousemoveVerticallineclick | none] = js.native
}
object AxisPointer {
  
  @scala.inline
  def apply(): AxisPointer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisPointer]
  }
  
  @scala.inline
  implicit class AxisPointerOps[Self <: AxisPointer] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLinkVarargs(value: js.Object*): Self = this.set("link", js.Array(value :_*))
    
    @scala.inline
    def setLink(value: js.Array[js.Object]): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setTriggerOn(value: mousemove | click | mousemoveVerticallineclick | none): Self = this.set("triggerOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerOn: Self = this.set("triggerOn", js.undefined)
  }
}
