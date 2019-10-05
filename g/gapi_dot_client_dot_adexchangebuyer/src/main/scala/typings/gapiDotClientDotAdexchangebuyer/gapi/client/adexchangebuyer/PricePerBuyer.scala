package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PricePerBuyer extends js.Object {
  /** Optional access type for this buyer. */
  var auctionTier: js.UndefOr[String] = js.undefined
  /** Reference to the buyer that will get billed. */
  var billedBuyer: js.UndefOr[Buyer] = js.undefined
  /**
    * The buyer who will pay this price. If unset, all buyers can pay this price (if the advertisers match, and there's no more specific rule matching the
    * buyer).
    */
  var buyer: js.UndefOr[Buyer] = js.undefined
  /** The specified price */
  var price: js.UndefOr[Price] = js.undefined
}

object PricePerBuyer {
  @scala.inline
  def apply(auctionTier: String = null, billedBuyer: Buyer = null, buyer: Buyer = null, price: Price = null): PricePerBuyer = {
    val __obj = js.Dynamic.literal()
    if (auctionTier != null) __obj.updateDynamic("auctionTier")(auctionTier)
    if (billedBuyer != null) __obj.updateDynamic("billedBuyer")(billedBuyer)
    if (buyer != null) __obj.updateDynamic("buyer")(buyer)
    if (price != null) __obj.updateDynamic("price")(price)
    __obj.asInstanceOf[PricePerBuyer]
  }
}

