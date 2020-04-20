package typings.gapiClientOslogin.gapi.client.oslogin

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientOslogin.AnonAccesstoken
import typings.gapiClientOslogin.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SshPublicKeysResource extends js.Object {
  /** Deletes an SSH public key. */
  def delete(request: AnonAccesstoken): Request_[js.Object]
  /** Retrieves an SSH public key. */
  def get(request: AnonAccesstoken): Request_[SshPublicKey]
  /**
    * Updates an SSH public key and returns the profile information. This method
    * supports patch semantics.
    */
  def patch(request: AnonAlt): Request_[SshPublicKey]
}

object SshPublicKeysResource {
  @scala.inline
  def apply(
    delete: AnonAccesstoken => Request_[js.Object],
    get: AnonAccesstoken => Request_[SshPublicKey],
    patch: AnonAlt => Request_[SshPublicKey]
  ): SshPublicKeysResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch))
    __obj.asInstanceOf[SshPublicKeysResource]
  }
}

