package typings
package gapiDotClientDotOsloginLib.gapiNs.clientNs.osloginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SshPublicKeysResource extends js.Object {
  /** Deletes an SSH public key. */
  def delete(request: gapiDotClientDotOsloginLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Retrieves an SSH public key. */
  def get(request: gapiDotClientDotOsloginLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[SshPublicKey]
  /**
    * Updates an SSH public key and returns the profile information. This method
    * supports patch semantics.
    */
  def patch(request: gapiDotClientDotOsloginLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[SshPublicKey]
}

object SshPublicKeysResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotOsloginLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    get: gapiDotClientDotOsloginLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[SshPublicKey],
    patch: gapiDotClientDotOsloginLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[SshPublicKey]
  ): SshPublicKeysResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[SshPublicKeysResource]
  }
}

