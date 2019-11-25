package typings.gldatepicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlDatePickerSpecialDate extends GlDatePickerDate {
  var cssClass: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
}

object GlDatePickerSpecialDate {
  @scala.inline
  def apply(
    date: Date,
    cssClass: String = null,
    data: js.Any = null,
    repeatMonth: js.UndefOr[Boolean] = js.undefined,
    repeatYear: js.UndefOr[Boolean] = js.undefined
  ): GlDatePickerSpecialDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatMonth)) __obj.updateDynamic("repeatMonth")(repeatMonth.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatYear)) __obj.updateDynamic("repeatYear")(repeatYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlDatePickerSpecialDate]
  }
}

