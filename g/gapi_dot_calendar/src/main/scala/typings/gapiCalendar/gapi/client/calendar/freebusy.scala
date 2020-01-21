package typings.gapiCalendar.gapi.client.calendar

import typings.gapi.gapi.client.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.calendar.freebusy")
@js.native
class freebusy () extends js.Object

/* static members */
@JSGlobal("gapi.client.calendar.freebusy")
@js.native
object freebusy extends js.Object {
  def query(parameters: FreeBusyQueryParameters): HttpRequest[FreeBusy_] = js.native
}

