package typings.gapiDotClientDotStorage.gapiNs.clientNs.storageNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotStorage.Anon_Alt
import typings.gapiDotClientDotStorage.Anon_AltBucket
import typings.gapiDotClientDotStorage.Anon_AltBucketFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultObjectAccessControlsResource extends js.Object {
  /** Permanently deletes the default object ACL entry for the specified entity on the specified bucket. */
  def delete(request: Anon_Alt): Request[Unit]
  /** Returns the default object ACL entry for the specified entity on the specified bucket. */
  def get(request: Anon_Alt): Request[ObjectAccessControl]
  /** Creates a new default object ACL entry on the specified bucket. */
  def insert(request: Anon_AltBucket): Request[ObjectAccessControl]
  /** Retrieves default object ACL entries on the specified bucket. */
  def list(request: Anon_AltBucketFields): Request[ObjectAccessControls]
  /** Updates a default object ACL entry on the specified bucket. This method supports patch semantics. */
  def patch(request: Anon_Alt): Request[ObjectAccessControl]
  /** Updates a default object ACL entry on the specified bucket. */
  def update(request: Anon_Alt): Request[ObjectAccessControl]
}

object DefaultObjectAccessControlsResource {
  @scala.inline
  def apply(
    delete: Anon_Alt => Request[Unit],
    get: Anon_Alt => Request[ObjectAccessControl],
    insert: Anon_AltBucket => Request[ObjectAccessControl],
    list: Anon_AltBucketFields => Request[ObjectAccessControls],
    patch: Anon_Alt => Request[ObjectAccessControl],
    update: Anon_Alt => Request[ObjectAccessControl]
  ): DefaultObjectAccessControlsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DefaultObjectAccessControlsResource]
  }
}

