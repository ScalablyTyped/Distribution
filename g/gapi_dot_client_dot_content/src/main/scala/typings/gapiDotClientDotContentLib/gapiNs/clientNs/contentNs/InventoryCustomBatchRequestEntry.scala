package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryCustomBatchRequestEntry extends js.Object {
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[scala.Double] = js.undefined
  /** Price and availability of the product. */
  var inventory: js.UndefOr[Inventory] = js.undefined
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the product for which to update price and availability. */
  var productId: js.UndefOr[java.lang.String] = js.undefined
  /** The code of the store for which to update price and availability. Use online to update price and availability of an online product. */
  var storeCode: js.UndefOr[java.lang.String] = js.undefined
}

object InventoryCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: scala.Int | scala.Double = null,
    inventory: Inventory = null,
    merchantId: java.lang.String = null,
    productId: java.lang.String = null,
    storeCode: java.lang.String = null
  ): InventoryCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (inventory != null) __obj.updateDynamic("inventory")(inventory)
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (storeCode != null) __obj.updateDynamic("storeCode")(storeCode)
    __obj.asInstanceOf[InventoryCustomBatchRequestEntry]
  }
}

