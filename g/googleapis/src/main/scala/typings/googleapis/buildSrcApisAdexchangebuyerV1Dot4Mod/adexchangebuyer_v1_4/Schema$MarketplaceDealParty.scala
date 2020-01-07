package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$MarketplaceDealParty extends js.Object {
  /**
    * The buyer/seller associated with the deal. One of buyer/seller is
    * specified for a deal-party.
    */
  var buyer: js.UndefOr[Schema$Buyer] = js.native
  /**
    * The buyer/seller associated with the deal. One of buyer/seller is
    * specified for a deal party.
    */
  var seller: js.UndefOr[Schema$Seller] = js.native
}

object Schema$MarketplaceDealParty {
  @scala.inline
  def apply(buyer: Schema$Buyer = null, seller: Schema$Seller = null): Schema$MarketplaceDealParty = {
    val __obj = js.Dynamic.literal()
    if (buyer != null) __obj.updateDynamic("buyer")(buyer.asInstanceOf[js.Any])
    if (seller != null) __obj.updateDynamic("seller")(seller.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MarketplaceDealParty]
  }
}

