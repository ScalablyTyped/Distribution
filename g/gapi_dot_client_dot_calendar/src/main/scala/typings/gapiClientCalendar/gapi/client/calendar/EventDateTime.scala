package typings.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDateTime extends js.Object {
  /** The date, in the format "yyyy-mm-dd", if this is an all-day event. */
  var date: js.UndefOr[String] = js.native
  /**
    * The time, as a combined date-time value (formatted according to RFC3339). A time zone offset is required unless a time zone is explicitly specified in
    * timeZone.
    */
  var dateTime: js.UndefOr[String] = js.native
  /**
    * The time zone in which the time is specified. (Formatted as an IANA Time Zone Database name, e.g. "Europe/Zurich".) For recurring events this field is
    * required and specifies the time zone in which the recurrence is expanded. For single events this field is optional and indicates a custom time zone for
    * the event start/end.
    */
  var timeZone: js.UndefOr[String] = js.native
}

object EventDateTime {
  @scala.inline
  def apply(): EventDateTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDateTime]
  }
  @scala.inline
  implicit class EventDateTimeOps[Self <: EventDateTime] (val x: Self) extends AnyVal {
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDateTime(value: String): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateTime: Self = this.set("dateTime", js.undefined)
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
  
}

