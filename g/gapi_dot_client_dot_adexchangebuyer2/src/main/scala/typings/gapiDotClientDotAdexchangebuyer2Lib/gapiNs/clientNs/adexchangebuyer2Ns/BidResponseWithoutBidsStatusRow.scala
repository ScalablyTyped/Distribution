package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BidResponseWithoutBidsStatusRow extends js.Object {
  /**
               * The number of impressions for which there was a bid response with the
               * specified status.
               */
  var impressionCount: js.UndefOr[MetricValue] = js.undefined
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.undefined
  /**
               * The status specifying why the bid responses were considered to have no
               * applicable bids.
               */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

