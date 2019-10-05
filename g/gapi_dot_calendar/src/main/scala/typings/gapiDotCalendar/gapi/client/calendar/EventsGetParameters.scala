package typings.gapiDotCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsGetParameters extends js.Object {
  var alwaysIncludeEmail: js.UndefOr[Boolean] = js.undefined
  var calendarId: String
  var eventId: String
  var maxAttendees: js.UndefOr[integer] = js.undefined
  var timeZone: js.UndefOr[String] = js.undefined
}

object EventsGetParameters {
  @scala.inline
  def apply(
    calendarId: String,
    eventId: String,
    alwaysIncludeEmail: js.UndefOr[Boolean] = js.undefined,
    maxAttendees: Int | Double = null,
    timeZone: String = null
  ): EventsGetParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId, eventId = eventId)
    if (!js.isUndefined(alwaysIncludeEmail)) __obj.updateDynamic("alwaysIncludeEmail")(alwaysIncludeEmail)
    if (maxAttendees != null) __obj.updateDynamic("maxAttendees")(maxAttendees.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    __obj.asInstanceOf[EventsGetParameters]
  }
}

