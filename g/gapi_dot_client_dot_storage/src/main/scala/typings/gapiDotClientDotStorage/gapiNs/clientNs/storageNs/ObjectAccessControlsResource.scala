package typings.gapiDotClientDotStorage.gapiNs.clientNs.storageNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotStorage.Anon_AltBucketEntity
import typings.gapiDotClientDotStorage.Anon_AltBucketFieldsGeneration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectAccessControlsResource extends js.Object {
  /** Permanently deletes the ACL entry for the specified entity on the specified object. */
  def delete(request: Anon_AltBucketEntity): Request[Unit]
  /** Returns the ACL entry for the specified entity on the specified object. */
  def get(request: Anon_AltBucketEntity): Request[ObjectAccessControl]
  /** Creates a new ACL entry on the specified object. */
  def insert(request: Anon_AltBucketFieldsGeneration): Request[ObjectAccessControl]
  /** Retrieves ACL entries on the specified object. */
  def list(request: Anon_AltBucketFieldsGeneration): Request[ObjectAccessControls]
  /** Updates an ACL entry on the specified object. This method supports patch semantics. */
  def patch(request: Anon_AltBucketEntity): Request[ObjectAccessControl]
  /** Updates an ACL entry on the specified object. */
  def update(request: Anon_AltBucketEntity): Request[ObjectAccessControl]
}

object ObjectAccessControlsResource {
  @scala.inline
  def apply(
    delete: Anon_AltBucketEntity => Request[Unit],
    get: Anon_AltBucketEntity => Request[ObjectAccessControl],
    insert: Anon_AltBucketFieldsGeneration => Request[ObjectAccessControl],
    list: Anon_AltBucketFieldsGeneration => Request[ObjectAccessControls],
    patch: Anon_AltBucketEntity => Request[ObjectAccessControl],
    update: Anon_AltBucketEntity => Request[ObjectAccessControl]
  ): ObjectAccessControlsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ObjectAccessControlsResource]
  }
}

