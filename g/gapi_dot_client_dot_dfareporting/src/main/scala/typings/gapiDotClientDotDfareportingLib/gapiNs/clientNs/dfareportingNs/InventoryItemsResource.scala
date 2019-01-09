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

