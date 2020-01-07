package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An absolute date range, specified by its start date and end date. The
  * supported range of dates begins 30 days before today and ends today.
  * Validity checked upon filter set creation. If a filter set with an absolute
  * date range is run at a later date more than 30 days after start_date, it
  * will fail.
  */
@js.native
trait Schema$AbsoluteDateRange extends js.Object {
  /**
    * The end date of the range (inclusive). Must be within the 30 days leading
    * up to current date, and must be equal to or after start_date.
    */
  var endDate: js.UndefOr[Schema$Date] = js.native
  /**
    * The start date of the range (inclusive). Must be within the 30 days
    * leading up to current date, and must be equal to or before end_date.
    */
  var startDate: js.UndefOr[Schema$Date] = js.native
}

object Schema$AbsoluteDateRange {
  @scala.inline
  def apply(endDate: Schema$Date = null, startDate: Schema$Date = null): Schema$AbsoluteDateRange = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AbsoluteDateRange]
  }
}

