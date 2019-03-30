package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggersCollection extends js.Object {
  // Creates a GTM Trigger.
  def create(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Trigger,
    parent: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Trigger = js.native
  // Gets a GTM Trigger.
  def get(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Trigger = js.native
  // Lists all GTM Triggers of a Container.
  def list(parent: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.ListTriggersResponse = js.native
  // Lists all GTM Triggers of a Container.
  def list(parent: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.ListTriggersResponse = js.native
  // Deletes a GTM Trigger.
  def remove(path: java.lang.String): scala.Unit = js.native
  // Reverts changes to a GTM Trigger in a GTM Workspace.
  def revert(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.RevertTriggerResponse = js.native
  // Reverts changes to a GTM Trigger in a GTM Workspace.
  def revert(path: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.RevertTriggerResponse = js.native
  // Updates a GTM Trigger.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Trigger,
    path: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Trigger = js.native
  // Updates a GTM Trigger.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Trigger,
    path: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Trigger = js.native
}

