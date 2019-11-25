package typings.gapiDotCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarsUpdateParameters extends js.Object {
  var calendarId: String
  // Calendars resource
  // Optional Properties
  var description: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
}

object CalendarsUpdateParameters {
  @scala.inline
  def apply(
    calendarId: String,
    description: String = null,
    location: String = null,
    summary: String = null,
    timeZone: String = null
  ): CalendarsUpdateParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarsUpdateParameters]
  }
}

