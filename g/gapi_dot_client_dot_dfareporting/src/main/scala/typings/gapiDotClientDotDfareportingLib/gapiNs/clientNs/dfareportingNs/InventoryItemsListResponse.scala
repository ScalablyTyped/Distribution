package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryItemsListResponse extends js.Object {
  /** Inventory item collection */
  var inventoryItems: js.UndefOr[js.Array[InventoryItem]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#inventoryItemsListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object InventoryItemsListResponse {
  @scala.inline
  def apply(
    inventoryItems: js.Array[InventoryItem] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): InventoryItemsListResponse = {
    val __obj = js.Dynamic.literal()
    if (inventoryItems != null) __obj.updateDynamic("inventoryItems")(inventoryItems)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[InventoryItemsListResponse]
  }
}

