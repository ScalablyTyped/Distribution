package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryItemsCollection extends js.Object {
  // Gets one inventory item by ID.
  def get(profileId: java.lang.String, projectId: java.lang.String, id: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.InventoryItem = js.native
  // Retrieves a list of inventory items, possibly filtered. This method supports paging.
  def list(profileId: java.lang.String, projectId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.InventoryItemsListResponse = js.native
  // Retrieves a list of inventory items, possibly filtered. This method supports paging.
  def list(profileId: java.lang.String, projectId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.InventoryItemsListResponse = js.native
}

