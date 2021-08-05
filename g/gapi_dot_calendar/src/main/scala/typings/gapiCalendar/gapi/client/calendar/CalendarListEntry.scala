package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Method
import typings.gapiCalendar.anon.Notifications
import typings.gapiCalendar.gapiCalendarStrings.calendarNumbersigncalendarListEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarListEntry extends StObject {
  
  // The effective access role that the authenticated user has on the calendar. Read-only.
  var accessRole: AccessRoleWithoutNone
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var colorId: js.UndefOr[String] = js.undefined
  
  var defaultReminders: js.Array[Method]
  
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var etag: typings.gapiCalendar.gapi.client.calendar.etag
  
  var foregroundColor: js.UndefOr[String] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var id: String
  
  var kind: calendarNumbersigncalendarListEntry
  
  var location: js.UndefOr[String] = js.undefined
  
  var notificationSettings: js.UndefOr[Notifications] = js.undefined
  
  var primary: js.UndefOr[Boolean] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var summary: String
  
  var summaryOverride: js.UndefOr[String] = js.undefined
  
  var timeZone: js.UndefOr[String] = js.undefined
}
object CalendarListEntry {
  
  inline def apply(
    accessRole: AccessRoleWithoutNone,
    defaultReminders: js.Array[Method],
    etag: etag,
    id: String,
    summary: String
  ): CalendarListEntry = {
    val __obj = js.Dynamic.literal(accessRole = accessRole.asInstanceOf[js.Any], defaultReminders = defaultReminders.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = "calendar#calendarListEntry", summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarListEntry]
  }
  
  extension [Self <: CalendarListEntry](x: Self) {
    
    inline def setAccessRole(value: AccessRoleWithoutNone): Self = StObject.set(x, "accessRole", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setColorId(value: String): Self = StObject.set(x, "colorId", value.asInstanceOf[js.Any])
    
    inline def setColorIdUndefined: Self = StObject.set(x, "colorId", js.undefined)
    
    inline def setDefaultReminders(value: js.Array[Method]): Self = StObject.set(x, "defaultReminders", value.asInstanceOf[js.Any])
    
    inline def setDefaultRemindersVarargs(value: Method*): Self = StObject.set(x, "defaultReminders", js.Array(value :_*))
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: etag): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setForegroundColor(value: String): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    inline def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: calendarNumbersigncalendarListEntry): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNotificationSettings(value: Notifications): Self = StObject.set(x, "notificationSettings", value.asInstanceOf[js.Any])
    
    inline def setNotificationSettingsUndefined: Self = StObject.set(x, "notificationSettings", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryOverride(value: String): Self = StObject.set(x, "summaryOverride", value.asInstanceOf[js.Any])
    
    inline def setSummaryOverrideUndefined: Self = StObject.set(x, "summaryOverride", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
