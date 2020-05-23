package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request
import typings.gapiClientStorage.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectAccessControlsResource extends js.Object {
  /** Permanently deletes the ACL entry for the specified entity on the specified object. */
  def delete(request: typings.gapiClientStorage.anon.Object): Request[Unit]
  /** Returns the ACL entry for the specified entity on the specified object. */
  def get(request: typings.gapiClientStorage.anon.Object): Request[ObjectAccessControl]
  /** Creates a new ACL entry on the specified object. */
  def insert(request: QuotaUser): Request[ObjectAccessControl]
  /** Retrieves ACL entries on the specified object. */
  def list(request: QuotaUser): Request[ObjectAccessControls]
  /** Updates an ACL entry on the specified object. This method supports patch semantics. */
  def patch(request: typings.gapiClientStorage.anon.Object): Request[ObjectAccessControl]
  /** Updates an ACL entry on the specified object. */
  def update(request: typings.gapiClientStorage.anon.Object): Request[ObjectAccessControl]
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
}

