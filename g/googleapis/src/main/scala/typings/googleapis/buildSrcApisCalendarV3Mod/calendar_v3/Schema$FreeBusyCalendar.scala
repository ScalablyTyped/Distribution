package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$FreeBusyCalendar extends js.Object {
  /**
    * List of time ranges during which this calendar should be regarded as
    * busy.
    */
  var busy: js.UndefOr[js.Array[Schema$TimePeriod]] = js.native
  /**
    * Optional error(s) (if computation for the calendar failed).
    */
  var errors: js.UndefOr[js.Array[Schema$Error]] = js.native
}

object Schema$FreeBusyCalendar {
  @scala.inline
  def apply(busy: js.Array[Schema$TimePeriod] = null, errors: js.Array[Schema$Error] = null): Schema$FreeBusyCalendar = {
    val __obj = js.Dynamic.literal()
    if (busy != null) __obj.updateDynamic("busy")(busy.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FreeBusyCalendar]
  }
}

