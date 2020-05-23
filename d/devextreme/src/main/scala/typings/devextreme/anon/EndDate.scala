package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndDate extends js.Object {
  var endDate: js.UndefOr[typings.std.Date] = js.undefined
  var startDate: js.UndefOr[typings.std.Date] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object EndDate {
  @scala.inline
  def apply(endDate: typings.std.Date = null, startDate: typings.std.Date = null, text: String = null): EndDate = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndDate]
  }
}

