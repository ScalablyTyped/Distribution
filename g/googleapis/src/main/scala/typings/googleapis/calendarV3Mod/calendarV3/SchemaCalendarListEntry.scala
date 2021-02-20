package typings.googleapis.calendarV3Mod.calendarV3

import typings.googleapis.anon.Notifications
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaCalendarListEntry extends StObject {
  
  /**
    * The effective access role that the authenticated user has on the
    * calendar. Read-only. Possible values are:   - &quot;freeBusyReader&quot;
    * - Provides read access to free/busy information.  - &quot;reader&quot; -
    * Provides read access to the calendar. Private events will appear to users
    * with reader access, but event details will be hidden.  -
    * &quot;writer&quot; - Provides read and write access to the calendar.
    * Private events will appear to users with writer access, and event details
    * will be visible.  - &quot;owner&quot; - Provides ownership of the
    * calendar. This role has all of the permissions of the writer role with
    * the additional ability to see and manipulate ACLs.
    */
  var accessRole: js.UndefOr[String] = js.native
  
  /**
    * The main color of the calendar in the hexadecimal format
    * &quot;#0088aa&quot;. This property supersedes the index-based colorId
    * property. To set or change this property, you need to specify
    * colorRgbFormat=true in the parameters of the insert, update and patch
    * methods. Optional.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * The color of the calendar. This is an ID referring to an entry in the
    * calendar section of the colors definition (see the colors endpoint). This
    * property is superseded by the backgroundColor and foregroundColor
    * properties and can be ignored when using these properties. Optional.
    */
  var colorId: js.UndefOr[String] = js.native
  
  /**
    * Conferencing properties for this calendar, for example what types of
    * conferences are allowed.
    */
  var conferenceProperties: js.UndefOr[SchemaConferenceProperties] = js.native
  
  /**
    * The default reminders that the authenticated user has for this calendar.
    */
  var defaultReminders: js.UndefOr[js.Array[SchemaEventReminder]] = js.native
  
  /**
    * Whether this calendar list entry has been deleted from the calendar list.
    * Read-only. Optional. The default is False.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /**
    * Description of the calendar. Optional. Read-only.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The foreground color of the calendar in the hexadecimal format
    * &quot;#ffffff&quot;. This property supersedes the index-based colorId
    * property. To set or change this property, you need to specify
    * colorRgbFormat=true in the parameters of the insert, update and patch
    * methods. Optional.
    */
  var foregroundColor: js.UndefOr[String] = js.native
  
  /**
    * Whether the calendar has been hidden from the list. Optional. The default
    * is False.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifier of the calendar.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Type of the resource (&quot;calendar#calendarListEntry&quot;).
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Geographic location of the calendar as free-form text. Optional.
    * Read-only.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * The notifications that the authenticated user is receiving for this
    * calendar.
    */
  var notificationSettings: js.UndefOr[Notifications] = js.native
  
  /**
    * Whether the calendar is the primary calendar of the authenticated user.
    * Read-only. Optional. The default is False.
    */
  var primary: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the calendar content shows up in the calendar UI. Optional. The
    * default is False.
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /**
    * Title of the calendar. Read-only.
    */
  var summary: js.UndefOr[String] = js.native
  
  /**
    * The summary that the authenticated user has set for this calendar.
    * Optional.
    */
  var summaryOverride: js.UndefOr[String] = js.native
  
  /**
    * The time zone of the calendar. Optional. Read-only.
    */
  var timeZone: js.UndefOr[String] = js.native
}
object SchemaCalendarListEntry {
  
  @scala.inline
  def apply(): SchemaCalendarListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCalendarListEntry]
  }
  
  @scala.inline
  implicit class SchemaCalendarListEntryMutableBuilder[Self <: SchemaCalendarListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessRole(value: String): Self = StObject.set(x, "accessRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessRoleUndefined: Self = StObject.set(x, "accessRole", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setColorId(value: String): Self = StObject.set(x, "colorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIdUndefined: Self = StObject.set(x, "colorId", js.undefined)
    
    @scala.inline
    def setConferenceProperties(value: SchemaConferenceProperties): Self = StObject.set(x, "conferenceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConferencePropertiesUndefined: Self = StObject.set(x, "conferenceProperties", js.undefined)
    
    @scala.inline
    def setDefaultReminders(value: js.Array[SchemaEventReminder]): Self = StObject.set(x, "defaultReminders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRemindersUndefined: Self = StObject.set(x, "defaultReminders", js.undefined)
    
    @scala.inline
    def setDefaultRemindersVarargs(value: SchemaEventReminder*): Self = StObject.set(x, "defaultReminders", js.Array(value :_*))
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
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
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
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
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
