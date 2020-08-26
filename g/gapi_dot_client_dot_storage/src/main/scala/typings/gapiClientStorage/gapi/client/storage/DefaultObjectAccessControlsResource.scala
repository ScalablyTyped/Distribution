package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request
import typings.gapiClientStorage.anon.Alt
import typings.gapiClientStorage.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultObjectAccessControlsResource extends js.Object {
  /** Permanently deletes the default object ACL entry for the specified entity on the specified bucket. */
  def delete(request: Alt): Request[Unit] = js.native
  /** Returns the default object ACL entry for the specified entity on the specified bucket. */
  def get(request: Alt): Request[ObjectAccessControl] = js.native
  /** Creates a new default object ACL entry on the specified bucket. */
  def insert(request: typings.gapiClientStorage.anon.Bucket): Request[ObjectAccessControl] = js.native
  /** Retrieves default object ACL entries on the specified bucket. */
  def list(request: Fields): Request[ObjectAccessControls] = js.native
  /** Updates a default object ACL entry on the specified bucket. This method supports patch semantics. */
  def patch(request: Alt): Request[ObjectAccessControl] = js.native
  /** Updates a default object ACL entry on the specified bucket. */
  def update(request: Alt): Request[ObjectAccessControl] = js.native
}

object DefaultObjectAccessControlsResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    get: Alt => Request[ObjectAccessControl],
    insert: typings.gapiClientStorage.anon.Bucket => Request[ObjectAccessControl],
    list: Fields => Request[ObjectAccessControls],
    patch: Alt => Request[ObjectAccessControl],
    update: Alt => Request[ObjectAccessControl]
  ): DefaultObjectAccessControlsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DefaultObjectAccessControlsResource]
  }
  @scala.inline
  implicit class DefaultObjectAccessControlsResourceOps[Self <: DefaultObjectAccessControlsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: Alt => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Alt => Request[ObjectAccessControl]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: typings.gapiClientStorage.anon.Bucket => Request[ObjectAccessControl]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[ObjectAccessControls]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Alt => Request[ObjectAccessControl]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Alt => Request[ObjectAccessControl]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

