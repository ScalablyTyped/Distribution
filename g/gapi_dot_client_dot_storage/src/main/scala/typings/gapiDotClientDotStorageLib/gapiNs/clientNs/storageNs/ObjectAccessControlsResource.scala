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
    delete: js.Function1[
      gapiDotClientDotStorageLib.Anon_AltBucketEntity, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotStorageLib.Anon_AltBucketEntity, 
      gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl]
    ],
    insert: js.Function1[
      gapiDotClientDotStorageLib.Anon_AltBucketFieldsGeneration, 
      gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl]
    ],
    list: js.Function1[
      gapiDotClientDotStorageLib.Anon_AltBucketFieldsGeneration, 
      gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControls]
    ],
    patch: js.Function1[
      gapiDotClientDotStorageLib.Anon_AltBucketEntity, 
      gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl]
    ],
    update: js.Function1[
      gapiDotClientDotStorageLib.Anon_AltBucketEntity, 
      gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl]
    ]
  ): ObjectAccessControlsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[ObjectAccessControlsResource]
  }
}

