package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripLine extends js.Object {
  
  /** Specifies date to render striplines in Gantt
    */
  var day: js.UndefOr[String] = js.native
  
  /** Specifies label to be displayed for striplines in Gantt
    */
  var label: js.UndefOr[String] = js.native
  
  /** Specifies the line color for rendered striplines in Gantt
    */
  var lineColor: js.UndefOr[String] = js.native
  
  /** Specifies line style for rendered striplines in Gantt
    */
  var lineStyle: js.UndefOr[String] = js.native
  
  /** Specifies the width of the stripline in Gantt
    */
  var lineWidth: js.UndefOr[String] = js.native
}
object StripLine {
  
  @scala.inline
  def apply(): StripLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StripLine]
  }
  
  @scala.inline
  implicit class StripLineOps[Self <: StripLine] (val x: Self) extends AnyVal {
    
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
    def setDay(value: String): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    
    @scala.inline
    def setLineStyle(value: String): Self = this.set("lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineStyle: Self = this.set("lineStyle", js.undefined)
    
    @scala.inline
    def setLineWidth(value: String): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
  }
}
