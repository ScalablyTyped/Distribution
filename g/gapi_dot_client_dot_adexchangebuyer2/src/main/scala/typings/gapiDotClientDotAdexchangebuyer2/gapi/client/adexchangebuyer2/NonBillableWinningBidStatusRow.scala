package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonBillableWinningBidStatusRow extends js.Object {
  /** The number of bids with the specified status. */
  var bidCount: js.UndefOr[MetricValue] = js.undefined
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.undefined
  /** The status specifying why the winning bids were not billed. */
  var status: js.UndefOr[String] = js.undefined
}

object NonBillableWinningBidStatusRow {
  @scala.inline
  def apply(bidCount: MetricValue = null, rowDimensions: RowDimensions = null, status: String = null): NonBillableWinningBidStatusRow = {
    val __obj = js.Dynamic.literal()
    if (bidCount != null) __obj.updateDynamic("bidCount")(bidCount.asInstanceOf[js.Any])
    if (rowDimensions != null) __obj.updateDynamic("rowDimensions")(rowDimensions.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonBillableWinningBidStatusRow]
  }
}

