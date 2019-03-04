package typings
package gldatepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlDatePickerDate extends js.Object {
  var date: stdLib.Date
  var repeatMonth: js.UndefOr[scala.Boolean] = js.undefined
  var repeatYear: js.UndefOr[scala.Boolean] = js.undefined
}

object GlDatePickerDate {
  @scala.inline
  def apply(
    date: stdLib.Date,
    repeatMonth: js.UndefOr[scala.Boolean] = js.undefined,
    repeatYear: js.UndefOr[scala.Boolean] = js.undefined
  ): GlDatePickerDate = {
    val __obj = js.Dynamic.literal(date = date)
    if (!js.isUndefined(repeatMonth)) __obj.updateDynamic("repeatMonth")(repeatMonth)
    if (!js.isUndefined(repeatYear)) __obj.updateDynamic("repeatYear")(repeatYear)
    __obj.asInstanceOf[GlDatePickerDate]
  }
}

