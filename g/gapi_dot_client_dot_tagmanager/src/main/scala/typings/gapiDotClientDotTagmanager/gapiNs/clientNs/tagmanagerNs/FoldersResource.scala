package typings.gapiDotClientDotTagmanager.gapiNs.clientNs.tagmanagerNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotTagmanager.Anon_Alt
import typings.gapiDotClientDotTagmanager.Anon_AltFields
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsFingerprint
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsKey
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsKeyOauthtokenPageToken
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsKeyOauthtokenPathPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldersResource extends js.Object {
  /** Creates a GTM Folder. */
  def create(request: Anon_Alt): Request[Folder]
  /** Deletes a GTM Folder. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** List all entities in a GTM Folder. */
  def entities(request: Anon_AltFieldsKeyOauthtokenPageToken): Request[FolderEntities]
  /** Gets a GTM Folder. */
  def get(request: Anon_AltFields): Request[Folder]
  /** Lists all GTM Folders of a Container. */
  def list(request: Anon_AltFieldsKey): Request[ListFoldersResponse]
  /** Moves entities to a GTM Folder. */
  def move_entities_to_folder(request: Anon_AltFieldsKeyOauthtokenPathPrettyPrint): Request[Unit]
  /** Reverts changes to a GTM Folder in a GTM Workspace. */
  def revert(request: Anon_AltFieldsFingerprint): Request[RevertFolderResponse]
  /** Updates a GTM Folder. */
  def update(request: Anon_AltFieldsFingerprint): Request[Folder]
}

object FoldersResource {
  @scala.inline
  def apply(
    create: Anon_Alt => Request[Folder],
    delete: Anon_AltFields => Request[Unit],
    entities: Anon_AltFieldsKeyOauthtokenPageToken => Request[FolderEntities],
    get: Anon_AltFields => Request[Folder],
    list: Anon_AltFieldsKey => Request[ListFoldersResponse],
    move_entities_to_folder: Anon_AltFieldsKeyOauthtokenPathPrettyPrint => Request[Unit],
    revert: Anon_AltFieldsFingerprint => Request[RevertFolderResponse],
    update: Anon_AltFieldsFingerprint => Request[Folder]
  ): FoldersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), entities = js.Any.fromFunction1(entities), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), move_entities_to_folder = js.Any.fromFunction1(move_entities_to_folder), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[FoldersResource]
  }
}

