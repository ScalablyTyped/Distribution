package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

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
    batchId: Int | Double = null,
    inventory: PosInventory = null,
    merchantId: String = null,
    method: String = null,
    sale: PosSale = null,
    store: PosStore = null,
    storeCode: String = null,
    targetMerchantId: String = null
  ): PosCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (inventory != null) __obj.updateDynamic("inventory")(inventory)
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    if (method != null) __obj.updateDynamic("method")(method)
    if (sale != null) __obj.updateDynamic("sale")(sale)
    if (store != null) __obj.updateDynamic("store")(store)
    if (storeCode != null) __obj.updateDynamic("storeCode")(storeCode)
    if (targetMerchantId != null) __obj.updateDynamic("targetMerchantId")(targetMerchantId)
    __obj.asInstanceOf[PosCustomBatchRequestEntry]
  }
}

