package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inventory extends js.Object {
  /** The availability of the product. */
  var availability: js.UndefOr[String] = js.undefined
  /** Number and amount of installments to pay for an item. Brazil only. */
  var installment: js.UndefOr[Installment] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#inventory". */
  var kind: js.UndefOr[String] = js.undefined
  /** Loyalty points that users receive after purchasing the item. Japan only. */
  var loyaltyPoints: js.UndefOr[LoyaltyPoints] = js.undefined
  /**
    * Store pickup information. Only supported for local inventory. Not setting pickup means "don't update" while setting it to the empty value ({} in JSON)
    * means "delete". Otherwise, pickupMethod and pickupSla must be set together, unless pickupMethod is "not supported".
    */
  var pickup: js.UndefOr[InventoryPickup] = js.undefined
  /** The price of the product. */
  var price: js.UndefOr[Price] = js.undefined
  /** The quantity of the product. Must be equal to or greater than zero. Supported only for local products. */
  var quantity: js.UndefOr[Double] = js.undefined
  /** The sale price of the product. Mandatory if sale_price_effective_date is defined. */
  var salePrice: js.UndefOr[Price] = js.undefined
  /** A date range represented by a pair of ISO 8601 dates separated by a space, comma, or slash. Both dates might be specified as 'null' if undecided. */
  var salePriceEffectiveDate: js.UndefOr[String] = js.undefined
  /** The quantity of the product that is reserved for sell-on-google ads. Supported only for online products. */
  var sellOnGoogleQuantity: js.UndefOr[Double] = js.undefined
}

object Inventory {
  @scala.inline
  def apply(
    availability: String = null,
    installment: Installment = null,
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
    if (installment != null) __obj.updateDynamic("installment")(installment.asInstanceOf[js.Any])
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

