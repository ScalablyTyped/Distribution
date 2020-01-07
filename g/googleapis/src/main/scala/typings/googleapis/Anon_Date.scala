package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Date extends js.Object {
  var date: js.UndefOr[String] = js.native
  var reasons: js.UndefOr[js.Array[Anon_FilteringCount]] = js.native
}

object Anon_Date {
  @scala.inline
  def apply(date: String = null, reasons: js.Array[Anon_FilteringCount] = null): Anon_Date = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (reasons != null) __obj.updateDynamic("reasons")(reasons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Date]
  }
}

