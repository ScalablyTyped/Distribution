package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request
import typings.gapiClientStorage.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketAccessControlsResource extends js.Object {
  /** Permanently deletes the ACL entry for the specified entity on the specified bucket. */
  def delete(request: Alt): Request[Unit]
  /** Returns the ACL entry for the specified entity on the specified bucket. */
  def get(request: Alt): Request[BucketAccessControl]
  /** Creates a new ACL entry on the specified bucket. */
  def insert(request: typings.gapiClientStorage.anon.Bucket): Request[BucketAccessControl]
  /** Retrieves ACL entries on the specified bucket. */
  def list(request: typings.gapiClientStorage.anon.Bucket): Request[BucketAccessControls]
  /** Updates an ACL entry on the specified bucket. This method supports patch semantics. */
  def patch(request: Alt): Request[BucketAccessControl]
  /** Updates an ACL entry on the specified bucket. */
  def update(request: Alt): Request[BucketAccessControl]
}

object BucketAccessControlsResource {
  @scala.inline
  def apply(
    delete: Alt => Request[Unit],
    get: Alt => Request[BucketAccessControl],
    insert: typings.gapiClientStorage.anon.Bucket => Request[BucketAccessControl],
    list: typings.gapiClientStorage.anon.Bucket => Request[BucketAccessControls],
    patch: Alt => Request[BucketAccessControl],
    update: Alt => Request[BucketAccessControl]
  ): BucketAccessControlsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[BucketAccessControlsResource]
  }
}

