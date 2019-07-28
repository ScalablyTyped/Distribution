package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOrderLineItemProduct extends js.Object {
  var brand: js.UndefOr[String] = js.undefined
  var channel: js.UndefOr[String] = js.undefined
  var condition: js.UndefOr[String] = js.undefined
  var contentLanguage: js.UndefOr[String] = js.undefined
  var gtin: js.UndefOr[String] = js.undefined
  var imageLink: js.UndefOr[String] = js.undefined
  var itemGroupId: js.UndefOr[String] = js.undefined
  var mpn: js.UndefOr[String] = js.undefined
  var offerId: js.UndefOr[String] = js.undefined
  var price: js.UndefOr[Price] = js.undefined
  var targetCountry: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
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

