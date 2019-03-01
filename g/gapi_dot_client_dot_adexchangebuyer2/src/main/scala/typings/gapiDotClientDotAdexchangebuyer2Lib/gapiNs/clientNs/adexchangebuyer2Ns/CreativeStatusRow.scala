package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeStatusRow extends js.Object {
  /** The number of bids with the specified status. */
  var bidCount: js.UndefOr[MetricValue] = js.undefined
  /**
    * The ID of the creative status.
    * See [creative-status-codes](https://developers.google.com/ad-exchange/rtb/downloads/creative-status-codes).
    */
  var creativeStatusId: js.UndefOr[scala.Double] = js.undefined
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.undefined
}

object CreativeStatusRow {
  @scala.inline
  def apply(
    bidCount: MetricValue = null,
    creativeStatusId: scala.Int | scala.Double = null,
    rowDimensions: RowDimensions = null
  ): CreativeStatusRow = {
    val __obj = js.Dynamic.literal()
    if (bidCount != null) __obj.updateDynamic("bidCount")(bidCount)
    if (creativeStatusId != null) __obj.updateDynamic("creativeStatusId")(creativeStatusId.asInstanceOf[js.Any])
    if (rowDimensions != null) __obj.updateDynamic("rowDimensions")(rowDimensions)
    __obj.asInstanceOf[CreativeStatusRow]
  }
}

