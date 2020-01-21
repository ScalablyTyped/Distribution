package typings.gapiCalendar.gapi.client.calendar

import typings.gapi.gapi.client.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.calendar.events")
@js.native
class events () extends js.Object

/* static members */
@JSGlobal("gapi.client.calendar.events")
@js.native
object events extends js.Object {
  // delete the existing event from calendar
  def delete(parameters: EventsDeleteParameters): HttpRequest[Event] = js.native
  def get(parameters: EventsGetParameters): HttpRequest[Event] = js.native
  def insert(parameters: EventsInsertParameters): HttpRequest[Event] = js.native
  def list(parameters: EventsListParameters): HttpRequest[Events_] = js.native
  def update(parameters: EventsUpdateParameters): HttpRequest[Event] = js.native
}

