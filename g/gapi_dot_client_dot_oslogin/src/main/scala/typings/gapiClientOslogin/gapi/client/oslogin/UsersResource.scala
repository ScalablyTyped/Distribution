package typings.gapiClientOslogin.gapi.client.oslogin

import typings.gapiClient.gapi.client.Request
import typings.gapiClientOslogin.anon.Accesstoken
import typings.gapiClientOslogin.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersResource extends js.Object {
  var sshPublicKeys: SshPublicKeysResource = js.native
  /**
    * Retrieves the profile information used for logging in to a virtual machine
    * on Google Compute Engine.
    */
  def getLoginProfile(request: Accesstoken): Request[LoginProfile] = js.native
  /**
    * Adds an SSH public key and returns the profile information. Default POSIX
    * account information is set when no username and UID exist as part of the
    * login profile.
    */
  def importSshPublicKey(request: Bearertoken): Request[ImportSshPublicKeyResponse] = js.native
}

object UsersResource {
  @scala.inline
  def apply(
    getLoginProfile: Accesstoken => Request[LoginProfile],
    importSshPublicKey: Bearertoken => Request[ImportSshPublicKeyResponse],
    sshPublicKeys: SshPublicKeysResource
  ): UsersResource = {
    val __obj = js.Dynamic.literal(getLoginProfile = js.Any.fromFunction1(getLoginProfile), importSshPublicKey = js.Any.fromFunction1(importSshPublicKey), sshPublicKeys = sshPublicKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersResource]
  }
  @scala.inline
  implicit class UsersResourceOps[Self <: UsersResource] (val x: Self) extends AnyVal {
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
    def setGetLoginProfile(value: Accesstoken => Request[LoginProfile]): Self = this.set("getLoginProfile", js.Any.fromFunction1(value))
    @scala.inline
    def setImportSshPublicKey(value: Bearertoken => Request[ImportSshPublicKeyResponse]): Self = this.set("importSshPublicKey", js.Any.fromFunction1(value))
    @scala.inline
    def setSshPublicKeys(value: SshPublicKeysResource): Self = this.set("sshPublicKeys", value.asInstanceOf[js.Any])
  }
  
}

