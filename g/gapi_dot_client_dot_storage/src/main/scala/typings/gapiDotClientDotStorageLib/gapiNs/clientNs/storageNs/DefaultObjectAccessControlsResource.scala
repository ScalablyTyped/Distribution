package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultObjectAccessControlsResource extends js.Object {
  /** Permanently deletes the default object ACL entry for the specified entity on the specified bucket. */
  def delete(request: gapiDotClientDotStorageLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns the default object ACL entry for the specified entity on the specified bucket. */
  def get(request: gapiDotClientDotStorageLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl]
  /** Creates a new default object ACL entry on the specified bucket. */
  def insert(request: gapiDotClientDotStorageLib.Anon_AltBucket): gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl]
  /** Retrieves default object ACL entries on the specified bucket. */
  def list(request: gapiDotClientDotStorageLib.Anon_AltBucketFields): gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControls]
  /** Updates a default object ACL entry on the specified bucket. This method supports patch semantics. */
  def patch(request: gapiDotClientDotStorageLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl]
  /** Updates a default object ACL entry on the specified bucket. */
  def update(request: gapiDotClientDotStorageLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl]
}

object DefaultObjectAccessControlsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotStorageLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotStorageLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl],
    insert: gapiDotClientDotStorageLib.Anon_AltBucket => gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl],
    list: gapiDotClientDotStorageLib.Anon_AltBucketFields => gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControls],
    patch: gapiDotClientDotStorageLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl],
    update: gapiDotClientDotStorageLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl]
  ): DefaultObjectAccessControlsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DefaultObjectAccessControlsResource]
  }
}

