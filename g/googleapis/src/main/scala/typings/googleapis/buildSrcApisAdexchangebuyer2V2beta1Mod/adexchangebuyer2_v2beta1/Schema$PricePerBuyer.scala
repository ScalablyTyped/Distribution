package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to specify pricing rules for buyers/advertisers. Each PricePerBuyer in
  * a product can become 0 or 1 deals. To check if there is a PricePerBuyer for
  * a particular buyer or buyer/advertiser pair, we look for the most specific
  * matching rule - we first look for a rule matching the buyer and advertiser,
  * next a rule with the buyer but an empty advertiser list, and otherwise look
  * for a matching rule where no buyer is set.
  */
@js.native
trait Schema$PricePerBuyer extends js.Object {
  /**
    * The list of advertisers for this price when associated with this buyer.
    * If empty, all advertisers with this buyer pay this price.
    */
  var advertiserIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The buyer who will pay this price. If unset, all buyers can pay this
    * price (if the advertisers match, and there&#39;s no more specific rule
    * matching the buyer).
    */
  var buyer: js.UndefOr[Schema$Buyer] = js.native
  /**
    * The specified price.
    */
  var price: js.UndefOr[Schema$Price] = js.native
}

object Schema$PricePerBuyer {
  @scala.inline
  def apply(advertiserIds: js.Array[String] = null, buyer: Schema$Buyer = null, price: Schema$Price = null): Schema$PricePerBuyer = {
    val __obj = js.Dynamic.literal()
    if (advertiserIds != null) __obj.updateDynamic("advertiserIds")(advertiserIds.asInstanceOf[js.Any])
    if (buyer != null) __obj.updateDynamic("buyer")(buyer.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PricePerBuyer]
  }
}

