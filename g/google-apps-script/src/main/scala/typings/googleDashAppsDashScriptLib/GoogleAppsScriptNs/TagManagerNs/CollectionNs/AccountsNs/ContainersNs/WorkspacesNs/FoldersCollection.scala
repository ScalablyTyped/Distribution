package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersNs.WorkspacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoldersCollection extends js.Object {
  // Creates a GTM Folder.
  def create(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Folder,
    parent: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Folder = js.native
  // List all entities in a GTM Folder.
  def entities(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.FolderEntities = js.native
  // List all entities in a GTM Folder.
  def entities(path: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.FolderEntities = js.native
  // Gets a GTM Folder.
  def get(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Folder = js.native
  // Lists all GTM Folders of a Container.
  def list(parent: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListFoldersResponse = js.native
  // Lists all GTM Folders of a Container.
  def list(parent: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListFoldersResponse = js.native
  // Moves entities to a GTM Folder.
  def move_entities_to_folder(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Folder,
    path: java.lang.String
  ): scala.Unit = js.native
  // Moves entities to a GTM Folder.
  def move_entities_to_folder(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Folder,
    path: java.lang.String,
    optionalArgs: js.Object
  ): scala.Unit = js.native
  // Deletes a GTM Folder.
  def remove(path: java.lang.String): scala.Unit = js.native
  // Reverts changes to a GTM Folder in a GTM Workspace.
  def revert(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.RevertFolderResponse = js.native
  // Reverts changes to a GTM Folder in a GTM Workspace.
  def revert(path: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.RevertFolderResponse = js.native
  // Updates a GTM Folder.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Folder,
    path: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Folder = js.native
  // Updates a GTM Folder.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Folder,
    path: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Folder = js.native
}

