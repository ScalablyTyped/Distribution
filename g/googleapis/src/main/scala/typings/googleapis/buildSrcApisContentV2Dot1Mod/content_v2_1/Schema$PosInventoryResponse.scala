package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PosInventoryResponse extends js.Object {
  /**
    * The two-letter ISO 639-1 language code for the item.
    */
  var contentLanguage: js.UndefOr[String] = js.native
  /**
    * Global Trade Item Number.
    */
  var gtin: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the item.
    */
  var itemId: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#posInventoryResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The current price of the item.
    */
  var price: js.UndefOr[Schema$Price] = js.native
  /**
    * The available quantity of the item.
    */
  var quantity: js.UndefOr[String] = js.native
  /**
    * The identifier of the merchant&#39;s store. Either a storeCode inserted
    * via the API or the code of the store in Google My Business.
    */
  var storeCode: js.UndefOr[String] = js.native
  /**
    * The CLDR territory code for the item.
    */
  var targetCountry: js.UndefOr[String] = js.native
  /**
    * The inventory timestamp, in ISO 8601 format.
    */
  var timestamp: js.UndefOr[String] = js.native
}

object Schema$PosInventoryResponse {
  @scala.inline
  def apply(
    contentLanguage: String = null,
    gtin: String = null,
    itemId: String = null,
    kind: String = null,
    price: Schema$Price = null,
    quantity: String = null,
    storeCode: String = null,
    targetCountry: String = null,
    timestamp: String = null
  ): Schema$PosInventoryResponse = {
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
    __obj.asInstanceOf[Schema$PosInventoryResponse]
  }
}

