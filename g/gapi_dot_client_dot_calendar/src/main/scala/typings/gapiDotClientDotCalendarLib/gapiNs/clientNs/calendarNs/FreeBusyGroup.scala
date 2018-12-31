package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyGroup extends js.Object {
  /** List of calendars' identifiers within a group. */
  var calendars: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Optional error(s) (if computation for the group failed). */
  var errors: js.UndefOr[js.Array[Error]] = js.undefined
}

