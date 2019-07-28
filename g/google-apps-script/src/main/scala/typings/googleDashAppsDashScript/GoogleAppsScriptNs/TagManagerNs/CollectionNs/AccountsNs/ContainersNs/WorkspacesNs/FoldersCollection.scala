package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Folder
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.FolderEntities
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListFoldersResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.RevertFolderResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldersCollection extends js.Object {
  // Creates a GTM Folder.
  def create(resource: Folder, parent: String): Folder = js.native
  // List all entities in a GTM Folder.
  def entities(path: String): FolderEntities = js.native
  // List all entities in a GTM Folder.
  def entities(path: String, optionalArgs: js.Object): FolderEntities = js.native
  // Gets a GTM Folder.
  def get(path: String): Folder = js.native
  // Lists all GTM Folders of a Container.
  def list(parent: String): ListFoldersResponse = js.native
  // Lists all GTM Folders of a Container.
  def list(parent: String, optionalArgs: js.Object): ListFoldersResponse = js.native
  // Moves entities to a GTM Folder.
  def move_entities_to_folder(resource: Folder, path: String): Unit = js.native
  // Moves entities to a GTM Folder.
  def move_entities_to_folder(resource: Folder, path: String, optionalArgs: js.Object): Unit = js.native
  // Deletes a GTM Folder.
  def remove(path: String): Unit = js.native
  // Reverts changes to a GTM Folder in a GTM Workspace.
  def revert(path: String): RevertFolderResponse = js.native
  // Reverts changes to a GTM Folder in a GTM Workspace.
  def revert(path: String, optionalArgs: js.Object): RevertFolderResponse = js.native
  // Updates a GTM Folder.
  def update(resource: Folder, path: String): Folder = js.native
  // Updates a GTM Folder.
  def update(resource: Folder, path: String, optionalArgs: js.Object): Folder = js.native
}

