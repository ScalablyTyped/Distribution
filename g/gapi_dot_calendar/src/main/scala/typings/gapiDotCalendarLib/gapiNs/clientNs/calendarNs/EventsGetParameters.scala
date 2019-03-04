package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsGetParameters extends js.Object {
  var alwaysIncludeEmail: js.UndefOr[scala.Boolean] = js.undefined
  var calendarId: java.lang.String
  var eventId: java.lang.String
  var maxAttendees: js.UndefOr[integer] = js.undefined
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
}

object EventsGetParameters {
  @scala.inline
  def apply(
    calendarId: java.lang.String,
    eventId: java.lang.String,
    alwaysIncludeEmail: js.UndefOr[scala.Boolean] = js.undefined,
    maxAttendees: js.UndefOr[integer] = js.undefined,
    timeZone: java.lang.String = null
  ): EventsGetParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId, eventId = eventId)
    if (!js.isUndefined(alwaysIncludeEmail)) __obj.updateDynamic("alwaysIncludeEmail")(alwaysIncludeEmail)
    if (!js.isUndefined(maxAttendees)) __obj.updateDynamic("maxAttendees")(maxAttendees)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[EventsGetParameters]
  }
}

