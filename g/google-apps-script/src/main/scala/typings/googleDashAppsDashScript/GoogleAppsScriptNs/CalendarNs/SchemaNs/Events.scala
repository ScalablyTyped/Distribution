package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  var accessRole: js.UndefOr[String] = js.undefined
  var defaultReminders: js.UndefOr[js.Array[EventReminder]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Event]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var nextSyncToken: js.UndefOr[String] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
  var updated: js.UndefOr[String] = js.undefined
}

object Events {
  @scala.inline
  def apply(
    accessRole: String = null,
    defaultReminders: js.Array[EventReminder] = null,
    description: String = null,
    etag: String = null,
    items: js.Array[Event] = null,
    kind: String = null,
    nextPageToken: String = null,
    nextSyncToken: String = null,
    summary: String = null,
    timeZone: String = null,
    updated: String = null
  ): Events = {
    val __obj = js.Dynamic.literal()
    if (accessRole != null) __obj.updateDynamic("accessRole")(accessRole)
    if (defaultReminders != null) __obj.updateDynamic("defaultReminders")(defaultReminders)
    if (description != null) __obj.updateDynamic("description")(description)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (nextSyncToken != null) __obj.updateDynamic("nextSyncToken")(nextSyncToken)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[Events]
  }
}

