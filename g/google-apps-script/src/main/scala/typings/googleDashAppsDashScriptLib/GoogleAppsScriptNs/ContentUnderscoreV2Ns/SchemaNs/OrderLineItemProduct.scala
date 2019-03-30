package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLineItemProduct extends js.Object {
  var brand: js.UndefOr[java.lang.String] = js.undefined
  var channel: js.UndefOr[java.lang.String] = js.undefined
  var condition: js.UndefOr[java.lang.String] = js.undefined
  var contentLanguage: js.UndefOr[java.lang.String] = js.undefined
  var fees: js.UndefOr[js.Array[OrderLineItemProductFee]] = js.undefined
  var gtin: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var imageLink: js.UndefOr[java.lang.String] = js.undefined
  var itemGroupId: js.UndefOr[java.lang.String] = js.undefined
  var mpn: js.UndefOr[java.lang.String] = js.undefined
  var offerId: js.UndefOr[java.lang.String] = js.undefined
  var price: js.UndefOr[Price] = js.undefined
  var shownImage: js.UndefOr[java.lang.String] = js.undefined
  var targetCountry: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var variantAttributes: js.UndefOr[js.Array[OrderLineItemProductVariantAttribute]] = js.undefined
}

object OrderLineItemProduct {
  @scala.inline
  def apply(
    brand: java.lang.String = null,
    channel: java.lang.String = null,
    condition: java.lang.String = null,
    contentLanguage: java.lang.String = null,
    fees: js.Array[OrderLineItemProductFee] = null,
    gtin: java.lang.String = null,
    id: java.lang.String = null,
    imageLink: java.lang.String = null,
    itemGroupId: java.lang.String = null,
    mpn: java.lang.String = null,
    offerId: java.lang.String = null,
    price: Price = null,
    shownImage: java.lang.String = null,
    targetCountry: java.lang.String = null,
    title: java.lang.String = null,
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

