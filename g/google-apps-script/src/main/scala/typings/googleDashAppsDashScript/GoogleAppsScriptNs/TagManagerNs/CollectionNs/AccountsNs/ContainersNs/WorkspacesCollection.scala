package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs.Built_in_variablesCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs.FoldersCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs.TagsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs.TriggersCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs.VariablesCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs.ZonesCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.CreateContainerVersionRequestVersionOptions
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.CreateContainerVersionResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Entity
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.GetWorkspaceStatusResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListWorkspacesResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.QuickPreviewResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.SyncWorkspaceResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Workspace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspacesCollection extends js.Object {
  var Built_in_variables: js.UndefOr[Built_in_variablesCollection] = js.native
  var Folders: js.UndefOr[FoldersCollection] = js.native
  var Tags: js.UndefOr[TagsCollection] = js.native
  var Triggers: js.UndefOr[TriggersCollection] = js.native
  var Variables: js.UndefOr[VariablesCollection] = js.native
  var Zones: js.UndefOr[ZonesCollection] = js.native
  // Creates a Workspace.
  def create(resource: Workspace, parent: String): Workspace = js.native
  // Creates a Container Version from the entities present in the workspace, deletes the workspace, and sets the base container version to the newly created version.
  def create_version(resource: CreateContainerVersionRequestVersionOptions, path: String): CreateContainerVersionResponse = js.native
  // Gets a Workspace.
  def get(path: String): Workspace = js.native
  // Finds conflicting and modified entities in the workspace.
  def getStatus(path: String): GetWorkspaceStatusResponse = js.native
  // Lists all Workspaces that belong to a GTM Container.
  def list(parent: String): ListWorkspacesResponse = js.native
  // Lists all Workspaces that belong to a GTM Container.
  def list(parent: String, optionalArgs: js.Object): ListWorkspacesResponse = js.native
  // Quick previews a workspace by creating a fake container version from all entities in the provided workspace.
  def quick_preview(path: String): QuickPreviewResponse = js.native
  // Deletes a Workspace.
  def remove(path: String): Unit = js.native
  // Resolves a merge conflict for a workspace entity by updating it to the resolved entity passed in the request.
  def resolve_conflict(resource: Entity, path: String): Unit = js.native
  // Resolves a merge conflict for a workspace entity by updating it to the resolved entity passed in the request.
  def resolve_conflict(resource: Entity, path: String, optionalArgs: js.Object): Unit = js.native
  // Syncs a workspace to the latest container version by updating all unmodified workspace entities and displaying conflicts for modified entities.
  def sync(path: String): SyncWorkspaceResponse = js.native
  // Updates a Workspace.
  def update(resource: Workspace, path: String): Workspace = js.native
  // Updates a Workspace.
  def update(resource: Workspace, path: String, optionalArgs: js.Object): Workspace = js.native
}

