package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientStorage.AnonAlt
import typings.gapiClientStorage.AnonBucket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketAccessControlsResource extends js.Object {
  /** Permanently deletes the ACL entry for the specified entity on the specified bucket. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Returns the ACL entry for the specified entity on the specified bucket. */
  def get(request: AnonAlt): Request_[BucketAccessControl]
  /** Creates a new ACL entry on the specified bucket. */
  def insert(request: AnonBucket): Request_[BucketAccessControl]
  /** Retrieves ACL entries on the specified bucket. */
  def list(request: AnonBucket): Request_[BucketAccessControls]
  /** Updates an ACL entry on the specified bucket. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[BucketAccessControl]
  /** Updates an ACL entry on the specified bucket. */
  def update(request: AnonAlt): Request_[BucketAccessControl]
}

object BucketAccessControlsResource {
  @scala.inline
  def apply(
    delete: AnonAlt => Request_[Unit],
    get: AnonAlt => Request_[BucketAccessControl],
    insert: AnonBucket => Request_[BucketAccessControl],
    list: AnonBucket => Request_[BucketAccessControls],
    patch: AnonAlt => Request_[BucketAccessControl],
    update: AnonAlt => Request_[BucketAccessControl]
  ): BucketAccessControlsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[BucketAccessControlsResource]
  }
}

