package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inventory extends js.Object {
  var availability: js.UndefOr[java.lang.String] = js.undefined
  var customLabel0: js.UndefOr[java.lang.String] = js.undefined
  var customLabel1: js.UndefOr[java.lang.String] = js.undefined
  var customLabel2: js.UndefOr[java.lang.String] = js.undefined
  var customLabel3: js.UndefOr[java.lang.String] = js.undefined
  var customLabel4: js.UndefOr[java.lang.String] = js.undefined
  var installment: js.UndefOr[Installment] = js.undefined
  var instoreProductLocation: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var loyaltyPoints: js.UndefOr[LoyaltyPoints] = js.undefined
  var pickup: js.UndefOr[InventoryPickup] = js.undefined
  var price: js.UndefOr[Price] = js.undefined
  var quantity: js.UndefOr[scala.Double] = js.undefined
  var salePrice: js.UndefOr[Price] = js.undefined
  var salePriceEffectiveDate: js.UndefOr[java.lang.String] = js.undefined
  var sellOnGoogleQuantity: js.UndefOr[scala.Double] = js.undefined
}

object Inventory {
  @scala.inline
  def apply(
    availability: java.lang.String = null,
    customLabel0: java.lang.String = null,
    customLabel1: java.lang.String = null,
    customLabel2: java.lang.String = null,
    customLabel3: java.lang.String = null,
    customLabel4: java.lang.String = null,
    installment: Installment = null,
    instoreProductLocation: java.lang.String = null,
    kind: java.lang.String = null,
    loyaltyPoints: LoyaltyPoints = null,
    pickup: InventoryPickup = null,
    price: Price = null,
    quantity: scala.Int | scala.Double = null,
    salePrice: Price = null,
    salePriceEffectiveDate: java.lang.String = null,
    sellOnGoogleQuantity: scala.Int | scala.Double = null
  ): Inventory = {
    val __obj = js.Dynamic.literal()
    if (availability != null) __obj.updateDynamic("availability")(availability)
    if (customLabel0 != null) __obj.updateDynamic("customLabel0")(customLabel0)
    if (customLabel1 != null) __obj.updateDynamic("customLabel1")(customLabel1)
    if (customLabel2 != null) __obj.updateDynamic("customLabel2")(customLabel2)
    if (customLabel3 != null) __obj.updateDynamic("customLabel3")(customLabel3)
    if (customLabel4 != null) __obj.updateDynamic("customLabel4")(customLabel4)
    if (installment != null) __obj.updateDynamic("installment")(installment)
    if (instoreProductLocation != null) __obj.updateDynamic("instoreProductLocation")(instoreProductLocation)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (loyaltyPoints != null) __obj.updateDynamic("loyaltyPoints")(loyaltyPoints)
    if (pickup != null) __obj.updateDynamic("pickup")(pickup)
    if (price != null) __obj.updateDynamic("price")(price)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (salePrice != null) __obj.updateDynamic("salePrice")(salePrice)
    if (salePriceEffectiveDate != null) __obj.updateDynamic("salePriceEffectiveDate")(salePriceEffectiveDate)
    if (sellOnGoogleQuantity != null) __obj.updateDynamic("sellOnGoogleQuantity")(sellOnGoogleQuantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inventory]
  }
}

