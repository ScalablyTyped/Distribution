package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.CollectionNs.AccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainersCollection extends js.Object {
  var Environments: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.CollectionNs.AccountsNs.ContainersNs.EnvironmentsCollection
  ] = js.native
  var Version_headers: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.CollectionNs.AccountsNs.ContainersNs.Version_headersCollection
  ] = js.native
  var Versions: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.CollectionNs.AccountsNs.ContainersNs.VersionsCollection
  ] = js.native
  var Workspaces: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.CollectionNs.AccountsNs.ContainersNs.WorkspacesCollection
  ] = js.native
  // Creates a Container.
  def create(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Container,
    parent: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Container = js.native
  // Gets a Container.
  def get(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Container = js.native
  // Lists all Containers that belongs to a GTM Account.
  def list(parent: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.ListContainersResponse = js.native
  // Lists all Containers that belongs to a GTM Account.
  def list(parent: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.ListContainersResponse = js.native
  // Deletes a Container.
  def remove(path: java.lang.String): scala.Unit = js.native
  // Updates a Container.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Container,
    path: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Container = js.native
  // Updates a Container.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Container,
    path: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs.Container = js.native
}

