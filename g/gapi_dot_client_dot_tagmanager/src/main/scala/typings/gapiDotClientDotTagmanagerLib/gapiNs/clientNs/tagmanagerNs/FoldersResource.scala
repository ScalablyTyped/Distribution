package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldersResource extends js.Object {
  /** Creates a GTM Folder. */
  def create(request: gapiDotClientDotTagmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Folder]
  /** Deletes a GTM Folder. */
  def delete(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** List all entities in a GTM Folder. */
  def entities(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKeyOauthtokenPageToken): gapiDotClientLib.gapiNs.clientNs.Request[FolderEntities]
  /** Gets a GTM Folder. */
  def get(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Folder]
  /** Lists all GTM Folders of a Container. */
  def list(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[ListFoldersResponse]
  /** Moves entities to a GTM Folder. */
  def move_entities_to_folder(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKeyOauthtokenPathPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Reverts changes to a GTM Folder in a GTM Workspace. */
  def revert(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint): gapiDotClientLib.gapiNs.clientNs.Request[RevertFolderResponse]
  /** Updates a GTM Folder. */
  def update(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint): gapiDotClientLib.gapiNs.clientNs.Request[Folder]
}

object FoldersResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotTagmanagerLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Folder],
    delete: gapiDotClientDotTagmanagerLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    entities: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKeyOauthtokenPageToken => gapiDotClientLib.gapiNs.clientNs.Request[FolderEntities],
    get: gapiDotClientDotTagmanagerLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Folder],
    list: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[ListFoldersResponse],
    move_entities_to_folder: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKeyOauthtokenPathPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    revert: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint => gapiDotClientLib.gapiNs.clientNs.Request[RevertFolderResponse],
    update: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint => gapiDotClientLib.gapiNs.clientNs.Request[Folder]
  ): FoldersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), entities = js.Any.fromFunction1(entities), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), move_entities_to_folder = js.Any.fromFunction1(move_entities_to_folder), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[FoldersResource]
  }
}

