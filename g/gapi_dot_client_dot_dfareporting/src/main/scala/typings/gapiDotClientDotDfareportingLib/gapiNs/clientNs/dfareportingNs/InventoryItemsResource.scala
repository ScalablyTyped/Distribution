package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryItemsResource extends js.Object {
  /** Gets one inventory item by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsId): gapiDotClientLib.gapiNs.clientNs.Request[InventoryItem]
  /** Retrieves a list of inventory items, possibly filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsIdsInPlan): gapiDotClientLib.gapiNs.clientNs.Request[InventoryItemsListResponse]
}

object InventoryItemsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotDfareportingLib.Anon_AltFieldsId => gapiDotClientLib.gapiNs.clientNs.Request[InventoryItem],
    list: gapiDotClientDotDfareportingLib.Anon_AltFieldsIdsInPlan => gapiDotClientLib.gapiNs.clientNs.Request[InventoryItemsListResponse]
  ): InventoryItemsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[InventoryItemsResource]
  }
}

