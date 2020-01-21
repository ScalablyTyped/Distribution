package typings.gapiCalendar.gapi.client.calendar

import typings.gapi.gapi.client.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.calendar.calendars")
@js.native
class calendars () extends js.Object

/* static members */
@JSGlobal("gapi.client.calendar.calendars")
@js.native
object calendars extends js.Object {
  def delete(parameters: CalendarsDeleteParameters): HttpRequest[Unit] = js.native
  def insert(parameters: CalendarsInsertParameters): HttpRequest[Calendar] = js.native
  def update(parameters: CalendarsUpdateParameters): HttpRequest[Calendar] = js.native
}

