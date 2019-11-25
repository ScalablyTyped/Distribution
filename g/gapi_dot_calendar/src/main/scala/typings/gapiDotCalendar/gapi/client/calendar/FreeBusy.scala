package typings.gapiDotCalendar.gapi.client.calendar

import typings.gapi.gapi.client.HttpRequest
import typings.gapiDotCalendar.Anon_Busy
import typings.gapiDotCalendar.Anon_Calendars
import typings.gapiDotCalendar.gapiDotCalendarStrings.`calendar#freeBusy`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusy extends js.Object {
  var kind: `calendar#freeBusy`
  var timeMax: datetime
  var timeMin: datetime
  def calendars(key: String): Anon_Busy
  def groups(key: String): Anon_Calendars
}

object FreeBusy {
  @scala.inline
  def apply(
    calendars: String => Anon_Busy,
    groups: String => Anon_Calendars,
    kind: `calendar#freeBusy`,
    timeMax: datetime,
    timeMin: datetime
  ): FreeBusy = {
    val __obj = js.Dynamic.literal(calendars = js.Any.fromFunction1(calendars), groups = js.Any.fromFunction1(groups), kind = kind.asInstanceOf[js.Any], timeMax = timeMax.asInstanceOf[js.Any], timeMin = timeMin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FreeBusy]
  }
}

@JSGlobal("gapi.client.calendar.freebusy")
@js.native
class freebusy () extends js.Object

/* static members */
@JSGlobal("gapi.client.calendar.freebusy")
@js.native
object freebusy extends js.Object {
  def query(parameters: FreeBusyQueryParameters): HttpRequest[FreeBusy] = js.native
}

