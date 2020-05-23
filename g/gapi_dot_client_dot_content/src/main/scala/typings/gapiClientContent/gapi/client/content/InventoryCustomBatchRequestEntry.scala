package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryCustomBatchRequestEntry extends js.Object {
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.undefined
  /** Price and availability of the product. */
  var inventory: js.UndefOr[Inventory] = js.undefined
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[String] = js.undefined
  /** The ID of the product for which to update price and availability. */
  var productId: js.UndefOr[String] = js.undefined
  /** The code of the store for which to update price and availability. Use online to update price and availability of an online product. */
  var storeCode: js.UndefOr[String] = js.undefined
}

object InventoryCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: js.UndefOr[Double] = js.undefined,
    inventory: Inventory = null,
    merchantId: String = null,
    productId: String = null,
    storeCode: String = null
  ): InventoryCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchId)) __obj.updateDynamic("batchId")(batchId.get.asInstanceOf[js.Any])
    if (inventory != null) __obj.updateDynamic("inventory")(inventory.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (storeCode != null) __obj.updateDynamic("storeCode")(storeCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryCustomBatchRequestEntry]
  }
}

