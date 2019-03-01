package typings
package gldatepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlDatePickerDateRange extends js.Object {
  var from: stdLib.Date
  var repeatYear: js.UndefOr[scala.Boolean] = js.undefined
  var to: js.UndefOr[stdLib.Date] = js.undefined
}

object GlDatePickerDateRange {
  @scala.inline
  def apply(from: stdLib.Date, repeatYear: js.UndefOr[scala.Boolean] = js.undefined, to: stdLib.Date = null): GlDatePickerDateRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    if (!js.isUndefined(repeatYear)) __obj.updateDynamic("repeatYear")(repeatYear)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[GlDatePickerDateRange]
  }
}

