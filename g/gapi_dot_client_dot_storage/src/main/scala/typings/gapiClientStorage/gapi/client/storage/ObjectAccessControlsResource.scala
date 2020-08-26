package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request
import typings.gapiClientStorage.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectAccessControlsResource extends js.Object {
  /** Permanently deletes the ACL entry for the specified entity on the specified object. */
  def delete(request: typings.gapiClientStorage.anon.Object): Request[Unit] = js.native
  /** Returns the ACL entry for the specified entity on the specified object. */
  def get(request: typings.gapiClientStorage.anon.Object): Request[ObjectAccessControl] = js.native
  /** Creates a new ACL entry on the specified object. */
  def insert(request: QuotaUser): Request[ObjectAccessControl] = js.native
  /** Retrieves ACL entries on the specified object. */
  def list(request: QuotaUser): Request[ObjectAccessControls] = js.native
  /** Updates an ACL entry on the specified object. This method supports patch semantics. */
  def patch(request: typings.gapiClientStorage.anon.Object): Request[ObjectAccessControl] = js.native
  /** Updates an ACL entry on the specified object. */
  def update(request: typings.gapiClientStorage.anon.Object): Request[ObjectAccessControl] = js.native
}

object ObjectAccessControlsResource {
  @scala.inline
  def apply(
    delete: typings.gapiClientStorage.anon.Object => Request[Unit],
    get: typings.gapiClientStorage.anon.Object => Request[ObjectAccessControl],
    insert: QuotaUser => Request[ObjectAccessControl],
    list: QuotaUser => Request[ObjectAccessControls],
    patch: typings.gapiClientStorage.anon.Object => Request[ObjectAccessControl],
    update: typings.gapiClientStorage.anon.Object => Request[ObjectAccessControl]
  ): ObjectAccessControlsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ObjectAccessControlsResource]
  }
  @scala.inline
  implicit class ObjectAccessControlsResourceOps[Self <: ObjectAccessControlsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: typings.gapiClientStorage.anon.Object => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: typings.gapiClientStorage.anon.Object => Request[ObjectAccessControl]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: QuotaUser => Request[ObjectAccessControl]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: QuotaUser => Request[ObjectAccessControls]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: typings.gapiClientStorage.anon.Object => Request[ObjectAccessControl]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: typings.gapiClientStorage.anon.Object => Request[ObjectAccessControl]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

