package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventorySetRequest extends js.Object {
  /** The availability of the product. */
  var availability: js.UndefOr[String] = js.native
  /** Number and amount of installments to pay for an item. Brazil only. */
  var installment: js.UndefOr[Installment] = js.native
  /** Loyalty points that users receive after purchasing the item. Japan only. */
  var loyaltyPoints: js.UndefOr[LoyaltyPoints] = js.native
  /**
    * Store pickup information. Only supported for local inventory. Not setting pickup means "don't update" while setting it to the empty value ({} in JSON)
    * means "delete". Otherwise, pickupMethod and pickupSla must be set together, unless pickupMethod is "not supported".
    */
  var pickup: js.UndefOr[InventoryPickup] = js.native
  /** The price of the product. */
  var price: js.UndefOr[Price] = js.native
  /** The quantity of the product. Must be equal to or greater than zero. Supported only for local products. */
  var quantity: js.UndefOr[Double] = js.native
  /** The sale price of the product. Mandatory if sale_price_effective_date is defined. */
  var salePrice: js.UndefOr[Price] = js.native
  /** A date range represented by a pair of ISO 8601 dates separated by a space, comma, or slash. Both dates might be specified as 'null' if undecided. */
  var salePriceEffectiveDate: js.UndefOr[String] = js.native
  /** The quantity of the product that is reserved for sell-on-google ads. Supported only for online products. */
  var sellOnGoogleQuantity: js.UndefOr[Double] = js.native
}

object InventorySetRequest {
  @scala.inline
  def apply(): InventorySetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventorySetRequest]
  }
  @scala.inline
  implicit class InventorySetRequestOps[Self <: InventorySetRequest] (val x: Self) extends AnyVal {
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
    def setAvailability(value: String): Self = this.set("availability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailability: Self = this.set("availability", js.undefined)
    @scala.inline
    def setInstallment(value: Installment): Self = this.set("installment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstallment: Self = this.set("installment", js.undefined)
    @scala.inline
    def setLoyaltyPoints(value: LoyaltyPoints): Self = this.set("loyaltyPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoyaltyPoints: Self = this.set("loyaltyPoints", js.undefined)
    @scala.inline
    def setPickup(value: InventoryPickup): Self = this.set("pickup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickup: Self = this.set("pickup", js.undefined)
    @scala.inline
    def setPrice(value: Price): Self = this.set("price", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    @scala.inline
    def setSalePrice(value: Price): Self = this.set("salePrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSalePrice: Self = this.set("salePrice", js.undefined)
    @scala.inline
    def setSalePriceEffectiveDate(value: String): Self = this.set("salePriceEffectiveDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSalePriceEffectiveDate: Self = this.set("salePriceEffectiveDate", js.undefined)
    @scala.inline
    def setSellOnGoogleQuantity(value: Double): Self = this.set("sellOnGoogleQuantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSellOnGoogleQuantity: Self = this.set("sellOnGoogleQuantity", js.undefined)
  }
  
}

