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

object FreeBusyResponse {
  @scala.inline
  def apply(
    calendars: stdLib.Record[java.lang.String, FreeBusyCalendar] = null,
    groups: stdLib.Record[java.lang.String, FreeBusyGroup] = null,
    kind: java.lang.String = null,
    timeMax: java.lang.String = null,
    timeMin: java.lang.String = null
  ): FreeBusyResponse = {
    val __obj = js.Dynamic.literal()
    if (calendars != null) __obj.updateDynamic("calendars")(calendars)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (timeMax != null) __obj.updateDynamic("timeMax")(timeMax)
    if (timeMin != null) __obj.updateDynamic("timeMin")(timeMin)
    __obj.asInstanceOf[FreeBusyResponse]
  }
}

