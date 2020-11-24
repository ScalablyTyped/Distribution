package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HolidayCutoff extends js.Object {
  
  var deadlineDate: js.UndefOr[String] = js.native
  
  var deadlineHour: js.UndefOr[Double] = js.native
  
  var deadlineTimezone: js.UndefOr[String] = js.native
  
  var holidayId: js.UndefOr[String] = js.native
  
  var visibleFromDate: js.UndefOr[String] = js.native
}
object HolidayCutoff {
  
  @scala.inline
  def apply(): HolidayCutoff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HolidayCutoff]
  }
  
  @scala.inline
  implicit class HolidayCutoffOps[Self <: HolidayCutoff] (val x: Self) extends AnyVal {
    
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
    def setDeadlineDate(value: String): Self = this.set("deadlineDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadlineDate: Self = this.set("deadlineDate", js.undefined)
    
    @scala.inline
    def setDeadlineHour(value: Double): Self = this.set("deadlineHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadlineHour: Self = this.set("deadlineHour", js.undefined)
    
    @scala.inline
    def setDeadlineTimezone(value: String): Self = this.set("deadlineTimezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadlineTimezone: Self = this.set("deadlineTimezone", js.undefined)
    
    @scala.inline
    def setHolidayId(value: String): Self = this.set("holidayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHolidayId: Self = this.set("holidayId", js.undefined)
    
    @scala.inline
    def setVisibleFromDate(value: String): Self = this.set("visibleFromDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleFromDate: Self = this.set("visibleFromDate", js.undefined)
  }
}
