package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListVariablesResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.RevertVariableResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariablesCollection extends js.Object {
  // Creates a GTM Variable.
  def create(resource: Variable, parent: String): Variable = js.native
  // Gets a GTM Variable.
  def get(path: String): Variable = js.native
  // Lists all GTM Variables of a Container.
  def list(parent: String): ListVariablesResponse = js.native
  // Lists all GTM Variables of a Container.
  def list(parent: String, optionalArgs: js.Object): ListVariablesResponse = js.native
  // Deletes a GTM Variable.
  def remove(path: String): Unit = js.native
  // Reverts changes to a GTM Variable in a GTM Workspace.
  def revert(path: String): RevertVariableResponse = js.native
  // Reverts changes to a GTM Variable in a GTM Workspace.
  def revert(path: String, optionalArgs: js.Object): RevertVariableResponse = js.native
  // Updates a GTM Variable.
  def update(resource: Variable, path: String): Variable = js.native
  // Updates a GTM Variable.
  def update(resource: Variable, path: String, optionalArgs: js.Object): Variable = js.native
}

