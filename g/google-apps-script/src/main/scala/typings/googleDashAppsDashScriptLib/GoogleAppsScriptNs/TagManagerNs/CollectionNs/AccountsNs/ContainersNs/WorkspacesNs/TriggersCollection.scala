package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggersCollection extends js.Object {
  // Creates a GTM Trigger.
  def create(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Trigger,
    parent: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Trigger = js.native
  // Gets a GTM Trigger.
  def get(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Trigger = js.native
  // Lists all GTM Triggers of a Container.
  def list(parent: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListTriggersResponse = js.native
  // Lists all GTM Triggers of a Container.
  def list(parent: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListTriggersResponse = js.native
  // Deletes a GTM Trigger.
  def remove(path: java.lang.String): scala.Unit = js.native
  // Reverts changes to a GTM Trigger in a GTM Workspace.
  def revert(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.RevertTriggerResponse = js.native
  // Reverts changes to a GTM Trigger in a GTM Workspace.
  def revert(path: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.RevertTriggerResponse = js.native
  // Updates a GTM Trigger.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Trigger,
    path: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Trigger = js.native
  // Updates a GTM Trigger.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Trigger,
    path: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Trigger = js.native
}

