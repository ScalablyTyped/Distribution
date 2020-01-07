package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch inventory request.
  */
@js.native
trait Schema$InventoryCustomBatchRequestEntry extends js.Object {
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * Price and availability of the product.
    */
  var inventory: js.UndefOr[Schema$Inventory] = js.native
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
  /**
    * The ID of the product for which to update price and availability.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The code of the store for which to update price and availability. Use
    * online to update price and availability of an online product.
    */
  var storeCode: js.UndefOr[String] = js.native
}

object Schema$InventoryCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    inventory: Schema$Inventory = null,
    merchantId: String = null,
    productId: String = null,
    storeCode: String = null
  ): Schema$InventoryCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (inventory != null) __obj.updateDynamic("inventory")(inventory.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (storeCode != null) __obj.updateDynamic("storeCode")(storeCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InventoryCustomBatchRequestEntry]
  }
}

