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
    delete: js.Function1[
      gapiDotClientDotOsloginLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotOsloginLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[SshPublicKey]
    ],
    patch: js.Function1[
      gapiDotClientDotOsloginLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[SshPublicKey]
    ]
  ): SshPublicKeysResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("patch")(patch)
    __obj.asInstanceOf[SshPublicKeysResource]
  }
}

