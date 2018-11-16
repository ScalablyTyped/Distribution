package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FreeBusyCalendar extends js.Object {
  /** List of time ranges during which this calendar should be regarded as busy. */
  var busy: js.UndefOr[js.Array[TimePeriod]] = js.undefined
  /** Optional error(s) (if computation for the calendar failed). */
  var errors: js.UndefOr[js.Array[Error]] = js.undefined
}

