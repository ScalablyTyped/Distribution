package typings.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarListInsertParameters extends js.Object {
  
  // Parameters
  // Optional query parameters
  var colorRgbFormat: js.UndefOr[Boolean] = js.native
  
  // CalendarList resource
  var resource: CalendarListInput = js.native
}
object CalendarListInsertParameters {
  
  @scala.inline
  def apply(resource: CalendarListInput): CalendarListInsertParameters = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarListInsertParameters]
  }
  
  @scala.inline
  implicit class CalendarListInsertParametersOps[Self <: CalendarListInsertParameters] (val x: Self) extends AnyVal {
    
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
    def setResource(value: CalendarListInput): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRgbFormat(value: Boolean): Self = this.set("colorRgbFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorRgbFormat: Self = this.set("colorRgbFormat", js.undefined)
  }
}
