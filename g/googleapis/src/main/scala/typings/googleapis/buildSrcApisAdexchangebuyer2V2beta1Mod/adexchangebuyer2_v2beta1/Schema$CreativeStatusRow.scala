package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of bids with the specified dimension values that did not win the
  * auction (either were filtered pre-auction or lost the auction), as
  * described by the specified creative status.
  */
@js.native
trait Schema$CreativeStatusRow extends js.Object {
  /**
    * The number of bids with the specified status.
    */
  var bidCount: js.UndefOr[Schema$MetricValue] = js.native
  /**
    * The ID of the creative status. See
    * [creative-status-codes](https://developers.google.com/authorized-buyers/rtb/downloads/creative-status-codes).
    */
  var creativeStatusId: js.UndefOr[Double] = js.native
  /**
    * The values of all dimensions associated with metric values in this row.
    */
  var rowDimensions: js.UndefOr[Schema$RowDimensions] = js.native
}

object Schema$CreativeStatusRow {
  @scala.inline
  def apply(
    bidCount: Schema$MetricValue = null,
    creativeStatusId: Int | Double = null,
    rowDimensions: Schema$RowDimensions = null
  ): Schema$CreativeStatusRow = {
    val __obj = js.Dynamic.literal()
    if (bidCount != null) __obj.updateDynamic("bidCount")(bidCount.asInstanceOf[js.Any])
    if (creativeStatusId != null) __obj.updateDynamic("creativeStatusId")(creativeStatusId.asInstanceOf[js.Any])
    if (rowDimensions != null) __obj.updateDynamic("rowDimensions")(rowDimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreativeStatusRow]
  }
}

