package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Method
import typings.gapiCalendar.anon.Notifications
import typings.gapiCalendar.gapiCalendarStrings.calendarNumbersigncalendarListEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarListEntry extends js.Object {
  
  // The effective access role that the authenticated user has on the calendar. Read-only.
  var accessRole: AccessRoleWithoutNone = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var colorId: js.UndefOr[String] = js.native
  
  var defaultReminders: js.Array[Method] = js.native
  
  var deleted: js.UndefOr[Boolean] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var etag: typings.gapiCalendar.gapi.client.calendar.etag = js.native
  
  var foregroundColor: js.UndefOr[String] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var id: String = js.native
  
  var kind: calendarNumbersigncalendarListEntry = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var notificationSettings: js.UndefOr[Notifications] = js.native
  
  var primary: js.UndefOr[Boolean] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  var summary: String = js.native
  
  var summaryOverride: js.UndefOr[String] = js.native
  
  var timeZone: js.UndefOr[String] = js.native
}
object CalendarListEntry {
  
  @scala.inline
  def apply(
    accessRole: AccessRoleWithoutNone,
    defaultReminders: js.Array[Method],
    etag: etag,
    id: String,
    kind: calendarNumbersigncalendarListEntry,
    summary: String
  ): CalendarListEntry = {
    val __obj = js.Dynamic.literal(accessRole = accessRole.asInstanceOf[js.Any], defaultReminders = defaultReminders.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarListEntry]
  }
  
  @scala.inline
  implicit class CalendarListEntryOps[Self <: CalendarListEntry] (val x: Self) extends AnyVal {
    
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
    def setAccessRole(value: AccessRoleWithoutNone): Self = this.set("accessRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRemindersVarargs(value: Method*): Self = this.set("defaultReminders", js.Array(value :_*))
    
    @scala.inline
    def setDefaultReminders(value: js.Array[Method]): Self = this.set("defaultReminders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtag(value: etag): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: calendarNumbersigncalendarListEntry): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setColorId(value: String): Self = this.set("colorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorId: Self = this.set("colorId", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setForegroundColor(value: String): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForegroundColor: Self = this.set("foregroundColor", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setNotificationSettings(value: Notifications): Self = this.set("notificationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationSettings: Self = this.set("notificationSettings", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSummaryOverride(value: String): Self = this.set("summaryOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaryOverride: Self = this.set("summaryOverride", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
}
