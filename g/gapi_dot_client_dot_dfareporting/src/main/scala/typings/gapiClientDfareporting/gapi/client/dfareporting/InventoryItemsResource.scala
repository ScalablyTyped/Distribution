package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Id
import typings.gapiClientDfareporting.anon.InPlan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryItemsResource extends js.Object {
  /** Gets one inventory item by ID. */
  def get(request: Id): Request[InventoryItem]
  /** Retrieves a list of inventory items, possibly filtered. This method supports paging. */
  def list(request: InPlan): Request[InventoryItemsListResponse]
}

object InventoryItemsResource {
  @scala.inline
  def apply(get: Id => Request[InventoryItem], list: InPlan => Request[InventoryItemsListResponse]): InventoryItemsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[InventoryItemsResource]
  }
}

