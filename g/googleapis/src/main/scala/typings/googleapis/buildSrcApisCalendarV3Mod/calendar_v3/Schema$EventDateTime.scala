package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$EventDateTime extends js.Object {
  /**
    * The date, in the format &quot;yyyy-mm-dd&quot;, if this is an all-day
    * event.
    */
  var date: js.UndefOr[String] = js.native
  /**
    * The time, as a combined date-time value (formatted according to RFC3339).
    * A time zone offset is required unless a time zone is explicitly specified
    * in timeZone.
    */
  var dateTime: js.UndefOr[String] = js.native
  /**
    * The time zone in which the time is specified. (Formatted as an IANA Time
    * Zone Database name, e.g. &quot;Europe/Zurich&quot;.) For recurring events
    * this field is required and specifies the time zone in which the
    * recurrence is expanded. For single events this field is optional and
    * indicates a custom time zone for the event start/end.
    */
  var timeZone: js.UndefOr[String] = js.native
}

object Schema$EventDateTime {
  @scala.inline
  def apply(date: String = null, dateTime: String = null, timeZone: String = null): Schema$EventDateTime = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EventDateTime]
  }
}

