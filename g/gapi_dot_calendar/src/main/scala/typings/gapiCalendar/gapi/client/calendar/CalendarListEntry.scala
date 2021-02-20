package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Method
import typings.gapiCalendar.anon.Notifications
import typings.gapiCalendar.gapiCalendarStrings.calendarNumbersigncalendarListEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarListEntry extends StObject {
  
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
  implicit class CalendarListEntryMutableBuilder[Self <: CalendarListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessRole(value: AccessRoleWithoutNone): Self = StObject.set(x, "accessRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setColorId(value: String): Self = StObject.set(x, "colorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIdUndefined: Self = StObject.set(x, "colorId", js.undefined)
    
    @scala.inline
    def setDefaultReminders(value: js.Array[Method]): Self = StObject.set(x, "defaultReminders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRemindersVarargs(value: Method*): Self = StObject.set(x, "defaultReminders", js.Array(value :_*))
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEtag(value: etag): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundColor(value: String): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: calendarNumbersigncalendarListEntry): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setNotificationSettings(value: Notifications): Self = StObject.set(x, "notificationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationSettingsUndefined: Self = StObject.set(x, "notificationSettings", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryOverride(value: String): Self = StObject.set(x, "summaryOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryOverrideUndefined: Self = StObject.set(x, "summaryOverride", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
