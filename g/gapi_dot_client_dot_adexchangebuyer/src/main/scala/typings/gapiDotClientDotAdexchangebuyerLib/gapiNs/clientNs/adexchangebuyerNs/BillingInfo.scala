package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingInfo extends js.Object {
  /** Account id. */
  var accountId: js.UndefOr[scala.Double] = js.undefined
  /** Account name. */
  var accountName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of adgroup IDs associated with this particular account. These IDs may show up as part of a realtime bidding BidRequest, which indicates a bid
    * request for this account.
    */
  var billingId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

