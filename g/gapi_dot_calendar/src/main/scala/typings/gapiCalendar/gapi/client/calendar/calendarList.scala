package typings.gapiCalendar.gapi.client.calendar

import typings.gapi.gapi.client.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.calendar.calendarList")
@js.native
class calendarList () extends js.Object

/* static members */
@JSGlobal("gapi.client.calendar.calendarList")
@js.native
object calendarList extends js.Object {
  def insert(parameters: CalendarListInsertParameters): HttpRequest[CalendarListEntry] = js.native
  def list(): HttpRequest[CalendarList_] = js.native
  def list(parameters: CalendarListListParameters): HttpRequest[CalendarList_] = js.native
}

