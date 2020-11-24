package typings.echarts.echarts.EChartOption.Calendar

import typings.echarts.echartsStrings.end
import typings.echarts.echartsStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonthLabel extends Label {
  
  /**
    * Formatter of month text label, which supports string template and callback function.
    */
  var formatter: js.UndefOr[String | MonthLabelFormatter] = js.native
  
  /**
    * Position of week, at the beginning or end of the range.
    *
    * @default 'start'
    */
  var position: js.UndefOr[start | end] = js.native
}
object MonthLabel {
  
  @scala.inline
  def apply(): MonthLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonthLabel]
  }
  
  @scala.inline
  implicit class MonthLabelOps[Self <: MonthLabel] (val x: Self) extends AnyVal {
    
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
    def setFormatterFunction1(value: /* params */ MonthLabelFormatterParams => String): Self = this.set("formatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatter(value: String | MonthLabelFormatter): Self = this.set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setPosition(value: start | end): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
