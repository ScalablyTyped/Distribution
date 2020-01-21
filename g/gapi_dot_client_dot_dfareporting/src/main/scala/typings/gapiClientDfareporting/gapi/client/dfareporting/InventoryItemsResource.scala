package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAltFieldsId
import typings.gapiClientDfareporting.AnonAltFieldsIdsInPlan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryItemsResource extends js.Object {
  /** Gets one inventory item by ID. */
  def get(request: AnonAltFieldsId): Request_[InventoryItem]
  /** Retrieves a list of inventory items, possibly filtered. This method supports paging. */
  def list(request: AnonAltFieldsIdsInPlan): Request_[InventoryItemsListResponse]
}

object InventoryItemsResource {
  @scala.inline
  def apply(
    get: AnonAltFieldsId => Request_[InventoryItem],
    list: AnonAltFieldsIdsInPlan => Request_[InventoryItemsListResponse]
  ): InventoryItemsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[InventoryItemsResource]
  }
}

