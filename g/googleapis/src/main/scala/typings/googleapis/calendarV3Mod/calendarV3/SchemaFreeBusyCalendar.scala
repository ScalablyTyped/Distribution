package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaFreeBusyCalendar extends js.Object {
  /**
    * List of time ranges during which this calendar should be regarded as
    * busy.
    */
  var busy: js.UndefOr[js.Array[SchemaTimePeriod]] = js.native
  /**
    * Optional error(s) (if computation for the calendar failed).
    */
  var errors: js.UndefOr[js.Array[SchemaError]] = js.native
}

object SchemaFreeBusyCalendar {
  @scala.inline
  def apply(busy: js.Array[SchemaTimePeriod] = null, errors: js.Array[SchemaError] = null): SchemaFreeBusyCalendar = {
    val __obj = js.Dynamic.literal()
    if (busy != null) __obj.updateDynamic("busy")(busy.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFreeBusyCalendar]
  }
}

