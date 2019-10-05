package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

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
    if (brand != null) __obj.updateDynamic("brand")(brand)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage)
    if (fees != null) __obj.updateDynamic("fees")(fees)
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

