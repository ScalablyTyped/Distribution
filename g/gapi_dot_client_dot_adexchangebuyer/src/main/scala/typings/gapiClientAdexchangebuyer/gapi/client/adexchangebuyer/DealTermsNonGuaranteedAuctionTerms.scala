package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

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
    if (!js.isUndefined(autoOptimizePrivateAuction)) __obj.updateDynamic("autoOptimizePrivateAuction")(autoOptimizePrivateAuction.get.asInstanceOf[js.Any])
    if (reservePricePerBuyers != null) __obj.updateDynamic("reservePricePerBuyers")(reservePricePerBuyers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DealTermsNonGuaranteedAuctionTerms]
  }
}

