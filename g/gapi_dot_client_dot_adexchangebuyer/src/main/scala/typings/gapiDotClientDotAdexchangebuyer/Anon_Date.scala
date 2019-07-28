package typings.gapiDotClientDotAdexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  /** The date in ISO 8601 format for the data. The data is collected from 00:00:00 to 23:59:59 in PST. */
  var date: js.UndefOr[String] = js.undefined
  /** The filtering reasons. */
  var reasons: js.UndefOr[js.Array[Anon_FilteringCount]] = js.undefined
}

object Anon_Date {
  @scala.inline
  def apply(date: String = null, reasons: js.Array[Anon_FilteringCount] = null): Anon_Date = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (reasons != null) __obj.updateDynamic("reasons")(reasons)
    __obj.asInstanceOf[Anon_Date]
  }
}

