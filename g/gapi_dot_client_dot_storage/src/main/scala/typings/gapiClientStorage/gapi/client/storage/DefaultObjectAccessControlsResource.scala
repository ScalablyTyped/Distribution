package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientStorage.AnonAlt
import typings.gapiClientStorage.AnonBucket
import typings.gapiClientStorage.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultObjectAccessControlsResource extends js.Object {
  /** Permanently deletes the default object ACL entry for the specified entity on the specified bucket. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Returns the default object ACL entry for the specified entity on the specified bucket. */
  def get(request: AnonAlt): Request_[ObjectAccessControl]
  /** Creates a new default object ACL entry on the specified bucket. */
  def insert(request: AnonBucket): Request_[ObjectAccessControl]
  /** Retrieves default object ACL entries on the specified bucket. */
  def list(request: AnonFields): Request_[ObjectAccessControls]
  /** Updates a default object ACL entry on the specified bucket. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[ObjectAccessControl]
  /** Updates a default object ACL entry on the specified bucket. */
  def update(request: AnonAlt): Request_[ObjectAccessControl]
}

object DefaultObjectAccessControlsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    get: AnonAlt => Request_[ObjectAccessControl],
    insert: AnonBucket => Request_[ObjectAccessControl],
    list: AnonFields => Request_[ObjectAccessControls],
    patch: AnonAlt => Request_[ObjectAccessControl],
    update: AnonAlt => Request_[ObjectAccessControl]
  ): DefaultObjectAccessControlsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DefaultObjectAccessControlsResource]
  }
}

