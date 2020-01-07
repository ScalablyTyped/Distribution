package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of impressions with the specified dimension values that were
  * considered to have no applicable bids, as described by the specified
  * status.
  */
@js.native
trait Schema$BidResponseWithoutBidsStatusRow extends js.Object {
  /**
    * The number of impressions for which there was a bid response with the
    * specified status.
    */
  var impressionCount: js.UndefOr[Schema$MetricValue] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[Schema$RowDimensions] = js.native
  /**
    * The status specifying why the bid responses were considered to have no
    * applicable bids.
    */
  var status: js.UndefOr[String] = js.native
}

object Schema$BidResponseWithoutBidsStatusRow {
  @scala.inline
  def apply(
    impressionCount: Schema$MetricValue = null,
    rowDimensions: Schema$RowDimensions = null,
    status: String = null
  ): Schema$BidResponseWithoutBidsStatusRow = {
    val __obj = js.Dynamic.literal()
    if (impressionCount != null) __obj.updateDynamic("impressionCount")(impressionCount.asInstanceOf[js.Any])
    if (rowDimensions != null) __obj.updateDynamic("rowDimensions")(rowDimensions.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BidResponseWithoutBidsStatusRow]
  }
}

