package typings.fullcalendarVue.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRangeInput extends js.Object {
  var end: js.UndefOr[DateInput] = js.undefined
  var start: js.UndefOr[DateInput] = js.undefined
}

object DateRangeInput {
  @scala.inline
  def apply(end: DateInput = null, start: DateInput = null): DateRangeInput = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateRangeInput]
  }
}

