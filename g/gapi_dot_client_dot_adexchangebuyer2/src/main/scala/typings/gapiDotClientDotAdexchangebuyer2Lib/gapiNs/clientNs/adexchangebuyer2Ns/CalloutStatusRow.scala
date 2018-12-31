package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalloutStatusRow extends js.Object {
  /**
    * The ID of the callout status.
    * See [callout-status-codes](https://developers.google.com/ad-exchange/rtb/downloads/callout-status-codes).
    */
  var calloutStatusId: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of impressions for which there was a bid request or bid response
    * with the specified callout status.
    */
  var impressionCount: js.UndefOr[MetricValue] = js.undefined
  /** The values of all dimensions associated with metric values in this row. */
  var rowDimensions: js.UndefOr[RowDimensions] = js.undefined
}

