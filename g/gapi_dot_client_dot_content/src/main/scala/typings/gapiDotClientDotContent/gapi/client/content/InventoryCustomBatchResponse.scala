package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryCustomBatchResponse extends js.Object {
  /** The result of the execution of the batch requests. */
  var entries: js.UndefOr[js.Array[InventoryCustomBatchResponseEntry]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#inventoryCustomBatchResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object InventoryCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[InventoryCustomBatchResponseEntry] = null, kind: String = null): InventoryCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[InventoryCustomBatchResponse]
  }
}

