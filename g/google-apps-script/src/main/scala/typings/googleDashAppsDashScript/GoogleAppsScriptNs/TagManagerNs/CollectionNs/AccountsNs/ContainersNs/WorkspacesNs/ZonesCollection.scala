package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListZonesResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.RevertZoneResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Zone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZonesCollection extends js.Object {
  // Creates a GTM Zone.
  def create(resource: Zone, parent: String): Zone = js.native
  // Gets a GTM Zone.
  def get(path: String): Zone = js.native
  // Lists all GTM Zones of a GTM container workspace.
  def list(parent: String): ListZonesResponse = js.native
  // Lists all GTM Zones of a GTM container workspace.
  def list(parent: String, optionalArgs: js.Object): ListZonesResponse = js.native
  // Deletes a GTM Zone.
  def remove(path: String): Unit = js.native
  // Reverts changes to a GTM Zone in a GTM Workspace.
  def revert(path: String): RevertZoneResponse = js.native
  // Reverts changes to a GTM Zone in a GTM Workspace.
  def revert(path: String, optionalArgs: js.Object): RevertZoneResponse = js.native
  // Updates a GTM Zone.
  def update(resource: Zone, path: String): Zone = js.native
  // Updates a GTM Zone.
  def update(resource: Zone, path: String, optionalArgs: js.Object): Zone = js.native
}

