package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryItemsListResponse extends js.Object {
  var inventoryItems: js.UndefOr[js.Array[InventoryItem]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object InventoryItemsListResponse {
  @scala.inline
  def apply(inventoryItems: js.Array[InventoryItem] = null, kind: String = null, nextPageToken: String = null): InventoryItemsListResponse = {
    val __obj = js.Dynamic.literal()
    if (inventoryItems != null) __obj.updateDynamic("inventoryItems")(inventoryItems)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[InventoryItemsListResponse]
  }
}

