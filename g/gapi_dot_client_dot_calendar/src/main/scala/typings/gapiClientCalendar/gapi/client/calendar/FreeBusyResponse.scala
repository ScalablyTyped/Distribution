package typings.gapiClientCalendar.gapi.client.calendar

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyResponse extends js.Object {
  /** List of free/busy information for calendars. */
  var calendars: js.UndefOr[Record[String, FreeBusyCalendar]] = js.undefined
  /** Expansion of groups. */
  var groups: js.UndefOr[Record[String, FreeBusyGroup]] = js.undefined
  /** Type of the resource ("calendar#freeBusy"). */
  var kind: js.UndefOr[String] = js.undefined
  /** The end of the interval. */
  var timeMax: js.UndefOr[String] = js.undefined
  /** The start of the interval. */
  var timeMin: js.UndefOr[String] = js.undefined
}

object FreeBusyResponse {
  @scala.inline
  def apply(
    calendars: Record[String, FreeBusyCalendar] = null,
    groups: Record[String, FreeBusyGroup] = null,
    kind: String = null,
    timeMax: String = null,
    timeMin: String = null
  ): FreeBusyResponse = {
    val __obj = js.Dynamic.literal()
    if (calendars != null) __obj.updateDynamic("calendars")(calendars.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (timeMax != null) __obj.updateDynamic("timeMax")(timeMax.asInstanceOf[js.Any])
    if (timeMin != null) __obj.updateDynamic("timeMin")(timeMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusyResponse]
  }
}

