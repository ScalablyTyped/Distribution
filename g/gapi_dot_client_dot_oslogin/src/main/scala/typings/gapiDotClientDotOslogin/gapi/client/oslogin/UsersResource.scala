package typings.gapiDotClientDotOslogin.gapi.client.oslogin

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotOslogin.Anon_Accesstoken
import typings.gapiDotClientDotOslogin.Anon_AccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersResource extends js.Object {
  var sshPublicKeys: SshPublicKeysResource
  /**
    * Retrieves the profile information used for logging in to a virtual machine
    * on Google Compute Engine.
    */
  def getLoginProfile(request: Anon_Accesstoken): Request[LoginProfile]
  /**
    * Adds an SSH public key and returns the profile information. Default POSIX
    * account information is set when no username and UID exist as part of the
    * login profile.
    */
  def importSshPublicKey(request: Anon_AccesstokenAltBearertoken): Request[ImportSshPublicKeyResponse]
}

object UsersResource {
  @scala.inline
  def apply(
    getLoginProfile: Anon_Accesstoken => Request[LoginProfile],
    importSshPublicKey: Anon_AccesstokenAltBearertoken => Request[ImportSshPublicKeyResponse],
    sshPublicKeys: SshPublicKeysResource
  ): UsersResource = {
    val __obj = js.Dynamic.literal(getLoginProfile = js.Any.fromFunction1(getLoginProfile), importSshPublicKey = js.Any.fromFunction1(importSshPublicKey), sshPublicKeys = sshPublicKeys)
  
    __obj.asInstanceOf[UsersResource]
  }
}

