package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Terms for Private Auctions. Note that Private Auctions can be created only
  * by the seller, but they can be returned in a get or list request.
  */
@js.native
trait Schema$NonGuaranteedAuctionTerms extends js.Object {
  /**
    * True if open auction buyers are allowed to compete with invited buyers in
    * this private auction.
    */
  var autoOptimizePrivateAuction: js.UndefOr[Boolean] = js.native
  /**
    * Reserve price for the specified buyer.
    */
  var reservePricesPerBuyer: js.UndefOr[js.Array[Schema$PricePerBuyer]] = js.native
}

object Schema$NonGuaranteedAuctionTerms {
  @scala.inline
  def apply(
    autoOptimizePrivateAuction: js.UndefOr[Boolean] = js.undefined,
    reservePricesPerBuyer: js.Array[Schema$PricePerBuyer] = null
  ): Schema$NonGuaranteedAuctionTerms = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOptimizePrivateAuction)) __obj.updateDynamic("autoOptimizePrivateAuction")(autoOptimizePrivateAuction.asInstanceOf[js.Any])
    if (reservePricesPerBuyer != null) __obj.updateDynamic("reservePricesPerBuyer")(reservePricesPerBuyer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NonGuaranteedAuctionTerms]
  }
}

