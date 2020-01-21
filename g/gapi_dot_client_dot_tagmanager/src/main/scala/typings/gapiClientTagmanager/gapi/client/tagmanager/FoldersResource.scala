package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTagmanager.AnonAlt
import typings.gapiClientTagmanager.AnonAltFields
import typings.gapiClientTagmanager.AnonAltFieldsFingerprint
import typings.gapiClientTagmanager.AnonAltFieldsKey
import typings.gapiClientTagmanager.AnonAltFieldsKeyOauthtokenPageToken
import typings.gapiClientTagmanager.AnonAltFieldsKeyOauthtokenPathPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldersResource extends js.Object {
  /** Creates a GTM Folder. */
  def create(request: AnonAlt): Request_[Folder]
  /** Deletes a GTM Folder. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** List all entities in a GTM Folder. */
  def entities(request: AnonAltFieldsKeyOauthtokenPageToken): Request_[FolderEntities]
  /** Gets a GTM Folder. */
  def get(request: AnonAltFields): Request_[Folder]
  /** Lists all GTM Folders of a Container. */
  def list(request: AnonAltFieldsKey): Request_[ListFoldersResponse]
  /** Moves entities to a GTM Folder. */
  def move_entities_to_folder(request: AnonAltFieldsKeyOauthtokenPathPrettyPrint): Request_[Unit]
  /** Reverts changes to a GTM Folder in a GTM Workspace. */
  def revert(request: AnonAltFieldsFingerprint): Request_[RevertFolderResponse]
  /** Updates a GTM Folder. */
  def update(request: AnonAltFieldsFingerprint): Request_[Folder]
}

object FoldersResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Folder],
    delete: AnonAltFields => Request_[Unit],
    entities: AnonAltFieldsKeyOauthtokenPageToken => Request_[FolderEntities],
    get: AnonAltFields => Request_[Folder],
    list: AnonAltFieldsKey => Request_[ListFoldersResponse],
    move_entities_to_folder: AnonAltFieldsKeyOauthtokenPathPrettyPrint => Request_[Unit],
    revert: AnonAltFieldsFingerprint => Request_[RevertFolderResponse],
    update: AnonAltFieldsFingerprint => Request_[Folder]
  ): FoldersResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), entities = js.Any.fromFunction1(entities), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), move_entities_to_folder = js.Any.fromFunction1(move_entities_to_folder), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[FoldersResource]
  }
}

