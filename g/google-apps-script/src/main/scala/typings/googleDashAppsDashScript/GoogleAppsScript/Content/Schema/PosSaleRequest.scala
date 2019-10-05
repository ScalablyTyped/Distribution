package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PosSaleRequest extends js.Object {
  var contentLanguage: js.UndefOr[String] = js.undefined
  var gtin: js.UndefOr[String] = js.undefined
  var itemId: js.UndefOr[String] = js.undefined
  var price: js.UndefOr[Price] = js.undefined
  var quantity: js.UndefOr[String] = js.undefined
  var saleId: js.UndefOr[String] = js.undefined
  var storeCode: js.UndefOr[String] = js.undefined
  var targetCountry: js.UndefOr[String] = js.undefined
  var timestamp: js.UndefOr[String] = js.undefined
}

object PosSaleRequest {
  @scala.inline
  def apply(
    contentLanguage: String = null,
    gtin: String = null,
    itemId: String = null,
    price: Price = null,
    quantity: String = null,
    saleId: String = null,
    storeCode: String = null,
    targetCountry: String = null,
    timestamp: String = null
  ): PosSaleRequest = {
    val __obj = js.Dynamic.literal()
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage)
    if (gtin != null) __obj.updateDynamic("gtin")(gtin)
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (price != null) __obj.updateDynamic("price")(price)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity)
    if (saleId != null) __obj.updateDynamic("saleId")(saleId)
    if (storeCode != null) __obj.updateDynamic("storeCode")(storeCode)
    if (targetCountry != null) __obj.updateDynamic("targetCountry")(targetCountry)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[PosSaleRequest]
  }
}

