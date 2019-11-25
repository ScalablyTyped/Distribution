package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BidResponseWithoutBidsStatusRow extends js.Object {
  /**
    * The number of impressions for which there was a bid response with the
    * specified status.
    */
  var impressionCount: js.UndefOr[MetricValue] = js.undefined
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.undefined
  /**
    * The status specifying why the bid responses were considered to have no
    * applicable bids.
    */
  var status: js.UndefOr[String] = js.undefined
}

object BidResponseWithoutBidsStatusRow {
  @scala.inline
  def apply(impressionCount: MetricValue = null, rowDimensions: RowDimensions = null, status: String = null): BidResponseWithoutBidsStatusRow = {
    val __obj = js.Dynamic.literal()
    if (impressionCount != null) __obj.updateDynamic("impressionCount")(impressionCount.asInstanceOf[js.Any])
    if (rowDimensions != null) __obj.updateDynamic("rowDimensions")(rowDimensions.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BidResponseWithoutBidsStatusRow]
  }
}

