package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarListEntryNotificationSettings extends js.Object {
  
  var notifications: js.UndefOr[js.Array[CalendarNotification]] = js.native
}
object CalendarListEntryNotificationSettings {
  
  @scala.inline
  def apply(): CalendarListEntryNotificationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarListEntryNotificationSettings]
  }
  
  @scala.inline
  implicit class CalendarListEntryNotificationSettingsOps[Self <: CalendarListEntryNotificationSettings] (val x: Self) extends AnyVal {
    
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
    def setNotificationsVarargs(value: CalendarNotification*): Self = this.set("notifications", js.Array(value :_*))
    
    @scala.inline
    def setNotifications(value: js.Array[CalendarNotification]): Self = this.set("notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifications: Self = this.set("notifications", js.undefined)
  }
}
