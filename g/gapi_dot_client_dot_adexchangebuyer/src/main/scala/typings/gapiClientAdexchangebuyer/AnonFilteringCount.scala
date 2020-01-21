package typings.gapiClientAdexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilteringCount extends js.Object {
  /** The number of times the creative was filtered for the status. The count is aggregated across all publishers on the exchange. */
  var filteringCount: js.UndefOr[String] = js.undefined
  /** The filtering status code as defined in  creative-status-codes.txt. */
  var filteringStatus: js.UndefOr[Double] = js.undefined
}

object AnonFilteringCount {
  @scala.inline
  def apply(filteringCount: String = null, filteringStatus: Int | Double = null): AnonFilteringCount = {
    val __obj = js.Dynamic.literal()
    if (filteringCount != null) __obj.updateDynamic("filteringCount")(filteringCount.asInstanceOf[js.Any])
    if (filteringStatus != null) __obj.updateDynamic("filteringStatus")(filteringStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilteringCount]
  }
}

