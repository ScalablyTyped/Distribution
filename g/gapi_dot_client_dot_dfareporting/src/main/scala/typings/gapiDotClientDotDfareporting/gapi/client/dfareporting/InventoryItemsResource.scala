package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsId
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsIdsInPlan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryItemsResource extends js.Object {
  /** Gets one inventory item by ID. */
  def get(request: Anon_AltFieldsId): Request[InventoryItem]
  /** Retrieves a list of inventory items, possibly filtered. This method supports paging. */
  def list(request: Anon_AltFieldsIdsInPlan): Request[InventoryItemsListResponse]
}

object InventoryItemsResource {
  @scala.inline
  def apply(
    get: Anon_AltFieldsId => Request[InventoryItem],
    list: Anon_AltFieldsIdsInPlan => Request[InventoryItemsListResponse]
  ): InventoryItemsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[InventoryItemsResource]
  }
}

