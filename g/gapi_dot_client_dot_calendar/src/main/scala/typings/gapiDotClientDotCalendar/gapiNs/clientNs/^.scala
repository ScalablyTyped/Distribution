package typings.gapiDotClientDotCalendar.gapiNs.clientNs

import typings.gapiDotClientDotCalendar.gapiDotClientDotCalendarStrings.calendar
import typings.gapiDotClientDotCalendar.gapiDotClientDotCalendarStrings.v3
import typings.gapiDotClientDotCalendar.gapiNs.clientNs.calendarNs.AclResource
import typings.gapiDotClientDotCalendar.gapiNs.clientNs.calendarNs.CalendarListResource
import typings.gapiDotClientDotCalendar.gapiNs.clientNs.calendarNs.CalendarsResource
import typings.gapiDotClientDotCalendar.gapiNs.clientNs.calendarNs.ChannelsResource
import typings.gapiDotClientDotCalendar.gapiNs.clientNs.calendarNs.ColorsResource
import typings.gapiDotClientDotCalendar.gapiNs.clientNs.calendarNs.EventsResource
import typings.gapiDotClientDotCalendar.gapiNs.clientNs.calendarNs.FreebusyResource
import typings.gapiDotClientDotCalendar.gapiNs.clientNs.calendarNs.SettingsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val acl: AclResource = js.native
  val calendarList: CalendarListResource = js.native
  val calendars: CalendarsResource = js.native
  val channels: ChannelsResource = js.native
  val colors: ColorsResource = js.native
  val events: EventsResource = js.native
  val freebusy: FreebusyResource = js.native
  val settings: SettingsResource = js.native
  /** Load Calendar API v3 */
  def load(name: calendar, version: v3): js.Thenable[Unit] = js.native
  def load(name: calendar, version: v3, callback: js.Function0[_]): Unit = js.native
}

