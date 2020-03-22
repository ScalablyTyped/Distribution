package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonId
import typings.gapiClientDfareporting.AnonInPlan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryItemsResource extends js.Object {
  /** Gets one inventory item by ID. */
  def get(request: AnonId): Request_[InventoryItem]
  /** Retrieves a list of inventory items, possibly filtered. This method supports paging. */
  def list(request: AnonInPlan): Request_[InventoryItemsListResponse]
}

object InventoryItemsResource {
  @scala.inline
  def apply(get: AnonId => Request_[InventoryItem], list: AnonInPlan => Request_[InventoryItemsListResponse]): InventoryItemsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[InventoryItemsResource]
  }
}

