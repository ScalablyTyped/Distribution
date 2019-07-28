package typings.fullcalendar.srcTypesInputDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusinessHoursInput extends ConstraintInput {
  var dow: js.UndefOr[js.Array[Double]] = js.undefined
  var end: js.UndefOr[MomentInput] = js.undefined
  var start: js.UndefOr[MomentInput] = js.undefined
}

object BusinessHoursInput {
  @scala.inline
  def apply(dow: js.Array[Double] = null, end: MomentInput = null, start: MomentInput = null): BusinessHoursInput = {
    val __obj = js.Dynamic.literal()
    if (dow != null) __obj.updateDynamic("dow")(dow)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusinessHoursInput]
  }
}

