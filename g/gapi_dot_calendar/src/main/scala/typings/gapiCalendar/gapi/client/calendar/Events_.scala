package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Method
import typings.gapiCalendar.gapiCalendarStrings.calendarNumbersignevents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events_ extends js.Object {
  // The user's access role for this calendar. Read-only. Possible values are:
  var accessRole: AccessRole
  var defaultReminders: js.Array[Method]
  var description: String
  var etag: typings.gapiCalendar.gapi.client.calendar.etag
  var items: js.Array[Event]
  var kind: calendarNumbersignevents
  var nextPageToken: js.UndefOr[String] = js.undefined
  var nextSyncToken: js.UndefOr[String] = js.undefined
  var summary: String
  var timeZone: String
  var updated: datetime
}

object Events_ {
  @scala.inline
  def apply(
    accessRole: AccessRole,
    defaultReminders: js.Array[Method],
    description: String,
    etag: etag,
    items: js.Array[Event],
    kind: calendarNumbersignevents,
    summary: String,
    timeZone: String,
    updated: datetime,
    nextPageToken: String = null,
    nextSyncToken: String = null
  ): Events_ = {
    val __obj = js.Dynamic.literal(accessRole = accessRole.asInstanceOf[js.Any], defaultReminders = defaultReminders.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (nextSyncToken != null) __obj.updateDynamic("nextSyncToken")(nextSyncToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events_]
  }
}

