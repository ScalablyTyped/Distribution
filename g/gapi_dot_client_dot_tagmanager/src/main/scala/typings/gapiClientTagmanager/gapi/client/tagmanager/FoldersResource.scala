package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTagmanager.anon.Alt
import typings.gapiClientTagmanager.anon.Fields
import typings.gapiClientTagmanager.anon.Fingerprint
import typings.gapiClientTagmanager.anon.Key
import typings.gapiClientTagmanager.anon.PageToken
import typings.gapiClientTagmanager.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldersResource extends js.Object {
  /** Creates a GTM Folder. */
  def create(request: Alt): Request[Folder]
  /** Deletes a GTM Folder. */
  def delete(request: Fields): Request[Unit]
  /** List all entities in a GTM Folder. */
  def entities(request: PageToken): Request[FolderEntities]
  /** Gets a GTM Folder. */
  def get(request: Fields): Request[Folder]
  /** Lists all GTM Folders of a Container. */
  def list(request: Key): Request[ListFoldersResponse]
  /** Moves entities to a GTM Folder. */
  def move_entities_to_folder(request: PrettyPrint): Request[Unit]
  /** Reverts changes to a GTM Folder in a GTM Workspace. */
  def revert(request: Fingerprint): Request[RevertFolderResponse]
  /** Updates a GTM Folder. */
  def update(request: Fingerprint): Request[Folder]
}

object FoldersResource {
  @scala.inline
  def apply(
    create: Alt => Request[Folder],
    delete: Fields => Request[Unit],
    entities: PageToken => Request[FolderEntities],
    get: Fields => Request[Folder],
    list: Key => Request[ListFoldersResponse],
    move_entities_to_folder: PrettyPrint => Request[Unit],
    revert: Fingerprint => Request[RevertFolderResponse],
    update: Fingerprint => Request[Folder]
  ): FoldersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), entities = js.Any.fromFunction1(entities), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), move_entities_to_folder = js.Any.fromFunction1(move_entities_to_folder), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[FoldersResource]
  }
}

