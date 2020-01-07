package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DealTermsNonGuaranteedAuctionTerms extends js.Object {
  /**
    * True if open auction buyers are allowed to compete with invited buyers in
    * this private auction (buyer-readonly).
    */
  var autoOptimizePrivateAuction: js.UndefOr[Boolean] = js.native
  /**
    * Reserve price for the specified buyer.
    */
  var reservePricePerBuyers: js.UndefOr[js.Array[Schema$PricePerBuyer]] = js.native
}

object Schema$DealTermsNonGuaranteedAuctionTerms {
  @scala.inline
  def apply(
    autoOptimizePrivateAuction: js.UndefOr[Boolean] = js.undefined,
    reservePricePerBuyers: js.Array[Schema$PricePerBuyer] = null
  ): Schema$DealTermsNonGuaranteedAuctionTerms = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOptimizePrivateAuction)) __obj.updateDynamic("autoOptimizePrivateAuction")(autoOptimizePrivateAuction.asInstanceOf[js.Any])
    if (reservePricePerBuyers != null) __obj.updateDynamic("reservePricePerBuyers")(reservePricePerBuyers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DealTermsNonGuaranteedAuctionTerms]
  }
}

