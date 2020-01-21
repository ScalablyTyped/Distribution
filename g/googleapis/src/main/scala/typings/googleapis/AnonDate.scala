package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDate extends js.Object {
  var date: js.UndefOr[String] = js.native
  var reasons: js.UndefOr[js.Array[AnonFilteringCount]] = js.native
}

object AnonDate {
  @scala.inline
  def apply(date: String = null, reasons: js.Array[AnonFilteringCount] = null): AnonDate = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (reasons != null) __obj.updateDynamic("reasons")(reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDate]
  }
}

