package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PosInventoryRequest extends js.Object {
  var contentLanguage: js.UndefOr[java.lang.String] = js.undefined
  var gtin: js.UndefOr[java.lang.String] = js.undefined
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  var price: js.UndefOr[Price] = js.undefined
  var quantity: js.UndefOr[java.lang.String] = js.undefined
  var storeCode: js.UndefOr[java.lang.String] = js.undefined
  var targetCountry: js.UndefOr[java.lang.String] = js.undefined
  var timestamp: js.UndefOr[java.lang.String] = js.undefined
}

object PosInventoryRequest {
  @scala.inline
  def apply(
    contentLanguage: java.lang.String = null,
    gtin: java.lang.String = null,
    itemId: java.lang.String = null,
    price: Price = null,
    quantity: java.lang.String = null,
    storeCode: java.lang.String = null,
    targetCountry: java.lang.String = null,
    timestamp: java.lang.String = null
  ): PosInventoryRequest = {
    val __obj = js.Dynamic.literal()
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage)
    if (gtin != null) __obj.updateDynamic("gtin")(gtin)
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (price != null) __obj.updateDynamic("price")(price)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity)
    if (storeCode != null) __obj.updateDynamic("storeCode")(storeCode)
    if (targetCountry != null) __obj.updateDynamic("targetCountry")(targetCountry)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[PosInventoryRequest]
  }
}

