package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientStorage.AnonObject
import typings.gapiClientStorage.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectAccessControlsResource extends js.Object {
  /** Permanently deletes the ACL entry for the specified entity on the specified object. */
  def delete(request: AnonObject): Request_[Unit]
  /** Returns the ACL entry for the specified entity on the specified object. */
  def get(request: AnonObject): Request_[ObjectAccessControl]
  /** Creates a new ACL entry on the specified object. */
  def insert(request: AnonQuotaUser): Request_[ObjectAccessControl]
  /** Retrieves ACL entries on the specified object. */
  def list(request: AnonQuotaUser): Request_[ObjectAccessControls]
  /** Updates an ACL entry on the specified object. This method supports patch semantics. */
  def patch(request: AnonObject): Request_[ObjectAccessControl]
  /** Updates an ACL entry on the specified object. */
  def update(request: AnonObject): Request_[ObjectAccessControl]
}

object ObjectAccessControlsResource {
  @scala.inline
  def apply(
    delete: AnonObject => Request_[Unit],
    get: AnonObject => Request_[ObjectAccessControl],
    insert: AnonQuotaUser => Request_[ObjectAccessControl],
    list: AnonQuotaUser => Request_[ObjectAccessControls],
    patch: AnonObject => Request_[ObjectAccessControl],
    update: AnonObject => Request_[ObjectAccessControl]
  ): ObjectAccessControlsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ObjectAccessControlsResource]
  }
}

