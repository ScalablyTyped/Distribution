package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.AnonBusy
import typings.gapiCalendar.AnonCalendars
import typings.gapiCalendar.gapiCalendarStrings.calendarNumbersignfreeBusy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusy_ extends js.Object {
  var kind: calendarNumbersignfreeBusy
  var timeMax: datetime
  var timeMin: datetime
  def calendars(key: String): AnonBusy
  def groups(key: String): AnonCalendars
}

object FreeBusy_ {
  @scala.inline
  def apply(
    calendars: String => AnonBusy,
    groups: String => AnonCalendars,
    kind: calendarNumbersignfreeBusy,
    timeMax: datetime,
    timeMin: datetime
  ): FreeBusy_ = {
    val __obj = js.Dynamic.literal(calendars = js.Any.fromFunction1(calendars), groups = js.Any.fromFunction1(groups), kind = kind.asInstanceOf[js.Any], timeMax = timeMax.asInstanceOf[js.Any], timeMin = timeMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusy_]
  }
}

