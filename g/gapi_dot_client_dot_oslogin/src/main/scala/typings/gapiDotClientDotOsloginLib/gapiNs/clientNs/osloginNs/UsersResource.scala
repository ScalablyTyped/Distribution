package typings
package gapiDotClientDotOsloginLib.gapiNs.clientNs.osloginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UsersResource extends js.Object {
  var sshPublicKeys: SshPublicKeysResource
  /**
               * Retrieves the profile information used for logging in to a virtual machine
               * on Google Compute Engine.
               */
  def getLoginProfile(request: gapiDotClientDotOsloginLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[LoginProfile]
  /**
               * Adds an SSH public key and returns the profile information. Default POSIX
               * account information is set when no username and UID exist as part of the
               * login profile.
               */
  def importSshPublicKey(request: gapiDotClientDotOsloginLib.Anon_Parent): gapiDotClientLib.gapiNs.clientNs.Request[ImportSshPublicKeyResponse]
}

