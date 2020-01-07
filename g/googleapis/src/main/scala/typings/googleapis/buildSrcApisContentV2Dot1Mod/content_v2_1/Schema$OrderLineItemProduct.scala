package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderLineItemProduct extends js.Object {
  /**
    * Brand of the item.
    */
  var brand: js.UndefOr[String] = js.native
  /**
    * Condition or state of the item.
    */
  var condition: js.UndefOr[String] = js.native
  /**
    * The two-letter ISO 639-1 language code for the item.
    */
  var contentLanguage: js.UndefOr[String] = js.native
  /**
    * Associated fees at order creation time.
    */
  var fees: js.UndefOr[js.Array[Schema$OrderLineItemProductFee]] = js.native
  /**
    * Global Trade Item Number (GTIN) of the item.
    */
  var gtin: js.UndefOr[String] = js.native
  /**
    * The REST ID of the product.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * URL of an image of the item.
    */
  var imageLink: js.UndefOr[String] = js.native
  /**
    * Shared identifier for all variants of the same product.
    */
  var itemGroupId: js.UndefOr[String] = js.native
  /**
    * Manufacturer Part Number (MPN) of the item.
    */
  var mpn: js.UndefOr[String] = js.native
  /**
    * An identifier of the item.
    */
  var offerId: js.UndefOr[String] = js.native
  /**
    * Price of the item.
    */
  var price: js.UndefOr[Schema$Price] = js.native
  /**
    * URL to the cached image shown to the user when order was placed.
    */
  var shownImage: js.UndefOr[String] = js.native
  /**
    * The CLDR territory code of the target country of the product.
    */
  var targetCountry: js.UndefOr[String] = js.native
  /**
    * The title of the product.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Variant attributes for the item. These are dimensions of the product,
    * such as color, gender, material, pattern, and size. You can find a
    * comprehensive list of variant attributes here.
    */
  var variantAttributes: js.UndefOr[js.Array[Schema$OrderLineItemProductVariantAttribute]] = js.native
}

object Schema$OrderLineItemProduct {
  @scala.inline
  def apply(
    brand: String = null,
    condition: String = null,
    contentLanguage: String = null,
    fees: js.Array[Schema$OrderLineItemProductFee] = null,
    gtin: String = null,
    id: String = null,
    imageLink: String = null,
    itemGroupId: String = null,
    mpn: String = null,
    offerId: String = null,
    price: Schema$Price = null,
    shownImage: String = null,
    targetCountry: String = null,
    title: String = null,
    variantAttributes: js.Array[Schema$OrderLineItemProductVariantAttribute] = null
  ): Schema$OrderLineItemProduct = {
    val __obj = js.Dynamic.literal()
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (fees != null) __obj.updateDynamic("fees")(fees.asInstanceOf[js.Any])
    if (gtin != null) __obj.updateDynamic("gtin")(gtin.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imageLink != null) __obj.updateDynamic("imageLink")(imageLink.asInstanceOf[js.Any])
    if (itemGroupId != null) __obj.updateDynamic("itemGroupId")(itemGroupId.asInstanceOf[js.Any])
    if (mpn != null) __obj.updateDynamic("mpn")(mpn.asInstanceOf[js.Any])
    if (offerId != null) __obj.updateDynamic("offerId")(offerId.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (shownImage != null) __obj.updateDynamic("shownImage")(shownImage.asInstanceOf[js.Any])
    if (targetCountry != null) __obj.updateDynamic("targetCountry")(targetCountry.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (variantAttributes != null) __obj.updateDynamic("variantAttributes")(variantAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderLineItemProduct]
  }
}

