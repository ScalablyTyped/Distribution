package typings.gapiDotClientDotOslogin.gapiNs.clientNs.osloginNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotOslogin.Anon_Accesstoken
import typings.gapiDotClientDotOslogin.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SshPublicKeysResource extends js.Object {
  /** Deletes an SSH public key. */
  def delete(request: Anon_Accesstoken): Request[js.Object]
  /** Retrieves an SSH public key. */
  def get(request: Anon_Accesstoken): Request[SshPublicKey]
  /**
    * Updates an SSH public key and returns the profile information. This method
    * supports patch semantics.
    */
  def patch(request: Anon_AccesstokenAlt): Request[SshPublicKey]
}

object SshPublicKeysResource {
  @scala.inline
  def apply(
    delete: Anon_Accesstoken => Request[js.Object],
    get: Anon_Accesstoken => Request[SshPublicKey],
    patch: Anon_AccesstokenAlt => Request[SshPublicKey]
  ): SshPublicKeysResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch))
  
    __obj.asInstanceOf[SshPublicKeysResource]
  }
}

