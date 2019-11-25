package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryCustomBatchRequestEntry extends js.Object {
  var batchId: js.UndefOr[Double] = js.undefined
  var inventory: js.UndefOr[Inventory] = js.undefined
  var merchantId: js.UndefOr[String] = js.undefined
  var productId: js.UndefOr[String] = js.undefined
  var storeCode: js.UndefOr[String] = js.undefined
}

object InventoryCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    inventory: Inventory = null,
    merchantId: String = null,
    productId: String = null,
    storeCode: String = null
  ): InventoryCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (inventory != null) __obj.updateDynamic("inventory")(inventory.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (storeCode != null) __obj.updateDynamic("storeCode")(storeCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryCustomBatchRequestEntry]
  }
}

