package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request
import typings.gapiClientStorage.anon.Alt
import typings.gapiClientStorage.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultObjectAccessControlsResource extends js.Object {
  /** Permanently deletes the default object ACL entry for the specified entity on the specified bucket. */
  def delete(request: Alt): Request[Unit]
  /** Returns the default object ACL entry for the specified entity on the specified bucket. */
  def get(request: Alt): Request[ObjectAccessControl]
  /** Creates a new default object ACL entry on the specified bucket. */
  def insert(request: typings.gapiClientStorage.anon.Bucket): Request[ObjectAccessControl]
  /** Retrieves default object ACL entries on the specified bucket. */
  def list(request: Fields): Request[ObjectAccessControls]
  /** Updates a default object ACL entry on the specified bucket. This method supports patch semantics. */
  def patch(request: Alt): Request[ObjectAccessControl]
  /** Updates a default object ACL entry on the specified bucket. */
  def update(request: Alt): Request[ObjectAccessControl]
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
}

