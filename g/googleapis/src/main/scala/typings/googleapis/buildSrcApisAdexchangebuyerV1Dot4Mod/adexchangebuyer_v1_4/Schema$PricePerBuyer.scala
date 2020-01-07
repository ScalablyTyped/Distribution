package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to specify pricing rules for buyers. Each PricePerBuyer in a product
  * can become [0,1] deals. To check if there is a PricePerBuyer for a
  * particular buyer we look for the most specific matching rule - we first
  * look for a rule matching the buyer and otherwise look for a matching rule
  * where no buyer is set.
  */
@js.native
trait Schema$PricePerBuyer extends js.Object {
  /**
    * Optional access type for this buyer.
    */
  var auctionTier: js.UndefOr[String] = js.native
  /**
    * Reference to the buyer that will get billed.
    */
  var billedBuyer: js.UndefOr[Schema$Buyer] = js.native
  /**
    * The buyer who will pay this price. If unset, all buyers can pay this
    * price (if the advertisers match, and there&#39;s no more specific rule
    * matching the buyer).
    */
  var buyer: js.UndefOr[Schema$Buyer] = js.native
  /**
    * The specified price
    */
  var price: js.UndefOr[Schema$Price] = js.native
}

object Schema$PricePerBuyer {
  @scala.inline
  def apply(
    auctionTier: String = null,
    billedBuyer: Schema$Buyer = null,
    buyer: Schema$Buyer = null,
    price: Schema$Price = null
  ): Schema$PricePerBuyer = {
    val __obj = js.Dynamic.literal()
    if (auctionTier != null) __obj.updateDynamic("auctionTier")(auctionTier.asInstanceOf[js.Any])
    if (billedBuyer != null) __obj.updateDynamic("billedBuyer")(billedBuyer.asInstanceOf[js.Any])
    if (buyer != null) __obj.updateDynamic("buyer")(buyer.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PricePerBuyer]
  }
}

