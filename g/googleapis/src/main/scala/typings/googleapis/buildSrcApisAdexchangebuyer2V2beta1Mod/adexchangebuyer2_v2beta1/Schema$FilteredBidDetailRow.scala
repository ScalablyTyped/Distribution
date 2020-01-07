package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of filtered bids with the specified dimension values, among
  * those filtered due to the requested filtering reason (i.e. creative
  * status), that have the specified detail.
  */
@js.native
trait Schema$FilteredBidDetailRow extends js.Object {
  /**
    * The number of bids with the specified detail.
    */
  var bidCount: js.UndefOr[Schema$MetricValue] = js.native
  /**
    * The ID of the detail. The associated value can be looked up in the
    * dictionary file corresponding to the DetailType in the response message.
    */
  var detailId: js.UndefOr[Double] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[Schema$RowDimensions] = js.native
}

object Schema$FilteredBidDetailRow {
  @scala.inline
  def apply(
    bidCount: Schema$MetricValue = null,
    detailId: Int | Double = null,
    rowDimensions: Schema$RowDimensions = null
  ): Schema$FilteredBidDetailRow = {
    val __obj = js.Dynamic.literal()
    if (bidCount != null) __obj.updateDynamic("bidCount")(bidCount.asInstanceOf[js.Any])
    if (detailId != null) __obj.updateDynamic("detailId")(detailId.asInstanceOf[js.Any])
    if (rowDimensions != null) __obj.updateDynamic("rowDimensions")(rowDimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FilteredBidDetailRow]
  }
}

