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
    get: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsId, 
      gapiDotClientLib.gapiNs.clientNs.Request[InventoryItem]
    ],
    list: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsIdsInPlan, 
      gapiDotClientLib.gapiNs.clientNs.Request[InventoryItemsListResponse]
    ]
  ): InventoryItemsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[InventoryItemsResource]
  }
}

