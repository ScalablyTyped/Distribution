package typings.gldatepicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlDatePickerDateRange extends js.Object {
  var from: Date
  var repeatYear: js.UndefOr[Boolean] = js.undefined
  var to: js.UndefOr[Date] = js.undefined
}

object GlDatePickerDateRange {
  @scala.inline
  def apply(from: Date, repeatYear: js.UndefOr[Boolean] = js.undefined, to: Date = null): GlDatePickerDateRange = {
    val __obj = js.Dynamic.literal(from = from)
    if (!js.isUndefined(repeatYear)) __obj.updateDynamic("repeatYear")(repeatYear)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[GlDatePickerDateRange]
  }
}

