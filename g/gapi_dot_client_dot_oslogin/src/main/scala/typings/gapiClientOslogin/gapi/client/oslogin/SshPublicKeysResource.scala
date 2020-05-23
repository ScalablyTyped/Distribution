package typings.gapiClientOslogin.gapi.client.oslogin

import typings.gapiClient.gapi.client.Request
import typings.gapiClientOslogin.anon.Accesstoken
import typings.gapiClientOslogin.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SshPublicKeysResource extends js.Object {
  /** Deletes an SSH public key. */
  def delete(request: Accesstoken): Request[js.Object]
  /** Retrieves an SSH public key. */
  def get(request: Accesstoken): Request[SshPublicKey]
  /**
    * Updates an SSH public key and returns the profile information. This method
    * supports patch semantics.
    */
  def patch(request: Alt): Request[SshPublicKey]
}

object SshPublicKeysResource {
  @scala.inline
  def apply(
    delete: Accesstoken => Request[js.Object],
    get: Accesstoken => Request[SshPublicKey],
    patch: Alt => Request[SshPublicKey]
  ): SshPublicKeysResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[SshPublicKeysResource]
  }
}

