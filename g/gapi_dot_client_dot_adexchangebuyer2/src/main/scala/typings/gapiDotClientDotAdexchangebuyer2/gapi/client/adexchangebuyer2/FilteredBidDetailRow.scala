package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilteredBidDetailRow extends js.Object {
  /** The number of bids with the specified detail. */
  var bidCount: js.UndefOr[MetricValue] = js.undefined
  /**
    * The ID of the detail. The associated value can be looked up in the
    * dictionary file corresponding to the DetailType in the response message.
    */
  var detailId: js.UndefOr[Double] = js.undefined
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.undefined
}

object FilteredBidDetailRow {
  @scala.inline
  def apply(bidCount: MetricValue = null, detailId: Int | Double = null, rowDimensions: RowDimensions = null): FilteredBidDetailRow = {
    val __obj = js.Dynamic.literal()
    if (bidCount != null) __obj.updateDynamic("bidCount")(bidCount.asInstanceOf[js.Any])
    if (detailId != null) __obj.updateDynamic("detailId")(detailId.asInstanceOf[js.Any])
    if (rowDimensions != null) __obj.updateDynamic("rowDimensions")(rowDimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilteredBidDetailRow]
  }
}

