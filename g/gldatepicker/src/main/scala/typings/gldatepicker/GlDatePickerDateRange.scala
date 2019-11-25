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
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatYear)) __obj.updateDynamic("repeatYear")(repeatYear.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlDatePickerDateRange]
  }
}

