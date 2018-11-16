package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

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
  var detailId: js.UndefOr[scala.Double] = js.undefined
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.undefined
}

