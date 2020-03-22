package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTagmanager.AnonAlt
import typings.gapiClientTagmanager.AnonFields
import typings.gapiClientTagmanager.AnonFingerprint
import typings.gapiClientTagmanager.AnonKey
import typings.gapiClientTagmanager.AnonPageToken
import typings.gapiClientTagmanager.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldersResource extends js.Object {
  /** Creates a GTM Folder. */
  def create(request: AnonAlt): Request_[Folder]
  /** Deletes a GTM Folder. */
  def delete(request: AnonFields): Request_[Unit]
  /** List all entities in a GTM Folder. */
  def entities(request: AnonPageToken): Request_[FolderEntities]
  /** Gets a GTM Folder. */
  def get(request: AnonFields): Request_[Folder]
  /** Lists all GTM Folders of a Container. */
  def list(request: AnonKey): Request_[ListFoldersResponse]
  /** Moves entities to a GTM Folder. */
  def move_entities_to_folder(request: AnonPrettyPrint): Request_[Unit]
  /** Reverts changes to a GTM Folder in a GTM Workspace. */
  def revert(request: AnonFingerprint): Request_[RevertFolderResponse]
  /** Updates a GTM Folder. */
  def update(request: AnonFingerprint): Request_[Folder]
}

object FoldersResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Folder],
    delete: AnonFields => Request_[Unit],
    entities: AnonPageToken => Request_[FolderEntities],
    get: AnonFields => Request_[Folder],
    list: AnonKey => Request_[ListFoldersResponse],
    move_entities_to_folder: AnonPrettyPrint => Request_[Unit],
    revert: AnonFingerprint => Request_[RevertFolderResponse],
    update: AnonFingerprint => Request_[Folder]
  ): FoldersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), entities = js.Any.fromFunction1(entities), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), move_entities_to_folder = js.Any.fromFunction1(move_entities_to_folder), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[FoldersResource]
  }
}

