package typings.gapiDotClientDotAdexchangebuyer.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DealTermsNonGuaranteedAuctionTerms extends js.Object {
  /** True if open auction buyers are allowed to compete with invited buyers in this private auction (buyer-readonly). */
  var autoOptimizePrivateAuction: js.UndefOr[Boolean] = js.undefined
  /** Reserve price for the specified buyer. */
  var reservePricePerBuyers: js.UndefOr[js.Array[PricePerBuyer]] = js.undefined
}

object DealTermsNonGuaranteedAuctionTerms {
  @scala.inline
  def apply(
    autoOptimizePrivateAuction: js.UndefOr[Boolean] = js.undefined,
    reservePricePerBuyers: js.Array[PricePerBuyer] = null
  ): DealTermsNonGuaranteedAuctionTerms = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOptimizePrivateAuction)) __obj.updateDynamic("autoOptimizePrivateAuction")(autoOptimizePrivateAuction)
    if (reservePricePerBuyers != null) __obj.updateDynamic("reservePricePerBuyers")(reservePricePerBuyers)
    __obj.asInstanceOf[DealTermsNonGuaranteedAuctionTerms]
  }
}

