package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaEvents extends js.Object {
  
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
  var accessRole: js.UndefOr[String] = js.native
  
  /**
    * The default reminders on the calendar for the authenticated user. These
    * reminders apply to all events on this calendar that do not explicitly
    * override them (i.e. do not have reminders.useDefault set to True).
    */
  var defaultReminders: js.UndefOr[js.Array[SchemaEventReminder]] = js.native
  
  /**
    * Description of the calendar. Read-only.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * ETag of the collection.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * List of events on the calendar.
    */
  var items: js.UndefOr[js.Array[SchemaEvent]] = js.native
  
  /**
    * Type of the collection (&quot;calendar#events&quot;).
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Token used to access the next page of this result. Omitted if no further
    * results are available, in which case nextSyncToken is provided.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Token used at a later point in time to retrieve only the entries that
    * have changed since this result was returned. Omitted if further results
    * are available, in which case nextPageToken is provided.
    */
  var nextSyncToken: js.UndefOr[String] = js.native
  
  /**
    * Title of the calendar. Read-only.
    */
  var summary: js.UndefOr[String] = js.native
  
  /**
    * The time zone of the calendar. Read-only.
    */
  var timeZone: js.UndefOr[String] = js.native
  
  /**
    * Last modification time of the calendar (as a RFC3339 timestamp).
    * Read-only.
    */
  var updated: js.UndefOr[String] = js.native
}
object SchemaEvents {
  
  @scala.inline
  def apply(): SchemaEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEvents]
  }
  
  @scala.inline
  implicit class SchemaEventsOps[Self <: SchemaEvents] (val x: Self) extends AnyVal {
    
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
    def setAccessRole(value: String): Self = this.set("accessRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessRole: Self = this.set("accessRole", js.undefined)
    
    @scala.inline
    def setDefaultRemindersVarargs(value: SchemaEventReminder*): Self = this.set("defaultReminders", js.Array(value :_*))
    
    @scala.inline
    def setDefaultReminders(value: js.Array[SchemaEventReminder]): Self = this.set("defaultReminders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultReminders: Self = this.set("defaultReminders", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaEvent*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[SchemaEvent]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setNextSyncToken(value: String): Self = this.set("nextSyncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextSyncToken: Self = this.set("nextSyncToken", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
  }
}
