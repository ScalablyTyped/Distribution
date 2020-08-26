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

@js.native
trait FoldersResource extends js.Object {
  /** Creates a GTM Folder. */
  def create(request: Alt): Request[Folder] = js.native
  /** Deletes a GTM Folder. */
  def delete(request: Fields): Request[Unit] = js.native
  /** List all entities in a GTM Folder. */
  def entities(request: PageToken): Request[FolderEntities] = js.native
  /** Gets a GTM Folder. */
  def get(request: Fields): Request[Folder] = js.native
  /** Lists all GTM Folders of a Container. */
  def list(request: Key): Request[ListFoldersResponse] = js.native
  /** Moves entities to a GTM Folder. */
  def move_entities_to_folder(request: PrettyPrint): Request[Unit] = js.native
  /** Reverts changes to a GTM Folder in a GTM Workspace. */
  def revert(request: Fingerprint): Request[RevertFolderResponse] = js.native
  /** Updates a GTM Folder. */
  def update(request: Fingerprint): Request[Folder] = js.native
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
  @scala.inline
  implicit class FoldersResourceOps[Self <: FoldersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: Alt => Request[Folder]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Fields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setEntities(value: PageToken => Request[FolderEntities]): Self = this.set("entities", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Fields => Request[Folder]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[ListFoldersResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setMove_entities_to_folder(value: PrettyPrint => Request[Unit]): Self = this.set("move_entities_to_folder", js.Any.fromFunction1(value))
    @scala.inline
    def setRevert(value: Fingerprint => Request[RevertFolderResponse]): Self = this.set("revert", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Fingerprint => Request[Folder]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

