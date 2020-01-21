package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientStorage.AnonAltBucketEntity
import typings.gapiClientStorage.AnonAltBucketFieldsGeneration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectAccessControlsResource extends js.Object {
  /** Permanently deletes the ACL entry for the specified entity on the specified object. */
  def delete(request: AnonAltBucketEntity): Request_[Unit]
  /** Returns the ACL entry for the specified entity on the specified object. */
  def get(request: AnonAltBucketEntity): Request_[ObjectAccessControl]
  /** Creates a new ACL entry on the specified object. */
  def insert(request: AnonAltBucketFieldsGeneration): Request_[ObjectAccessControl]
  /** Retrieves ACL entries on the specified object. */
  def list(request: AnonAltBucketFieldsGeneration): Request_[ObjectAccessControls]
  /** Updates an ACL entry on the specified object. This method supports patch semantics. */
  def patch(request: AnonAltBucketEntity): Request_[ObjectAccessControl]
  /** Updates an ACL entry on the specified object. */
  def update(request: AnonAltBucketEntity): Request_[ObjectAccessControl]
}

object ObjectAccessControlsResource {
  @scala.inline
  def apply(
    delete: AnonAltBucketEntity => Request_[Unit],
    get: AnonAltBucketEntity => Request_[ObjectAccessControl],
    insert: AnonAltBucketFieldsGeneration => Request_[ObjectAccessControl],
    list: AnonAltBucketFieldsGeneration => Request_[ObjectAccessControls],
    patch: AnonAltBucketEntity => Request_[ObjectAccessControl],
    update: AnonAltBucketEntity => Request_[ObjectAccessControl]
  ): ObjectAccessControlsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ObjectAccessControlsResource]
  }
}

