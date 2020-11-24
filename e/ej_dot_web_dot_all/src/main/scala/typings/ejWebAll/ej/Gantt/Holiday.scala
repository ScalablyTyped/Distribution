package typings.ejWebAll.ej.Gantt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Holiday extends js.Object {
  
  /** Specifies the background color for holiday date in Gantt Schedule
    */
  var background: js.UndefOr[String] = js.native
  
  /** Specifies holiday date to be displayed in Gantt
    */
  var day: js.UndefOr[String] = js.native
  
  /** Specifies the label to be displayed for rendered holiday in Gantt
    */
  var label: js.UndefOr[String] = js.native
}
object Holiday {
  
  @scala.inline
  def apply(): Holiday = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Holiday]
  }
  
  @scala.inline
  implicit class HolidayOps[Self <: Holiday] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setDay(value: String): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
