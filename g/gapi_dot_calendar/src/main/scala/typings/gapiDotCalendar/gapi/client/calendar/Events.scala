package typings.gapiDotCalendar.gapi.client.calendar

import typings.gapi.gapi.client.HttpRequest
import typings.gapiDotCalendar.Anon_Method
import typings.gapiDotCalendar.gapiDotCalendarStrings.calendarNumbersignevents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  // The user's access role for this calendar. Read-only. Possible values are:
  var accessRole: AccessRole
  var defaultReminders: js.Array[Anon_Method]
  var description: String
  var etag: typings.gapiDotCalendar.gapi.client.calendar.etag
  var items: js.Array[Event]
  var kind: calendarNumbersignevents
  var nextPageToken: js.UndefOr[String] = js.undefined
  var nextSyncToken: js.UndefOr[String] = js.undefined
  var summary: String
  var timeZone: String
  var updated: datetime
}

object Events {
  @scala.inline
  def apply(
    accessRole: AccessRole,
    defaultReminders: js.Array[Anon_Method],
    description: String,
    etag: etag,
    items: js.Array[Event],
    kind: calendarNumbersignevents,
    summary: String,
    timeZone: String,
    updated: datetime,
    nextPageToken: String = null,
    nextSyncToken: String = null
  ): Events = {
    val __obj = js.Dynamic.literal(accessRole = accessRole.asInstanceOf[js.Any], defaultReminders = defaultReminders.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (nextSyncToken != null) __obj.updateDynamic("nextSyncToken")(nextSyncToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
}

@JSGlobal("gapi.client.calendar.events")
@js.native
class events () extends js.Object

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

