package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilteredBidCreativeRow extends js.Object {
  /** The number of bids with the specified creative. */
  var bidCount: js.UndefOr[MetricValue] = js.undefined
  /** The ID of the creative. */
  var creativeId: js.UndefOr[java.lang.String] = js.undefined
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.undefined
}

