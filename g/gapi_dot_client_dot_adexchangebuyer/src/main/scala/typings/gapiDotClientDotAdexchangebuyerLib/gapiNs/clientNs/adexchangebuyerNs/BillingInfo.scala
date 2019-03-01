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

object BillingInfo {
  @scala.inline
  def apply(
    accountId: scala.Int | scala.Double = null,
    accountName: java.lang.String = null,
    billingId: js.Array[java.lang.String] = null,
    kind: java.lang.String = null
  ): BillingInfo = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (accountName != null) __obj.updateDynamic("accountName")(accountName)
    if (billingId != null) __obj.updateDynamic("billingId")(billingId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[BillingInfo]
  }
}

