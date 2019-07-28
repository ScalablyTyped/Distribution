package typings.gapiDotClientDotCalendar.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyGroup extends js.Object {
  /** List of calendars' identifiers within a group. */
  var calendars: js.UndefOr[js.Array[String]] = js.undefined
  /** Optional error(s) (if computation for the group failed). */
  var errors: js.UndefOr[js.Array[Error]] = js.undefined
}

object FreeBusyGroup {
  @scala.inline
  def apply(calendars: js.Array[String] = null, errors: js.Array[Error] = null): FreeBusyGroup = {
    val __obj = js.Dynamic.literal()
    if (calendars != null) __obj.updateDynamic("calendars")(calendars)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[FreeBusyGroup]
  }
}

