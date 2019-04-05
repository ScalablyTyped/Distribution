package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PosCustomBatchRequestEntry extends js.Object {
  var batchId: js.UndefOr[scala.Double] = js.undefined
  var inventory: js.UndefOr[PosInventory] = js.undefined
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var sale: js.UndefOr[PosSale] = js.undefined
  var store: js.UndefOr[PosStore] = js.undefined
  var storeCode: js.UndefOr[java.lang.String] = js.undefined
  var targetMerchantId: js.UndefOr[java.lang.String] = js.undefined
}

object PosCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: scala.Int | scala.Double = null,
    inventory: PosInventory = null,
    merchantId: java.lang.String = null,
    method: java.lang.String = null,
    sale: PosSale = null,
    store: PosStore = null,
    storeCode: java.lang.String = null,
    targetMerchantId: java.lang.String = null
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

