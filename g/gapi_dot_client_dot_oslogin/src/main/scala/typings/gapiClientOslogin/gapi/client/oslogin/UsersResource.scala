package typings.gapiClientOslogin.gapi.client.oslogin

import typings.gapiClient.gapi.client.Request
import typings.gapiClientOslogin.anon.Accesstoken
import typings.gapiClientOslogin.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  var sshPublicKeys: SshPublicKeysResource
  /**
    * Retrieves the profile information used for logging in to a virtual machine
    * on Google Compute Engine.
    */
  def getLoginProfile(request: Accesstoken): Request[LoginProfile]
  /**
    * Adds an SSH public key and returns the profile information. Default POSIX
    * account information is set when no username and UID exist as part of the
    * login profile.
    */
  def importSshPublicKey(request: Bearertoken): Request[ImportSshPublicKeyResponse]
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
}

