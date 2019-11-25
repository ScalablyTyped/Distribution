package typings.gapiDotCalendar

import typings.gapiDotCalendar.gapi.client.calendar.date
import typings.gapiDotCalendar.gapi.client.calendar.datetime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  // The date, in the format "yyyy-mm-dd", if this is an all-day event.
  var date: js.UndefOr[typings.gapiDotCalendar.gapi.client.calendar.date] = js.undefined
  // The time, as a combined date-time value (formatted according to RFC3339).
  // A time zone offset is required unless a time zone is explicitly specified in timeZone.
  var dateTime: js.UndefOr[datetime] = js.undefined
  // The time zone in which the time is specified. (Formatted as an IANA Time Zone Database name, e.g. "Europe/Zurich".)
  // For recurring events this field is required and specifies the time zone in which the recurrence is expanded.
  // For single events this field is optional and indicates a custom time zone for the event start/end.
  var timeZone: js.UndefOr[String] = js.undefined
}

object Anon_Date {
  @scala.inline
  def apply(date: date = null, dateTime: datetime = null, timeZone: String = null): Anon_Date = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Date]
  }
}

