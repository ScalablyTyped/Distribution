package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InventoryCustomBatchResponse extends js.Object {
  /**
    * The result of the execution of the batch requests.
    */
  var entries: js.UndefOr[js.Array[Schema$InventoryCustomBatchResponseEntry]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#inventoryCustomBatchResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$InventoryCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[Schema$InventoryCustomBatchResponseEntry] = null, kind: String = null): Schema$InventoryCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InventoryCustomBatchResponse]
  }
}

