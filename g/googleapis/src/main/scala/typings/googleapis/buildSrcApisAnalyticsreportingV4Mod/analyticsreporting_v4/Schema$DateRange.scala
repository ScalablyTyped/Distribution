package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A contiguous set of days: startDate, startDate + 1 day, ..., endDate. The
  * start and end dates are specified in
  * [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) date format `YYYY-MM-DD`.
  */
@js.native
trait Schema$DateRange extends js.Object {
  /**
    * The end date for the query in the format `YYYY-MM-DD`.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * The start date for the query in the format `YYYY-MM-DD`.
    */
  var startDate: js.UndefOr[String] = js.native
}

object Schema$DateRange {
  @scala.inline
  def apply(endDate: String = null, startDate: String = null): Schema$DateRange = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DateRange]
  }
}

