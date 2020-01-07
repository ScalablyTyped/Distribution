package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of winning bids with the specified dimension values for which
  * the buyer was not billed, as described by the specified status.
  */
@js.native
trait Schema$NonBillableWinningBidStatusRow extends js.Object {
  /**
    * The number of bids with the specified status.
    */
  var bidCount: js.UndefOr[Schema$MetricValue] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[Schema$RowDimensions] = js.native
  /**
    * The status specifying why the winning bids were not billed.
    */
  var status: js.UndefOr[String] = js.native
}

object Schema$NonBillableWinningBidStatusRow {
  @scala.inline
  def apply(
    bidCount: Schema$MetricValue = null,
    rowDimensions: Schema$RowDimensions = null,
    status: String = null
  ): Schema$NonBillableWinningBidStatusRow = {
    val __obj = js.Dynamic.literal()
    if (bidCount != null) __obj.updateDynamic("bidCount")(bidCount.asInstanceOf[js.Any])
    if (rowDimensions != null) __obj.updateDynamic("rowDimensions")(rowDimensions.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NonBillableWinningBidStatusRow]
  }
}

