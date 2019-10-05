package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingInfo extends js.Object {
  /** Account id. */
  var accountId: js.UndefOr[Double] = js.undefined
  /** Account name. */
  var accountName: js.UndefOr[String] = js.undefined
  /**
    * A list of adgroup IDs associated with this particular account. These IDs may show up as part of a realtime bidding BidRequest, which indicates a bid
    * request for this account.
    */
  var billingId: js.UndefOr[js.Array[String]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
}

object BillingInfo {
  @scala.inline
  def apply(
    accountId: Int | Double = null,
    accountName: String = null,
    billingId: js.Array[String] = null,
    kind: String = null
  ): BillingInfo = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (accountName != null) __obj.updateDynamic("accountName")(accountName)
    if (billingId != null) __obj.updateDynamic("billingId")(billingId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[BillingInfo]
  }
}

