package typings.gapiClientOslogin.gapi.client.oslogin

import typings.gapiClient.gapi.client.Request
import typings.gapiClientOslogin.anon.Accesstoken
import typings.gapiClientOslogin.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SshPublicKeysResource extends js.Object {
  /** Deletes an SSH public key. */
  def delete(request: Accesstoken): Request[js.Object] = js.native
  /** Retrieves an SSH public key. */
  def get(request: Accesstoken): Request[SshPublicKey] = js.native
  /**
    * Updates an SSH public key and returns the profile information. This method
    * supports patch semantics.
    */
  def patch(request: Alt): Request[SshPublicKey] = js.native
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
  @scala.inline
  implicit class SshPublicKeysResourceOps[Self <: SshPublicKeysResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: Accesstoken => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Accesstoken => Request[SshPublicKey]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Alt => Request[SshPublicKey]): Self = this.set("patch", js.Any.fromFunction1(value))
  }
  
}

