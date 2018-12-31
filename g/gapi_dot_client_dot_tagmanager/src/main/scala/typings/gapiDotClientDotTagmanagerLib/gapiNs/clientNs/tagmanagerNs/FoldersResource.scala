package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldersResource extends js.Object {
  /** Creates a GTM Folder. */
  def create(request: gapiDotClientDotTagmanagerLib.Anon_Parent): gapiDotClientLib.gapiNs.clientNs.Request[Folder]
  /** Deletes a GTM Folder. */
  def delete(request: gapiDotClientDotTagmanagerLib.Anon_Path): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** List all entities in a GTM Folder. */
  def entities(request: gapiDotClientDotTagmanagerLib.Anon_PathPrettyPrintPageToken): gapiDotClientLib.gapiNs.clientNs.Request[FolderEntities]
  /** Gets a GTM Folder. */
  def get(request: gapiDotClientDotTagmanagerLib.Anon_Path): gapiDotClientLib.gapiNs.clientNs.Request[Folder]
  /** Lists all GTM Folders of a Container. */
  def list(request: gapiDotClientDotTagmanagerLib.Anon_ParentPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ListFoldersResponse]
  /** Moves entities to a GTM Folder. */
  def move_entities_to_folder(request: gapiDotClientDotTagmanagerLib.Anon_PathPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Reverts changes to a GTM Folder in a GTM Workspace. */
  def revert(request: gapiDotClientDotTagmanagerLib.Anon_Fingerprint): gapiDotClientLib.gapiNs.clientNs.Request[RevertFolderResponse]
  /** Updates a GTM Folder. */
  def update(request: gapiDotClientDotTagmanagerLib.Anon_Fingerprint): gapiDotClientLib.gapiNs.clientNs.Request[Folder]
}

