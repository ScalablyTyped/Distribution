package typings.gldatepicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlDatePickerDate extends js.Object {
  var date: Date
  var repeatMonth: js.UndefOr[Boolean] = js.undefined
  var repeatYear: js.UndefOr[Boolean] = js.undefined
}

object GlDatePickerDate {
  @scala.inline
  def apply(
    date: Date,
    repeatMonth: js.UndefOr[Boolean] = js.undefined,
    repeatYear: js.UndefOr[Boolean] = js.undefined
  ): GlDatePickerDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatMonth)) __obj.updateDynamic("repeatMonth")(repeatMonth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatYear)) __obj.updateDynamic("repeatYear")(repeatYear.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlDatePickerDate]
  }
}

