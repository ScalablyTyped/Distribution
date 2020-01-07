package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Events extends js.Object {
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
  var defaultReminders: js.UndefOr[js.Array[Schema$EventReminder]] = js.native
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
  var items: js.UndefOr[js.Array[Schema$Event]] = js.native
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

object Schema$Events {
  @scala.inline
  def apply(
    accessRole: String = null,
    defaultReminders: js.Array[Schema$EventReminder] = null,
    description: String = null,
    etag: String = null,
    items: js.Array[Schema$Event] = null,
    kind: String = null,
    nextPageToken: String = null,
    nextSyncToken: String = null,
    summary: String = null,
    timeZone: String = null,
    updated: String = null
  ): Schema$Events = {
    val __obj = js.Dynamic.literal()
    if (accessRole != null) __obj.updateDynamic("accessRole")(accessRole.asInstanceOf[js.Any])
    if (defaultReminders != null) __obj.updateDynamic("defaultReminders")(defaultReminders.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (nextSyncToken != null) __obj.updateDynamic("nextSyncToken")(nextSyncToken.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Events]
  }
}

