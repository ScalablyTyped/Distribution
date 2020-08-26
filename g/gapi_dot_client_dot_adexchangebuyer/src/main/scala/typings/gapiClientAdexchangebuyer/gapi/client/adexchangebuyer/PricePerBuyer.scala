package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PricePerBuyer extends js.Object {
  /** Optional access type for this buyer. */
  var auctionTier: js.UndefOr[String] = js.native
  /** Reference to the buyer that will get billed. */
  var billedBuyer: js.UndefOr[Buyer] = js.native
  /**
    * The buyer who will pay this price. If unset, all buyers can pay this price (if the advertisers match, and there's no more specific rule matching the
    * buyer).
    */
  var buyer: js.UndefOr[Buyer] = js.native
  /** The specified price */
  var price: js.UndefOr[Price] = js.native
}

object PricePerBuyer {
  @scala.inline
  def apply(): PricePerBuyer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PricePerBuyer]
  }
  @scala.inline
  implicit class PricePerBuyerOps[Self <: PricePerBuyer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuctionTier(value: String): Self = this.set("auctionTier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuctionTier: Self = this.set("auctionTier", js.undefined)
    @scala.inline
    def setBilledBuyer(value: Buyer): Self = this.set("billedBuyer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBilledBuyer: Self = this.set("billedBuyer", js.undefined)
    @scala.inline
    def setBuyer(value: Buyer): Self = this.set("buyer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuyer: Self = this.set("buyer", js.undefined)
    @scala.inline
    def setPrice(value: Price): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
  }
  
}

