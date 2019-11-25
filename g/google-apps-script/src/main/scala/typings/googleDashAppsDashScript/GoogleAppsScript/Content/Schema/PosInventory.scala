package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PosInventory extends js.Object {
  var contentLanguage: js.UndefOr[String] = js.undefined
  var gtin: js.UndefOr[String] = js.undefined
  var itemId: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var price: js.UndefOr[Price] = js.undefined
  var quantity: js.UndefOr[String] = js.undefined
  var storeCode: js.UndefOr[String] = js.undefined
  var targetCountry: js.UndefOr[String] = js.undefined
  var timestamp: js.UndefOr[String] = js.undefined
}

object PosInventory {
  @scala.inline
  def apply(
    contentLanguage: String = null,
    gtin: String = null,
    itemId: String = null,
    kind: String = null,
    price: Price = null,
    quantity: String = null,
    storeCode: String = null,
    targetCountry: String = null,
    timestamp: String = null
  ): PosInventory = {
    val __obj = js.Dynamic.literal()
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (gtin != null) __obj.updateDynamic("gtin")(gtin.asInstanceOf[js.Any])
    if (itemId != null) __obj.updateDynamic("itemId")(itemId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (storeCode != null) __obj.updateDynamic("storeCode")(storeCode.asInstanceOf[js.Any])
    if (targetCountry != null) __obj.updateDynamic("targetCountry")(targetCountry.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PosInventory]
  }
}

