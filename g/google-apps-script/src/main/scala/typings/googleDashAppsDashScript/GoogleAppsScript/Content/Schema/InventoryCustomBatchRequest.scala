package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryCustomBatchRequest extends js.Object {
  var entries: js.UndefOr[js.Array[InventoryCustomBatchRequestEntry]] = js.undefined
}

object InventoryCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[InventoryCustomBatchRequestEntry] = null): InventoryCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    __obj.asInstanceOf[InventoryCustomBatchRequest]
  }
}

