package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Date extends js.Object {
  var date: js.UndefOr[String] = js.native
  var reasons: js.UndefOr[js.Array[FilteringCount]] = js.native
}

object Date {
  @scala.inline
  def apply(date: String = null, reasons: js.Array[FilteringCount] = null): Date = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (reasons != null) __obj.updateDynamic("reasons")(reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
}

