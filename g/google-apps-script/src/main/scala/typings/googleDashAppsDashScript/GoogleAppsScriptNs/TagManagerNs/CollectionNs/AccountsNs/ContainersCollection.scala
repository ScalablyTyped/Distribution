package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.EnvironmentsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.Version_headersCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.VersionsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Container
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListContainersResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainersCollection extends js.Object {
  var Environments: js.UndefOr[EnvironmentsCollection] = js.native
  var Version_headers: js.UndefOr[Version_headersCollection] = js.native
  var Versions: js.UndefOr[VersionsCollection] = js.native
  var Workspaces: js.UndefOr[WorkspacesCollection] = js.native
  // Creates a Container.
  def create(resource: Container, parent: String): Container = js.native
  // Gets a Container.
  def get(path: String): Container = js.native
  // Lists all Containers that belongs to a GTM Account.
  def list(parent: String): ListContainersResponse = js.native
  // Lists all Containers that belongs to a GTM Account.
  def list(parent: String, optionalArgs: js.Object): ListContainersResponse = js.native
  // Deletes a Container.
  def remove(path: String): Unit = js.native
  // Updates a Container.
  def update(resource: Container, path: String): Container = js.native
  // Updates a Container.
  def update(resource: Container, path: String, optionalArgs: js.Object): Container = js.native
}

