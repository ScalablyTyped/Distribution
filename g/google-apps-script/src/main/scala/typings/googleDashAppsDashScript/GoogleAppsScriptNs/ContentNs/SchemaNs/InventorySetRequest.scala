package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventorySetRequest extends js.Object {
  var availability: js.UndefOr[String] = js.undefined
  var customLabel0: js.UndefOr[String] = js.undefined
  var customLabel1: js.UndefOr[String] = js.undefined
  var customLabel2: js.UndefOr[String] = js.undefined
  var customLabel3: js.UndefOr[String] = js.undefined
  var customLabel4: js.UndefOr[String] = js.undefined
  var installment: js.UndefOr[Installment] = js.undefined
  var instoreProductLocation: js.UndefOr[String] = js.undefined
  var loyaltyPoints: js.UndefOr[LoyaltyPoints] = js.undefined
  var pickup: js.UndefOr[InventoryPickup] = js.undefined
  var price: js.UndefOr[Price] = js.undefined
  var quantity: js.UndefOr[Double] = js.undefined
  var salePrice: js.UndefOr[Price] = js.undefined
  var salePriceEffectiveDate: js.UndefOr[String] = js.undefined
  var sellOnGoogleQuantity: js.UndefOr[Double] = js.undefined
}

object InventorySetRequest {
  @scala.inline
  def apply(
    availability: String = null,
    customLabel0: String = null,
    customLabel1: String = null,
    customLabel2: String = null,
    customLabel3: String = null,
    customLabel4: String = null,
    installment: Installment = null,
    instoreProductLocation: String = null,
    loyaltyPoints: LoyaltyPoints = null,
    pickup: InventoryPickup = null,
    price: Price = null,
    quantity: Int | Double = null,
    salePrice: Price = null,
    salePriceEffectiveDate: String = null,
    sellOnGoogleQuantity: Int | Double = null
  ): InventorySetRequest = {
    val __obj = js.Dynamic.literal()
    if (availability != null) __obj.updateDynamic("availability")(availability)
    if (customLabel0 != null) __obj.updateDynamic("customLabel0")(customLabel0)
    if (customLabel1 != null) __obj.updateDynamic("customLabel1")(customLabel1)
    if (customLabel2 != null) __obj.updateDynamic("customLabel2")(customLabel2)
    if (customLabel3 != null) __obj.updateDynamic("customLabel3")(customLabel3)
    if (customLabel4 != null) __obj.updateDynamic("customLabel4")(customLabel4)
    if (installment != null) __obj.updateDynamic("installment")(installment)
    if (instoreProductLocation != null) __obj.updateDynamic("instoreProductLocation")(instoreProductLocation)
    if (loyaltyPoints != null) __obj.updateDynamic("loyaltyPoints")(loyaltyPoints)
    if (pickup != null) __obj.updateDynamic("pickup")(pickup)
    if (price != null) __obj.updateDynamic("price")(price)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (salePrice != null) __obj.updateDynamic("salePrice")(salePrice)
    if (salePriceEffectiveDate != null) __obj.updateDynamic("salePriceEffectiveDate")(salePriceEffectiveDate)
    if (sellOnGoogleQuantity != null) __obj.updateDynamic("sellOnGoogleQuantity")(sellOnGoogleQuantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventorySetRequest]
  }
}

