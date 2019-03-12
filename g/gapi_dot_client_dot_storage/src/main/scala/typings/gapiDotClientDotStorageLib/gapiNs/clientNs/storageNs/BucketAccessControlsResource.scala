package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketAccessControlsResource extends js.Object {
  /** Permanently deletes the ACL entry for the specified entity on the specified bucket. */
  def delete(request: gapiDotClientDotStorageLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns the ACL entry for the specified entity on the specified bucket. */
  def get(request: gapiDotClientDotStorageLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[BucketAccessControl]
  /** Creates a new ACL entry on the specified bucket. */
  def insert(request: gapiDotClientDotStorageLib.Anon_AltBucket): gapiDotClientLib.gapiNs.clientNs.Request[BucketAccessControl]
  /** Retrieves ACL entries on the specified bucket. */
  def list(request: gapiDotClientDotStorageLib.Anon_AltBucket): gapiDotClientLib.gapiNs.clientNs.Request[BucketAccessControls]
  /** Updates an ACL entry on the specified bucket. This method supports patch semantics. */
  def patch(request: gapiDotClientDotStorageLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[BucketAccessControl]
  /** Updates an ACL entry on the specified bucket. */
  def update(request: gapiDotClientDotStorageLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[BucketAccessControl]
}

object BucketAccessControlsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotStorageLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotStorageLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[BucketAccessControl],
    insert: gapiDotClientDotStorageLib.Anon_AltBucket => gapiDotClientLib.gapiNs.clientNs.Request[BucketAccessControl],
    list: gapiDotClientDotStorageLib.Anon_AltBucket => gapiDotClientLib.gapiNs.clientNs.Request[BucketAccessControls],
    patch: gapiDotClientDotStorageLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[BucketAccessControl],
    update: gapiDotClientDotStorageLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[BucketAccessControl]
  ): BucketAccessControlsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[BucketAccessControlsResource]
  }
}

