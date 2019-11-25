package typings.gapiDotCalendar.gapi.client.calendar

import typings.gapi.gapi.client.HttpRequest
import typings.gapiDotCalendar.gapiDotCalendarStrings.`calendar#calendarList`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarList extends js.Object {
  var etag: typings.gapiDotCalendar.gapi.client.calendar.etag
  var items: js.Array[CalendarListEntry]
  var kind: `calendar#calendarList`
  /**
    * Token used to access the next page of this result.
    * Omitted if no further results are available, in which case nextSyncToken is provided.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /**
    * Token used at a later point in time to retrieve only the entries that have changed since this result was returned.
    * Omitted if further results are available, in which case nextPageToken is provided.
    */
  var nextSyncToken: js.UndefOr[String] = js.undefined
}

object CalendarList {
  @scala.inline
  def apply(
    etag: etag,
    items: js.Array[CalendarListEntry],
    kind: `calendar#calendarList`,
    nextPageToken: String = null,
    nextSyncToken: String = null
  ): CalendarList = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (nextSyncToken != null) __obj.updateDynamic("nextSyncToken")(nextSyncToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarList]
  }
}

@JSGlobal("gapi.client.calendar.calendarList")
@js.native
class calendarList () extends js.Object

/* static members */
@JSGlobal("gapi.client.calendar.calendarList")
@js.native
object calendarList extends js.Object {
  def insert(parameters: CalendarListInsertParameters): HttpRequest[CalendarListEntry] = js.native
  def list(): HttpRequest[CalendarList] = js.native
  def list(parameters: CalendarListListParameters): HttpRequest[CalendarList] = js.native
}

