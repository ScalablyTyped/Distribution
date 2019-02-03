package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

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
  def delete(parameters: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.CalendarsDeleteParameters): gapiLib.gapiNs.clientNs.HttpRequest[scala.Unit] = js.native
  def insert(parameters: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.CalendarsInsertParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotCalendarLib.gapiNs.clientNs.calendarNs.Calendar] = js.native
  def update(parameters: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.CalendarsUpdateParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotCalendarLib.gapiNs.clientNs.calendarNs.Calendar] = js.native
}

