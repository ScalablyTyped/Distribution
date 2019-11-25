package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inventory extends js.Object {
  var availability: js.UndefOr[String] = js.undefined
  var customLabel0: js.UndefOr[String] = js.undefined
  var customLabel1: js.UndefOr[String] = js.undefined
  var customLabel2: js.UndefOr[String] = js.undefined
  var customLabel3: js.UndefOr[String] = js.undefined
  var customLabel4: js.UndefOr[String] = js.undefined
  var installment: js.UndefOr[Installment] = js.undefined
  var instoreProductLocation: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var loyaltyPoints: js.UndefOr[LoyaltyPoints] = js.undefined
  var pickup: js.UndefOr[InventoryPickup] = js.undefined
  var price: js.UndefOr[Price] = js.undefined
  var quantity: js.UndefOr[Double] = js.undefined
  var salePrice: js.UndefOr[Price] = js.undefined
  var salePriceEffectiveDate: js.UndefOr[String] = js.undefined
  var sellOnGoogleQuantity: js.UndefOr[Double] = js.undefined
}

object Inventory {
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
    kind: String = null,
    loyaltyPoints: LoyaltyPoints = null,
    pickup: InventoryPickup = null,
    price: Price = null,
    quantity: Int | Double = null,
    salePrice: Price = null,
    salePriceEffectiveDate: String = null,
    sellOnGoogleQuantity: Int | Double = null
  ): Inventory = {
    val __obj = js.Dynamic.literal()
    if (availability != null) __obj.updateDynamic("availability")(availability.asInstanceOf[js.Any])
    if (customLabel0 != null) __obj.updateDynamic("customLabel0")(customLabel0.asInstanceOf[js.Any])
    if (customLabel1 != null) __obj.updateDynamic("customLabel1")(customLabel1.asInstanceOf[js.Any])
    if (customLabel2 != null) __obj.updateDynamic("customLabel2")(customLabel2.asInstanceOf[js.Any])
    if (customLabel3 != null) __obj.updateDynamic("customLabel3")(customLabel3.asInstanceOf[js.Any])
    if (customLabel4 != null) __obj.updateDynamic("customLabel4")(customLabel4.asInstanceOf[js.Any])
    if (installment != null) __obj.updateDynamic("installment")(installment.asInstanceOf[js.Any])
    if (instoreProductLocation != null) __obj.updateDynamic("instoreProductLocation")(instoreProductLocation.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (loyaltyPoints != null) __obj.updateDynamic("loyaltyPoints")(loyaltyPoints.asInstanceOf[js.Any])
    if (pickup != null) __obj.updateDynamic("pickup")(pickup.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (salePrice != null) __obj.updateDynamic("salePrice")(salePrice.asInstanceOf[js.Any])
    if (salePriceEffectiveDate != null) __obj.updateDynamic("salePriceEffectiveDate")(salePriceEffectiveDate.asInstanceOf[js.Any])
    if (sellOnGoogleQuantity != null) __obj.updateDynamic("sellOnGoogleQuantity")(sellOnGoogleQuantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inventory]
  }
}

