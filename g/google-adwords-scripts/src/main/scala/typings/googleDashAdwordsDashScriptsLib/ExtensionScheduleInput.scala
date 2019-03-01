package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionScheduleInput extends js.Object {
  var dayOfWeek: js.UndefOr[DayOfWeekString] = js.undefined
  var endHour: js.UndefOr[scala.Double] = js.undefined
  var endMinute: js.UndefOr[scala.Double] = js.undefined
  var startHour: js.UndefOr[scala.Double] = js.undefined
  var startMinute: js.UndefOr[scala.Double] = js.undefined
}

object ExtensionScheduleInput {
  @scala.inline
  def apply(
    dayOfWeek: DayOfWeekString = null,
    endHour: scala.Int | scala.Double = null,
    endMinute: scala.Int | scala.Double = null,
    startHour: scala.Int | scala.Double = null,
    startMinute: scala.Int | scala.Double = null
  ): ExtensionScheduleInput = {
    val __obj = js.Dynamic.literal()
    if (dayOfWeek != null) __obj.updateDynamic("dayOfWeek")(dayOfWeek)
    if (endHour != null) __obj.updateDynamic("endHour")(endHour.asInstanceOf[js.Any])
    if (endMinute != null) __obj.updateDynamic("endMinute")(endMinute.asInstanceOf[js.Any])
    if (startHour != null) __obj.updateDynamic("startHour")(startHour.asInstanceOf[js.Any])
    if (startMinute != null) __obj.updateDynamic("startMinute")(startMinute.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionScheduleInput]
  }
}

