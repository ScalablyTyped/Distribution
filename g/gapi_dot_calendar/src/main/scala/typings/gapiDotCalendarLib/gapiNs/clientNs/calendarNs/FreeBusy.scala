package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FreeBusy extends js.Object {
  @JSName("calendars")
  var calendars_Original: gapiDotCalendarLib.Fn_KeyAnonBusy = js.native
  @JSName("groups")
  var groups_Original: gapiDotCalendarLib.Fn_Key = js.native
  var kind: gapiDotCalendarLib.gapiDotCalendarLibStrings.`calendar#freeBusy` = js.native
  var timeMax: datetime = js.native
  var timeMin: datetime = js.native
  def calendars(key: java.lang.String): gapiDotCalendarLib.Anon_Busy = js.native
  def groups(key: java.lang.String): gapiDotCalendarLib.Anon_Calendars = js.native
}

@JSGlobal("gapi.client.calendar.freebusy")
@js.native
class freebusy () extends js.Object

/* static members */
@JSGlobal("gapi.client.calendar.freebusy")
@js.native
object freebusy extends js.Object {
  def query(parameters: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.FreeBusyQueryParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotCalendarLib.gapiNs.clientNs.calendarNs.FreeBusy] = js.native
}

