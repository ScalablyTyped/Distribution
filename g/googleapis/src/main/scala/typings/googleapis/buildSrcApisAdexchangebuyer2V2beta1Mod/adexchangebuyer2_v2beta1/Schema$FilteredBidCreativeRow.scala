package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of filtered bids with the specified dimension values that have
  * the specified creative.
  */
@js.native
trait Schema$FilteredBidCreativeRow extends js.Object {
  /**
    * The number of bids with the specified creative.
    */
  var bidCount: js.UndefOr[Schema$MetricValue] = js.native
  /**
    * The ID of the creative.
    */
  var creativeId: js.UndefOr[String] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[Schema$RowDimensions] = js.native
}

object Schema$FilteredBidCreativeRow {
  @scala.inline
  def apply(
    bidCount: Schema$MetricValue = null,
    creativeId: String = null,
    rowDimensions: Schema$RowDimensions = null
  ): Schema$FilteredBidCreativeRow = {
    val __obj = js.Dynamic.literal()
    if (bidCount != null) __obj.updateDynamic("bidCount")(bidCount.asInstanceOf[js.Any])
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId.asInstanceOf[js.Any])
    if (rowDimensions != null) __obj.updateDynamic("rowDimensions")(rowDimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FilteredBidCreativeRow]
  }
}

