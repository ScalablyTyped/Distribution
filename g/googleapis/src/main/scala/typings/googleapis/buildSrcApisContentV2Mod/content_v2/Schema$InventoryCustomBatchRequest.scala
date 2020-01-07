package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InventoryCustomBatchRequest extends js.Object {
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[Schema$InventoryCustomBatchRequestEntry]] = js.native
}

object Schema$InventoryCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[Schema$InventoryCustomBatchRequestEntry] = null): Schema$InventoryCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InventoryCustomBatchRequest]
  }
}

