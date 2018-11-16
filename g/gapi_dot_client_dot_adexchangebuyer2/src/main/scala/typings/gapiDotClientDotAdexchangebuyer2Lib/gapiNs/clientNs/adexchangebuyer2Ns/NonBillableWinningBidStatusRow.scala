package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NonBillableWinningBidStatusRow extends js.Object {
  /** The number of bids with the specified status. */
  var bidCount: js.UndefOr[MetricValue] = js.undefined
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.undefined
  /** The status specifying why the winning bids were not billed. */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

