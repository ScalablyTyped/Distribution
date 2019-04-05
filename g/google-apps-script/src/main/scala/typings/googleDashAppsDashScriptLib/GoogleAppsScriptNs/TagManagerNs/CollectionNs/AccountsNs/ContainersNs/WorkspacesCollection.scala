package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspacesCollection extends js.Object {
  var Built_in_variables: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs.Built_in_variablesCollection
  ] = js.native
  var Folders: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs.FoldersCollection
  ] = js.native
  var Tags: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs.TagsCollection
  ] = js.native
  var Triggers: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs.TriggersCollection
  ] = js.native
  var Variables: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs.VariablesCollection
  ] = js.native
  var Zones: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs.ZonesCollection
  ] = js.native
  // Creates a Workspace.
  def create(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Workspace,
    parent: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Workspace = js.native
  // Creates a Container Version from the entities present in the workspace, deletes the workspace, and sets the base container version to the newly created version.
  def create_version(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.CreateContainerVersionRequestVersionOptions,
    path: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.CreateContainerVersionResponse = js.native
  // Gets a Workspace.
  def get(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Workspace = js.native
  // Finds conflicting and modified entities in the workspace.
  def getStatus(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.GetWorkspaceStatusResponse = js.native
  // Lists all Workspaces that belong to a GTM Container.
  def list(parent: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListWorkspacesResponse = js.native
  // Lists all Workspaces that belong to a GTM Container.
  def list(parent: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListWorkspacesResponse = js.native
  // Quick previews a workspace by creating a fake container version from all entities in the provided workspace.
  def quick_preview(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.QuickPreviewResponse = js.native
  // Deletes a Workspace.
  def remove(path: java.lang.String): scala.Unit = js.native
  // Resolves a merge conflict for a workspace entity by updating it to the resolved entity passed in the request.
  def resolve_conflict(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Entity,
    path: java.lang.String
  ): scala.Unit = js.native
  // Resolves a merge conflict for a workspace entity by updating it to the resolved entity passed in the request.
  def resolve_conflict(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Entity,
    path: java.lang.String,
    optionalArgs: js.Object
  ): scala.Unit = js.native
  // Syncs a workspace to the latest container version by updating all unmodified workspace entities and displaying conflicts for modified entities.
  def sync(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.SyncWorkspaceResponse = js.native
  // Updates a Workspace.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Workspace,
    path: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Workspace = js.native
  // Updates a Workspace.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Workspace,
    path: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Workspace = js.native
}

