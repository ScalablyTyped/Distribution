package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbsoluteDateRange extends js.Object {
  /**
    * The end date of the range (inclusive).
    * Must be within the 30 days leading up to current date, and must be equal to
    * or after start_date.
    */
  var endDate: js.UndefOr[Date] = js.undefined
  /**
    * The start date of the range (inclusive).
    * Must be within the 30 days leading up to current date, and must be equal to
    * or before end_date.
    */
  var startDate: js.UndefOr[Date] = js.undefined
}

object AbsoluteDateRange {
  @scala.inline
  def apply(endDate: Date = null, startDate: Date = null): AbsoluteDateRange = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbsoluteDateRange]
  }
}

