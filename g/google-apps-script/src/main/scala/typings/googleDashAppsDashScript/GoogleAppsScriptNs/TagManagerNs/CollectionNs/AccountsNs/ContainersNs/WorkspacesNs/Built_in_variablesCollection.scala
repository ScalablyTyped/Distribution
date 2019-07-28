package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.CreateBuiltInVariableResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListEnabledBuiltInVariablesResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.RevertBuiltInVariableResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Built_in_variablesCollection extends js.Object {
  // Creates one or more GTM Built-In Variables.
  def create(parent: String): CreateBuiltInVariableResponse = js.native
  // Creates one or more GTM Built-In Variables.
  def create(parent: String, optionalArgs: js.Object): CreateBuiltInVariableResponse = js.native
  // Lists all the enabled Built-In Variables of a GTM Container.
  def list(parent: String): ListEnabledBuiltInVariablesResponse = js.native
  // Lists all the enabled Built-In Variables of a GTM Container.
  def list(parent: String, optionalArgs: js.Object): ListEnabledBuiltInVariablesResponse = js.native
  // Deletes one or more GTM Built-In Variables.
  def remove(path: String): Unit = js.native
  // Deletes one or more GTM Built-In Variables.
  def remove(path: String, optionalArgs: js.Object): Unit = js.native
  // Reverts changes to a GTM Built-In Variables in a GTM Workspace.
  def revert(path: String): RevertBuiltInVariableResponse = js.native
  // Reverts changes to a GTM Built-In Variables in a GTM Workspace.
  def revert(path: String, optionalArgs: js.Object): RevertBuiltInVariableResponse = js.native
}

