package typings
package gldatepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlDatePickerSpecialDate extends GlDatePickerDate {
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
}

object GlDatePickerSpecialDate {
  @scala.inline
  def apply(
    date: stdLib.Date,
    cssClass: java.lang.String = null,
    data: js.Any = null,
    repeatMonth: js.UndefOr[scala.Boolean] = js.undefined,
    repeatYear: js.UndefOr[scala.Boolean] = js.undefined
  ): GlDatePickerSpecialDate = {
    val __obj = js.Dynamic.literal(date = date)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(repeatMonth)) __obj.updateDynamic("repeatMonth")(repeatMonth)
    if (!js.isUndefined(repeatYear)) __obj.updateDynamic("repeatYear")(repeatYear)
    __obj.asInstanceOf[GlDatePickerSpecialDate]
  }
}

