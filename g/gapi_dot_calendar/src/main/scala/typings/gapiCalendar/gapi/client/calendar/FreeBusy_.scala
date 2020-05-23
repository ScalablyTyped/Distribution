package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Busy
import typings.gapiCalendar.anon.Calendars
import typings.gapiCalendar.gapiCalendarStrings.calendarNumbersignfreeBusy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusy_ extends js.Object {
  var kind: calendarNumbersignfreeBusy
  var timeMax: datetime
  var timeMin: datetime
  def calendars(key: String): Busy
  def groups(key: String): Calendars
}

object FreeBusy_ {
  @scala.inline
  def apply(
    calendars: String => Busy,
    groups: String => Calendars,
    kind: calendarNumbersignfreeBusy,
    timeMax: datetime,
    timeMin: datetime
  ): FreeBusy_ = {
    val __obj = js.Dynamic.literal(calendars = js.Any.fromFunction1(calendars), groups = js.Any.fromFunction1(groups), kind = kind.asInstanceOf[js.Any], timeMax = timeMax.asInstanceOf[js.Any], timeMin = timeMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusy_]
  }
}

