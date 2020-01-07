package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$PosCustomBatchRequestEntry extends js.Object {
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * The inventory to submit. Set this only if the method is inventory.
    */
  var inventory: js.UndefOr[Schema$PosInventory] = js.native
  /**
    * The ID of the POS data provider.
    */
  var merchantId: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  /**
    * The sale information to submit. Set this only if the method is sale.
    */
  var sale: js.UndefOr[Schema$PosSale] = js.native
  /**
    * The store information to submit. Set this only if the method is insert.
    */
  var store: js.UndefOr[Schema$PosStore] = js.native
  /**
    * The store code. Set this only if the method is delete or get.
    */
  var storeCode: js.UndefOr[String] = js.native
  /**
    * The ID of the account for which to get/submit data.
    */
  var targetMerchantId: js.UndefOr[String] = js.native
}

object Schema$PosCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    inventory: Schema$PosInventory = null,
    merchantId: String = null,
    method: String = null,
    sale: Schema$PosSale = null,
    store: Schema$PosStore = null,
    storeCode: String = null,
    targetMerchantId: String = null
  ): Schema$PosCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (inventory != null) __obj.updateDynamic("inventory")(inventory.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (sale != null) __obj.updateDynamic("sale")(sale.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (storeCode != null) __obj.updateDynamic("storeCode")(storeCode.asInstanceOf[js.Any])
    if (targetMerchantId != null) __obj.updateDynamic("targetMerchantId")(targetMerchantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PosCustomBatchRequestEntry]
  }
}

