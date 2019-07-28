package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListTriggersResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.RevertTriggerResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Trigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggersCollection extends js.Object {
  // Creates a GTM Trigger.
  def create(resource: Trigger, parent: String): Trigger = js.native
  // Gets a GTM Trigger.
  def get(path: String): Trigger = js.native
  // Lists all GTM Triggers of a Container.
  def list(parent: String): ListTriggersResponse = js.native
  // Lists all GTM Triggers of a Container.
  def list(parent: String, optionalArgs: js.Object): ListTriggersResponse = js.native
  // Deletes a GTM Trigger.
  def remove(path: String): Unit = js.native
  // Reverts changes to a GTM Trigger in a GTM Workspace.
  def revert(path: String): RevertTriggerResponse = js.native
  // Reverts changes to a GTM Trigger in a GTM Workspace.
  def revert(path: String, optionalArgs: js.Object): RevertTriggerResponse = js.native
  // Updates a GTM Trigger.
  def update(resource: Trigger, path: String): Trigger = js.native
  // Updates a GTM Trigger.
  def update(resource: Trigger, path: String, optionalArgs: js.Object): Trigger = js.native
}

