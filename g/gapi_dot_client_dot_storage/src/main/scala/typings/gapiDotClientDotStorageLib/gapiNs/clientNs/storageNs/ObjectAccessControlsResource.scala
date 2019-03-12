package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectAccessControlsResource extends js.Object {
  /** Permanently deletes the ACL entry for the specified entity on the specified object. */
  def delete(request: gapiDotClientDotStorageLib.Anon_AltBucketEntity): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns the ACL entry for the specified entity on the specified object. */
  def get(request: gapiDotClientDotStorageLib.Anon_AltBucketEntity): gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl]
  /** Creates a new ACL entry on the specified object. */
  def insert(request: gapiDotClientDotStorageLib.Anon_AltBucketFieldsGeneration): gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl]
  /** Retrieves ACL entries on the specified object. */
  def list(request: gapiDotClientDotStorageLib.Anon_AltBucketFieldsGeneration): gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControls]
  /** Updates an ACL entry on the specified object. This method supports patch semantics. */
  def patch(request: gapiDotClientDotStorageLib.Anon_AltBucketEntity): gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl]
  /** Updates an ACL entry on the specified object. */
  def update(request: gapiDotClientDotStorageLib.Anon_AltBucketEntity): gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl]
}

object ObjectAccessControlsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotStorageLib.Anon_AltBucketEntity => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotStorageLib.Anon_AltBucketEntity => gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl],
    insert: gapiDotClientDotStorageLib.Anon_AltBucketFieldsGeneration => gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl],
    list: gapiDotClientDotStorageLib.Anon_AltBucketFieldsGeneration => gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControls],
    patch: gapiDotClientDotStorageLib.Anon_AltBucketEntity => gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl],
    update: gapiDotClientDotStorageLib.Anon_AltBucketEntity => gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl]
  ): ObjectAccessControlsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ObjectAccessControlsResource]
  }
}

