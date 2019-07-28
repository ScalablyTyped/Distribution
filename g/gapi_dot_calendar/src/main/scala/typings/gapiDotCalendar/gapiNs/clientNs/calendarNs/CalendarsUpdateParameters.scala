package typings.gapiDotCalendar.gapiNs.clientNs.calendarNs

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
    val __obj = js.Dynamic.literal(calendarId = calendarId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (location != null) __obj.updateDynamic("location")(location)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[CalendarsUpdateParameters]
  }
}

