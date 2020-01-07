package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inventory item List Response
  */
@js.native
trait Schema$InventoryItemsListResponse extends js.Object {
  /**
    * Inventory item collection
    */
  var inventoryItems: js.UndefOr[js.Array[Schema$InventoryItem]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#inventoryItemsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$InventoryItemsListResponse {
  @scala.inline
  def apply(
    inventoryItems: js.Array[Schema$InventoryItem] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$InventoryItemsListResponse = {
    val __obj = js.Dynamic.literal()
    if (inventoryItems != null) __obj.updateDynamic("inventoryItems")(inventoryItems.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InventoryItemsListResponse]
  }
}

