package typings.gapiClientAdexchangebuyer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  /** The date in ISO 8601 format for the data. The data is collected from 00:00:00 to 23:59:59 in PST. */
  var date: js.UndefOr[String] = js.undefined
  /** The filtering reasons. */
  var reasons: js.UndefOr[js.Array[FilteringCount]] = js.undefined
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

