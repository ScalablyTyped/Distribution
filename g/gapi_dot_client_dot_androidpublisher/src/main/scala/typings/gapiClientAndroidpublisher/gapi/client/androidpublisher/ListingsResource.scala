package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.EditId
import typings.gapiClientAndroidpublisher.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListingsResource extends js.Object {
  /** Deletes the specified localized store listing from an edit. */
  def delete(request: Key): Request[Unit] = js.native
  /** Deletes all localized listings from an edit. */
  def deleteall(request: EditId): Request[Unit] = js.native
  /** Fetches information about a localized store listing. */
  def get(request: Key): Request[Listing] = js.native
  /** Returns all of the localized store listings attached to this edit. */
  def list(request: EditId): Request[ListingsListResponse] = js.native
  /** Creates or updates a localized store listing. This method supports patch semantics. */
  def patch(request: Key): Request[Listing] = js.native
  /** Creates or updates a localized store listing. */
  def update(request: Key): Request[Listing] = js.native
}

object ListingsResource {
  @scala.inline
  def apply(
    delete: Key => Request[Unit],
    deleteall: EditId => Request[Unit],
    get: Key => Request[Listing],
    list: EditId => Request[ListingsListResponse],
    patch: Key => Request[Listing],
    update: Key => Request[Listing]
  ): ListingsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deleteall = js.Any.fromFunction1(deleteall), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ListingsResource]
  }
  @scala.inline
  implicit class ListingsResourceOps[Self <: ListingsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: Key => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteall(value: EditId => Request[Unit]): Self = this.set("deleteall", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Key => Request[Listing]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: EditId => Request[ListingsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Key => Request[Listing]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[Listing]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

