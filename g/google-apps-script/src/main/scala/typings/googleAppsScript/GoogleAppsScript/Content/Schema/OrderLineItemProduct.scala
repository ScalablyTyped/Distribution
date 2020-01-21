package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLineItemProduct extends js.Object {
  var brand: js.UndefOr[String] = js.undefined
  var channel: js.UndefOr[String] = js.undefined
  var condition: js.UndefOr[String] = js.undefined
  var contentLanguage: js.UndefOr[String] = js.undefined
  var fees: js.UndefOr[js.Array[OrderLineItemProductFee]] = js.undefined
  var gtin: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var imageLink: js.UndefOr[String] = js.undefined
  var itemGroupId: js.UndefOr[String] = js.undefined
  var mpn: js.UndefOr[String] = js.undefined
  var offerId: js.UndefOr[String] = js.undefined
  var price: js.UndefOr[Price] = js.undefined
  var shownImage: js.UndefOr[String] = js.undefined
  var targetCountry: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var variantAttributes: js.UndefOr[js.Array[OrderLineItemProductVariantAttribute]] = js.undefined
}

object OrderLineItemProduct {
  @scala.inline
  def apply(
    brand: String = null,
    channel: String = null,
    condition: String = null,
    contentLanguage: String = null,
    fees: js.Array[OrderLineItemProductFee] = null,
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
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[OrderLineItemProduct]
  }
}

