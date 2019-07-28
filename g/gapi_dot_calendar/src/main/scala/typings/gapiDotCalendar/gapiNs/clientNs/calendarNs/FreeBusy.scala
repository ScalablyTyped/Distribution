package typings.gapiDotCalendar.gapiNs.clientNs.calendarNs

import typings.gapi.gapiNs.clientNs.HttpRequest
import typings.gapiDotCalendar.Anon_Busy
import typings.gapiDotCalendar.Anon_Calendars
import typings.gapiDotCalendar.Fn_Key
import typings.gapiDotCalendar.Fn_KeyAnonBusy
import typings.gapiDotCalendar.gapiDotCalendarStrings.`calendar#freeBusy`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreeBusy extends js.Object {
  @JSName("calendars")
  var calendars_Original: Fn_KeyAnonBusy = js.native
  @JSName("groups")
  var groups_Original: Fn_Key = js.native
  var kind: `calendar#freeBusy` = js.native
  var timeMax: datetime = js.native
  var timeMin: datetime = js.native
  def calendars(key: String): Anon_Busy = js.native
  def groups(key: String): Anon_Calendars = js.native
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

