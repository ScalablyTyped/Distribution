package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTagmanager.anon.Alt
import typings.gapiClientTagmanager.anon.Fields
import typings.gapiClientTagmanager.anon.Fingerprint
import typings.gapiClientTagmanager.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagsResource extends js.Object {
  /** Creates a GTM Tag. */
  def create(request: Alt): Request[Tag] = js.native
  /** Deletes a GTM Tag. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets a GTM Tag. */
  def get(request: Fields): Request[Tag] = js.native
  /** Lists all GTM Tags of a Container. */
  def list(request: Key): Request[ListTagsResponse] = js.native
  /** Reverts changes to a GTM Tag in a GTM Workspace. */
  def revert(request: Fingerprint): Request[RevertTagResponse] = js.native
  /** Updates a GTM Tag. */
  def update(request: Fingerprint): Request[Tag] = js.native
}

object TagsResource {
  @scala.inline
  def apply(
    create: Alt => Request[Tag],
    delete: Fields => Request[Unit],
    get: Fields => Request[Tag],
    list: Key => Request[ListTagsResponse],
    revert: Fingerprint => Request[RevertTagResponse],
    update: Fingerprint => Request[Tag]
  ): TagsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TagsResource]
  }
  @scala.inline
  implicit class TagsResourceOps[Self <: TagsResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Alt => Request[Tag]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Fields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Fields => Request[Tag]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[ListTagsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setRevert(value: Fingerprint => Request[RevertTagResponse]): Self = this.set("revert", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Fingerprint => Request[Tag]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

