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
    delete: js.Function1[
      gapiDotClientDotStorageLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotStorageLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[BucketAccessControl]
    ],
    insert: js.Function1[
      gapiDotClientDotStorageLib.Anon_AltBucket, 
      gapiDotClientLib.gapiNs.clientNs.Request[BucketAccessControl]
    ],
    list: js.Function1[
      gapiDotClientDotStorageLib.Anon_AltBucket, 
      gapiDotClientLib.gapiNs.clientNs.Request[BucketAccessControls]
    ],
    patch: js.Function1[
      gapiDotClientDotStorageLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[BucketAccessControl]
    ],
    update: js.Function1[
      gapiDotClientDotStorageLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[BucketAccessControl]
    ]
  ): BucketAccessControlsResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[BucketAccessControlsResource]
  }
}

