package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val acl: gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs.AclResource = js.native
  val calendarList: gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs.CalendarListResource = js.native
  val calendars: gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs.CalendarsResource = js.native
  val channels: gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs.ChannelsResource = js.native
  val colors: gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs.ColorsResource = js.native
  val events: gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs.EventsResource = js.native
  val freebusy: gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs.FreebusyResource = js.native
  val settings: gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs.SettingsResource = js.native
  /** Load Calendar API v3 */
  def load(
    name: gapiDotClientDotCalendarLib.gapiDotClientDotCalendarLibStrings.calendar,
    version: gapiDotClientDotCalendarLib.gapiDotClientDotCalendarLibStrings.v3
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotCalendarLib.gapiDotClientDotCalendarLibStrings.calendar,
    version: gapiDotClientDotCalendarLib.gapiDotClientDotCalendarLibStrings.v3,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

