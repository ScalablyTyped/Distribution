package typings.gapiClientAdexchangebuyer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilteringCount extends js.Object {
  /** The number of times the creative was filtered for the status. The count is aggregated across all publishers on the exchange. */
  var filteringCount: js.UndefOr[String] = js.undefined
  /** The filtering status code as defined in  creative-status-codes.txt. */
  var filteringStatus: js.UndefOr[Double] = js.undefined
}

object FilteringCount {
  @scala.inline
  def apply(filteringCount: String = null, filteringStatus: js.UndefOr[Double] = js.undefined): FilteringCount = {
    val __obj = js.Dynamic.literal()
    if (filteringCount != null) __obj.updateDynamic("filteringCount")(filteringCount.asInstanceOf[js.Any])
    if (!js.isUndefined(filteringStatus)) __obj.updateDynamic("filteringStatus")(filteringStatus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilteringCount]
  }
}

