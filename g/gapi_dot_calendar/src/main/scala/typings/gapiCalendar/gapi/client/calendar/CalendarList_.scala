package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.gapiCalendarStrings.calendarNumbersigncalendarList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarList_ extends js.Object {
  var etag: typings.gapiCalendar.gapi.client.calendar.etag
  var items: js.Array[CalendarListEntry]
  var kind: calendarNumbersigncalendarList
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

object CalendarList_ {
  @scala.inline
  def apply(
    etag: etag,
    items: js.Array[CalendarListEntry],
    kind: calendarNumbersigncalendarList,
    nextPageToken: String = null,
    nextSyncToken: String = null
  ): CalendarList_ = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (nextSyncToken != null) __obj.updateDynamic("nextSyncToken")(nextSyncToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarList_]
  }
}

