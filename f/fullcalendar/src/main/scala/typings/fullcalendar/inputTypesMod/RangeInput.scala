package typings.fullcalendar.inputTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeInput extends ConstraintInput {
  var end: js.UndefOr[MomentInput] = js.undefined
  var start: js.UndefOr[MomentInput] = js.undefined
}

object RangeInput {
  @scala.inline
  def apply(end: MomentInput = null, start: MomentInput = null): RangeInput = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeInput]
  }
}

