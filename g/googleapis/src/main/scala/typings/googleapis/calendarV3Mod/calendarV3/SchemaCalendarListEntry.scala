package typings.googleapis.calendarV3Mod.calendarV3

import typings.googleapis.anon.Notifications
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCalendarListEntry extends StObject {
  
  /**
    * The effective access role that the authenticated user has on the calendar. Read-only. Possible values are:
    * - "freeBusyReader" - Provides read access to free/busy information.
    * - "reader" - Provides read access to the calendar. Private events will appear to users with reader access, but event details will be hidden.
    * - "writer" - Provides read and write access to the calendar. Private events will appear to users with writer access, and event details will be visible.
    * - "owner" - Provides ownership of the calendar. This role has all of the permissions of the writer role with the additional ability to see and manipulate ACLs.
    */
  var accessRole: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The main color of the calendar in the hexadecimal format "#0088aa". This property supersedes the index-based colorId property. To set or change this property, you need to specify colorRgbFormat=true in the parameters of the insert, update and patch methods. Optional.
    */
  var backgroundColor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The color of the calendar. This is an ID referring to an entry in the calendar section of the colors definition (see the colors endpoint). This property is superseded by the backgroundColor and foregroundColor properties and can be ignored when using these properties. Optional.
    */
  var colorId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Conferencing properties for this calendar, for example what types of conferences are allowed.
    */
  var conferenceProperties: js.UndefOr[SchemaConferenceProperties] = js.undefined
  
  /**
    * The default reminders that the authenticated user has for this calendar.
    */
  var defaultReminders: js.UndefOr[js.Array[SchemaEventReminder]] = js.undefined
  
  /**
    * Whether this calendar list entry has been deleted from the calendar list. Read-only. Optional. The default is False.
    */
  var deleted: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Description of the calendar. Optional. Read-only.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The foreground color of the calendar in the hexadecimal format "#ffffff". This property supersedes the index-based colorId property. To set or change this property, you need to specify colorRgbFormat=true in the parameters of the insert, update and patch methods. Optional.
    */
  var foregroundColor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the calendar has been hidden from the list. Optional. The attribute is only returned when the calendar is hidden, in which case the value is true.
    */
  var hidden: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Identifier of the calendar.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the resource ("calendar#calendarListEntry").
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Geographic location of the calendar as free-form text. Optional. Read-only.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The notifications that the authenticated user is receiving for this calendar.
    */
  var notificationSettings: js.UndefOr[Notifications | Null] = js.undefined
  
  /**
    * Whether the calendar is the primary calendar of the authenticated user. Read-only. Optional. The default is False.
    */
  var primary: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the calendar content shows up in the calendar UI. Optional. The default is False.
    */
  var selected: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Title of the calendar. Read-only.
    */
  var summary: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The summary that the authenticated user has set for this calendar. Optional.
    */
  var summaryOverride: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time zone of the calendar. Optional. Read-only.
    */
  var timeZone: js.UndefOr[String | Null] = js.undefined
}
object SchemaCalendarListEntry {
  
  inline def apply(): SchemaCalendarListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCalendarListEntry]
  }
  
  extension [Self <: SchemaCalendarListEntry](x: Self) {
    
    inline def setAccessRole(value: String): Self = StObject.set(x, "accessRole", value.asInstanceOf[js.Any])
    
    inline def setAccessRoleNull: Self = StObject.set(x, "accessRole", null)
    
    inline def setAccessRoleUndefined: Self = StObject.set(x, "accessRole", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setColorId(value: String): Self = StObject.set(x, "colorId", value.asInstanceOf[js.Any])
    
    inline def setColorIdNull: Self = StObject.set(x, "colorId", null)
    
    inline def setColorIdUndefined: Self = StObject.set(x, "colorId", js.undefined)
    
    inline def setConferenceProperties(value: SchemaConferenceProperties): Self = StObject.set(x, "conferenceProperties", value.asInstanceOf[js.Any])
    
    inline def setConferencePropertiesUndefined: Self = StObject.set(x, "conferenceProperties", js.undefined)
    
    inline def setDefaultReminders(value: js.Array[SchemaEventReminder]): Self = StObject.set(x, "defaultReminders", value.asInstanceOf[js.Any])
    
    inline def setDefaultRemindersUndefined: Self = StObject.set(x, "defaultReminders", js.undefined)
    
    inline def setDefaultRemindersVarargs(value: SchemaEventReminder*): Self = StObject.set(x, "defaultReminders", js.Array(value*))
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedNull: Self = StObject.set(x, "deleted", null)
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setForegroundColor(value: String): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    inline def setForegroundColorNull: Self = StObject.set(x, "foregroundColor", null)
    
    inline def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenNull: Self = StObject.set(x, "hidden", null)
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNotificationSettings(value: Notifications): Self = StObject.set(x, "notificationSettings", value.asInstanceOf[js.Any])
    
    inline def setNotificationSettingsNull: Self = StObject.set(x, "notificationSettings", null)
    
    inline def setNotificationSettingsUndefined: Self = StObject.set(x, "notificationSettings", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryNull: Self = StObject.set(x, "primary", null)
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedNull: Self = StObject.set(x, "selected", null)
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryNull: Self = StObject.set(x, "summary", null)
    
    inline def setSummaryOverride(value: String): Self = StObject.set(x, "summaryOverride", value.asInstanceOf[js.Any])
    
    inline def setSummaryOverrideNull: Self = StObject.set(x, "summaryOverride", null)
    
    inline def setSummaryOverrideUndefined: Self = StObject.set(x, "summaryOverride", js.undefined)
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
