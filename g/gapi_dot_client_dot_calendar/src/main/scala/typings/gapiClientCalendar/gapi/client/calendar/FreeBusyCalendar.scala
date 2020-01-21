package typings.gapiClientCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreeBusyCalendar extends js.Object {
  /** List of time ranges during which this calendar should be regarded as busy. */
  var busy: js.UndefOr[js.Array[TimePeriod]] = js.undefined
  /** Optional error(s) (if computation for the calendar failed). */
  var errors: js.UndefOr[js.Array[Error]] = js.undefined
}

object FreeBusyCalendar {
  @scala.inline
  def apply(busy: js.Array[TimePeriod] = null, errors: js.Array[Error] = null): FreeBusyCalendar = {
    val __obj = js.Dynamic.literal()
    if (busy != null) __obj.updateDynamic("busy")(busy.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeBusyCalendar]
  }
}

