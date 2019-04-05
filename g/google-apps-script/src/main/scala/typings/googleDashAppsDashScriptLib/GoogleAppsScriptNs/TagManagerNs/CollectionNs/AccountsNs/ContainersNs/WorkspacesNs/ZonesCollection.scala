package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZonesCollection extends js.Object {
  // Creates a GTM Zone.
  def create(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Zone,
    parent: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Zone = js.native
  // Gets a GTM Zone.
  def get(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Zone = js.native
  // Lists all GTM Zones of a GTM container workspace.
  def list(parent: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListZonesResponse = js.native
  // Lists all GTM Zones of a GTM container workspace.
  def list(parent: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListZonesResponse = js.native
  // Deletes a GTM Zone.
  def remove(path: java.lang.String): scala.Unit = js.native
  // Reverts changes to a GTM Zone in a GTM Workspace.
  def revert(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.RevertZoneResponse = js.native
  // Reverts changes to a GTM Zone in a GTM Workspace.
  def revert(path: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.RevertZoneResponse = js.native
  // Updates a GTM Zone.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Zone,
    path: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Zone = js.native
  // Updates a GTM Zone.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Zone,
    path: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Zone = js.native
}

