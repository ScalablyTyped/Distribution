package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEvents extends StObject {
  
  /**
    * The user&#39;s access role for this calendar. Read-only. Possible values
    * are:   - &quot;none&quot; - The user has no access.  -
    * &quot;freeBusyReader&quot; - The user has read access to free/busy
    * information.  - &quot;reader&quot; - The user has read access to the
    * calendar. Private events will appear to users with reader access, but
    * event details will be hidden.  - &quot;writer&quot; - The user has read
    * and write access to the calendar. Private events will appear to users
    * with writer access, and event details will be visible.  -
    * &quot;owner&quot; - The user has ownership of the calendar. This role has
    * all of the permissions of the writer role with the additional ability to
    * see and manipulate ACLs.
    */
  var accessRole: js.UndefOr[String] = js.undefined
  
  /**
    * The default reminders on the calendar for the authenticated user. These
    * reminders apply to all events on this calendar that do not explicitly
    * override them (i.e. do not have reminders.useDefault set to True).
    */
  var defaultReminders: js.UndefOr[js.Array[SchemaEventReminder]] = js.undefined
  
  /**
    * Description of the calendar. Read-only.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * ETag of the collection.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * List of events on the calendar.
    */
  var items: js.UndefOr[js.Array[SchemaEvent]] = js.undefined
  
  /**
    * Type of the collection (&quot;calendar#events&quot;).
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Token used to access the next page of this result. Omitted if no further
    * results are available, in which case nextSyncToken is provided.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Token used at a later point in time to retrieve only the entries that
    * have changed since this result was returned. Omitted if further results
    * are available, in which case nextPageToken is provided.
    */
  var nextSyncToken: js.UndefOr[String] = js.undefined
  
  /**
    * Title of the calendar. Read-only.
    */
  var summary: js.UndefOr[String] = js.undefined
  
  /**
    * The time zone of the calendar. Read-only.
    */
  var timeZone: js.UndefOr[String] = js.undefined
  
  /**
    * Last modification time of the calendar (as a RFC3339 timestamp).
    * Read-only.
    */
  var updated: js.UndefOr[String] = js.undefined
}
object SchemaEvents {
  
  inline def apply(): SchemaEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEvents]
  }
  
  extension [Self <: SchemaEvents](x: Self) {
    
    inline def setAccessRole(value: String): Self = StObject.set(x, "accessRole", value.asInstanceOf[js.Any])
    
    inline def setAccessRoleUndefined: Self = StObject.set(x, "accessRole", js.undefined)
    
    inline def setDefaultReminders(value: js.Array[SchemaEventReminder]): Self = StObject.set(x, "defaultReminders", value.asInstanceOf[js.Any])
    
    inline def setDefaultRemindersUndefined: Self = StObject.set(x, "defaultReminders", js.undefined)
    
    inline def setDefaultRemindersVarargs(value: SchemaEventReminder*): Self = StObject.set(x, "defaultReminders", js.Array(value :_*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setItems(value: js.Array[SchemaEvent]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaEvent*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
    
    inline def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
