package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarsInsertParameters extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  // Calendars resource
  // Required Properties
  var summary: java.lang.String
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
}

object CalendarsInsertParameters {
  @scala.inline
  def apply(
    summary: java.lang.String,
    description: java.lang.String = null,
    location: java.lang.String = null,
    timeZone: java.lang.String = null
  ): CalendarsInsertParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("summary")(summary)
    if (description != null) __obj.updateDynamic("description")(description)
    if (location != null) __obj.updateDynamic("location")(location)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[CalendarsInsertParameters]
  }
}

