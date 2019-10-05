package typings.gapiDotClientDotStorage.gapi.client.storage

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotStorage.Anon_Alt
import typings.gapiDotClientDotStorage.Anon_AltBucket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketAccessControlsResource extends js.Object {
  /** Permanently deletes the ACL entry for the specified entity on the specified bucket. */
  def delete(request: Anon_Alt): Request[Unit]
  /** Returns the ACL entry for the specified entity on the specified bucket. */
  def get(request: Anon_Alt): Request[BucketAccessControl]
  /** Creates a new ACL entry on the specified bucket. */
  def insert(request: Anon_AltBucket): Request[BucketAccessControl]
  /** Retrieves ACL entries on the specified bucket. */
  def list(request: Anon_AltBucket): Request[BucketAccessControls]
  /** Updates an ACL entry on the specified bucket. This method supports patch semantics. */
  def patch(request: Anon_Alt): Request[BucketAccessControl]
  /** Updates an ACL entry on the specified bucket. */
  def update(request: Anon_Alt): Request[BucketAccessControl]
}

object BucketAccessControlsResource {
  @scala.inline
  def apply(
    delete: Anon_Alt => Request[Unit],
    get: Anon_Alt => Request[BucketAccessControl],
    insert: Anon_AltBucket => Request[BucketAccessControl],
    list: Anon_AltBucket => Request[BucketAccessControls],
    patch: Anon_Alt => Request[BucketAccessControl],
    update: Anon_Alt => Request[BucketAccessControl]
  ): BucketAccessControlsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[BucketAccessControlsResource]
  }
}

