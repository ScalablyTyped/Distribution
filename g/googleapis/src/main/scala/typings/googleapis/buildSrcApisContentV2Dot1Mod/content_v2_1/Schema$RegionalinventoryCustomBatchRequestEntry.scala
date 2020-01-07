package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch regional inventory request.
  */
@js.native
trait Schema$RegionalinventoryCustomBatchRequestEntry extends js.Object {
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  /**
    * The ID of the product for which to update price and availability.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * Price and availability of the product.
    */
  var regionalInventory: js.UndefOr[Schema$RegionalInventory] = js.native
}

object Schema$RegionalinventoryCustomBatchRequestEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    merchantId: String = null,
    method: String = null,
    productId: String = null,
    regionalInventory: Schema$RegionalInventory = null
  ): Schema$RegionalinventoryCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (regionalInventory != null) __obj.updateDynamic("regionalInventory")(regionalInventory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegionalinventoryCustomBatchRequestEntry]
  }
}

