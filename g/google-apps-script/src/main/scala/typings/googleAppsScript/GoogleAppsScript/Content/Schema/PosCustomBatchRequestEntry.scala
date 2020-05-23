package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PosCustomBatchRequestEntry extends js.Object {
  var batchId: js.UndefOr[Double] = js.undefined
  var inventory: js.UndefOr[PosInventory] = js.undefined
  var merchantId: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var sale: js.UndefOr[PosSale] = js.undefined
  var store: js.UndefOr[PosStore] = js.undefined
  var storeCode: js.UndefOr[String] = js.undefined
  var targetMerchantId: js.UndefOr[String] = js.undefined
}

object PosCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: js.UndefOr[Double] = js.undefined,
    inventory: PosInventory = null,
    merchantId: String = null,
    method: String = null,
    sale: PosSale = null,
    store: PosStore = null,
    storeCode: String = null,
    targetMerchantId: String = null
  ): PosCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchId)) __obj.updateDynamic("batchId")(batchId.get.asInstanceOf[js.Any])
    if (inventory != null) __obj.updateDynamic("inventory")(inventory.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (sale != null) __obj.updateDynamic("sale")(sale.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (storeCode != null) __obj.updateDynamic("storeCode")(storeCode.asInstanceOf[js.Any])
    if (targetMerchantId != null) __obj.updateDynamic("targetMerchantId")(targetMerchantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PosCustomBatchRequestEntry]
  }
}

