package typings.gapiDotCalendar.gapiNs.clientNs.calendarNs

import typings.gapi.gapiNs.clientNs.HttpRequest
import typings.gapiDotCalendar.Anon_Method
import typings.gapiDotCalendar.gapiDotCalendarStrings.`calendar#events`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  // The user's access role for this calendar. Read-only. Possible values are:
  var accessRole: AccessRole
  var defaultReminders: js.Array[Anon_Method]
  var description: String
  var etag: typings.gapiDotCalendar.gapiNs.clientNs.calendarNs.etag
  var items: js.Array[Event]
  var kind: `calendar#events`
  var nextPageToken: js.UndefOr[String] = js.undefined
  var nextSyncToken: js.UndefOr[String] = js.undefined
  var summary: String
  var timeZone: String
  var updated: datetime
}

@JSGlobal("gapi.client.calendar.events")
@js.native
class events () extends js.Object

object Events {
  @scala.inline
  def apply(
    accessRole: AccessRole,
    defaultReminders: js.Array[Anon_Method],
    description: String,
    etag: etag,
    items: js.Array[Event],
    kind: `calendar#events`,
    summary: String,
    timeZone: String,
    updated: datetime,
    nextPageToken: String = null,
    nextSyncToken: String = null
  ): Events = {
    val __obj = js.Dynamic.literal(accessRole = accessRole, defaultReminders = defaultReminders, description = description, etag = etag, items = items, kind = kind, summary = summary, timeZone = timeZone, updated = updated)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (nextSyncToken != null) __obj.updateDynamic("nextSyncToken")(nextSyncToken)
    __obj.asInstanceOf[Events]
  }
}

/* static members */
@JSGlobal("gapi.client.calendar.events")
@js.native
object events extends js.Object {
  // delete the existing event from calendar
  def delete(parameters: EventsDeleteParameters): HttpRequest[Event] = js.native
  def get(parameters: EventsGetParameters): HttpRequest[Event] = js.native
  def insert(parameters: EventsInsertParameters): HttpRequest[Event] = js.native
  def list(parameters: EventsListParameters): HttpRequest[Events] = js.native
  def update(parameters: EventsUpdateParameters): HttpRequest[Event] = js.native
}

