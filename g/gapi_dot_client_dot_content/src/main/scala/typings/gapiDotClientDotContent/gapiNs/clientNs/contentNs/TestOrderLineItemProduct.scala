package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOrderLineItemProduct extends js.Object {
  /** Brand of the item. */
  var brand: js.UndefOr[String] = js.undefined
  /** The item's channel. */
  var channel: js.UndefOr[String] = js.undefined
  /** Condition or state of the item. */
  var condition: js.UndefOr[String] = js.undefined
  /** The two-letter ISO 639-1 language code for the item. */
  var contentLanguage: js.UndefOr[String] = js.undefined
  /** Global Trade Item Number (GTIN) of the item. Optional. */
  var gtin: js.UndefOr[String] = js.undefined
  /** URL of an image of the item. */
  var imageLink: js.UndefOr[String] = js.undefined
  /** Shared identifier for all variants of the same product. Optional. */
  var itemGroupId: js.UndefOr[String] = js.undefined
  /** Manufacturer Part Number (MPN) of the item. Optional. */
  var mpn: js.UndefOr[String] = js.undefined
  /** An identifier of the item. */
  var offerId: js.UndefOr[String] = js.undefined
  /** The price for the product. */
  var price: js.UndefOr[Price] = js.undefined
  /** The CLDR territory code of the target country of the product. */
  var targetCountry: js.UndefOr[String] = js.undefined
  /** The title of the product. */
  var title: js.UndefOr[String] = js.undefined
  /** Variant attributes for the item. Optional. */
  var variantAttributes: js.UndefOr[js.Array[OrderLineItemProductVariantAttribute]] = js.undefined
}

object TestOrderLineItemProduct {
  @scala.inline
  def apply(
    brand: String = null,
    channel: String = null,
    condition: String = null,
    contentLanguage: String = null,
    gtin: String = null,
    imageLink: String = null,
    itemGroupId: String = null,
    mpn: String = null,
    offerId: String = null,
    price: Price = null,
    targetCountry: String = null,
    title: String = null,
    variantAttributes: js.Array[OrderLineItemProductVariantAttribute] = null
  ): TestOrderLineItemProduct = {
    val __obj = js.Dynamic.literal()
    if (brand != null) __obj.updateDynamic("brand")(brand)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage)
    if (gtin != null) __obj.updateDynamic("gtin")(gtin)
    if (imageLink != null) __obj.updateDynamic("imageLink")(imageLink)
    if (itemGroupId != null) __obj.updateDynamic("itemGroupId")(itemGroupId)
    if (mpn != null) __obj.updateDynamic("mpn")(mpn)
    if (offerId != null) __obj.updateDynamic("offerId")(offerId)
    if (price != null) __obj.updateDynamic("price")(price)
    if (targetCountry != null) __obj.updateDynamic("targetCountry")(targetCountry)
    if (title != null) __obj.updateDynamic("title")(title)
    if (variantAttributes != null) __obj.updateDynamic("variantAttributes")(variantAttributes)
    __obj.asInstanceOf[TestOrderLineItemProduct]
  }
}

