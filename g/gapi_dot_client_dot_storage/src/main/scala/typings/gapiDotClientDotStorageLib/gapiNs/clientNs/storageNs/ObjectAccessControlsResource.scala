package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ObjectAccessControlsResource extends js.Object {
  /** Permanently deletes the ACL entry for the specified entity on the specified object. */
  def delete(request: gapiDotClientDotStorageLib.Anon_GenerationPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns the ACL entry for the specified entity on the specified object. */
  def get(request: gapiDotClientDotStorageLib.Anon_GenerationPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl]
  /** Creates a new ACL entry on the specified object. */
  def insert(request: gapiDotClientDotStorageLib.Anon_Generation): gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl]
  /** Retrieves ACL entries on the specified object. */
  def list(request: gapiDotClientDotStorageLib.Anon_Generation): gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControls]
  /** Updates an ACL entry on the specified object. This method supports patch semantics. */
  def patch(request: gapiDotClientDotStorageLib.Anon_GenerationPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl]
  /** Updates an ACL entry on the specified object. */
  def update(request: gapiDotClientDotStorageLib.Anon_GenerationPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ObjectAccessControl]
}

