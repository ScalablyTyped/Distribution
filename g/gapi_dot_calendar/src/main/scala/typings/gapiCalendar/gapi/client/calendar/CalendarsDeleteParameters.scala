package typings.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarsDeleteParameters extends js.Object {
  var calendarId: String
}

object CalendarsDeleteParameters {
  @scala.inline
  def apply(calendarId: String): CalendarsDeleteParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarsDeleteParameters]
  }
}

