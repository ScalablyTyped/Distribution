package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyResponse extends js.Object {
  /** List of free/busy information for calendars. */
  var calendars: js.UndefOr[stdLib.Record[java.lang.String, FreeBusyCalendar]] = js.undefined
  /** Expansion of groups. */
  var groups: js.UndefOr[stdLib.Record[java.lang.String, FreeBusyGroup]] = js.undefined
  /** Type of the resource ("calendar#freeBusy"). */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The end of the interval. */
  var timeMax: js.UndefOr[java.lang.String] = js.undefined
  /** The start of the interval. */
  var timeMin: js.UndefOr[java.lang.String] = js.undefined
}

