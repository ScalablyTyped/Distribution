package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeBusyRequest extends js.Object {
  
  var calendarExpansionMax: js.UndefOr[Double] = js.native
  
  var groupExpansionMax: js.UndefOr[Double] = js.native
  
  var items: js.UndefOr[js.Array[FreeBusyRequestItem]] = js.native
  
  var timeMax: js.UndefOr[String] = js.native
  
  var timeMin: js.UndefOr[String] = js.native
  
  var timeZone: js.UndefOr[String] = js.native
}
object FreeBusyRequest {
  
  @scala.inline
  def apply(): FreeBusyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeBusyRequest]
  }
  
  @scala.inline
  implicit class FreeBusyRequestOps[Self <: FreeBusyRequest] (val x: Self) extends AnyVal {
    
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
    def setCalendarExpansionMax(value: Double): Self = this.set("calendarExpansionMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarExpansionMax: Self = this.set("calendarExpansionMax", js.undefined)
    
    @scala.inline
    def setGroupExpansionMax(value: Double): Self = this.set("groupExpansionMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupExpansionMax: Self = this.set("groupExpansionMax", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: FreeBusyRequestItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[FreeBusyRequestItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setTimeMax(value: String): Self = this.set("timeMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeMax: Self = this.set("timeMax", js.undefined)
    
    @scala.inline
    def setTimeMin(value: String): Self = this.set("timeMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeMin: Self = this.set("timeMin", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
}
