package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLineItemProduct extends js.Object {
  /** Brand of the item. */
  var brand: js.UndefOr[String] = js.undefined
  /** The item's channel (online or local). */
  var channel: js.UndefOr[String] = js.undefined
  /** Condition or state of the item. */
  var condition: js.UndefOr[String] = js.undefined
  /** The two-letter ISO 639-1 language code for the item. */
  var contentLanguage: js.UndefOr[String] = js.undefined
  /** Global Trade Item Number (GTIN) of the item. */
  var gtin: js.UndefOr[String] = js.undefined
  /** The REST id of the product. */
  var id: js.UndefOr[String] = js.undefined
  /** URL of an image of the item. */
  var imageLink: js.UndefOr[String] = js.undefined
  /** Shared identifier for all variants of the same product. */
  var itemGroupId: js.UndefOr[String] = js.undefined
  /** Manufacturer Part Number (MPN) of the item. */
  var mpn: js.UndefOr[String] = js.undefined
  /** An identifier of the item. */
  var offerId: js.UndefOr[String] = js.undefined
  /** Price of the item. */
  var price: js.UndefOr[Price] = js.undefined
  /** URL to the cached image shown to the user when order was placed. */
  var shownImage: js.UndefOr[String] = js.undefined
  /** The CLDR territory code of the target country of the product. */
  var targetCountry: js.UndefOr[String] = js.undefined
  /** The title of the product. */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Variant attributes for the item. These are dimensions of the product, such as color, gender, material, pattern, and size. You can find a comprehensive
    * list of variant attributes here.
    */
  var variantAttributes: js.UndefOr[js.Array[OrderLineItemProductVariantAttribute]] = js.undefined
}

object OrderLineItemProduct {
  @scala.inline
  def apply(
    brand: String = null,
    channel: String = null,
    condition: String = null,
    contentLanguage: String = null,
    gtin: String = null,
    id: String = null,
    imageLink: String = null,
    itemGroupId: String = null,
    mpn: String = null,
    offerId: String = null,
    price: Price = null,
    shownImage: String = null,
    targetCountry: String = null,
    title: String = null,
    variantAttributes: js.Array[OrderLineItemProductVariantAttribute] = null
  ): OrderLineItemProduct = {
    val __obj = js.Dynamic.literal()
    if (brand != null) __obj.updateDynamic("brand")(brand)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage)
    if (gtin != null) __obj.updateDynamic("gtin")(gtin)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageLink != null) __obj.updateDynamic("imageLink")(imageLink)
    if (itemGroupId != null) __obj.updateDynamic("itemGroupId")(itemGroupId)
    if (mpn != null) __obj.updateDynamic("mpn")(mpn)
    if (offerId != null) __obj.updateDynamic("offerId")(offerId)
    if (price != null) __obj.updateDynamic("price")(price)
    if (shownImage != null) __obj.updateDynamic("shownImage")(shownImage)
    if (targetCountry != null) __obj.updateDynamic("targetCountry")(targetCountry)
    if (title != null) __obj.updateDynamic("title")(title)
    if (variantAttributes != null) __obj.updateDynamic("variantAttributes")(variantAttributes)
    __obj.asInstanceOf[OrderLineItemProduct]
  }
}

