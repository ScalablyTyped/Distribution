package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarsUpdateParameters extends js.Object {
  var calendarId: java.lang.String
  // Calendars resource
  // Optional Properties
  var description: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var summary: js.UndefOr[java.lang.String] = js.undefined
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
}

object CalendarsUpdateParameters {
  @scala.inline
  def apply(
    calendarId: java.lang.String,
    description: java.lang.String = null,
    location: java.lang.String = null,
    summary: java.lang.String = null,
    timeZone: java.lang.String = null
  ): CalendarsUpdateParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (location != null) __obj.updateDynamic("location")(location)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[CalendarsUpdateParameters]
  }
}

