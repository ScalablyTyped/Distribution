package typings.gapiDotClientDotOslogin.gapi.client.oslogin

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginProfile extends js.Object {
  /** A unique user ID for identifying the user. */
  var name: js.UndefOr[String] = js.undefined
  /** The list of POSIX accounts associated with the Directory API user. */
  var posixAccounts: js.UndefOr[js.Array[PosixAccount]] = js.undefined
  /** A map from SSH public key fingerprint to the associated key object. */
  var sshPublicKeys: js.UndefOr[Record[String, SshPublicKey]] = js.undefined
  /** Indicates if the user is suspended. */
  var suspended: js.UndefOr[Boolean] = js.undefined
}

object LoginProfile {
  @scala.inline
  def apply(
    name: String = null,
    posixAccounts: js.Array[PosixAccount] = null,
    sshPublicKeys: Record[String, SshPublicKey] = null,
    suspended: js.UndefOr[Boolean] = js.undefined
  ): LoginProfile = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (posixAccounts != null) __obj.updateDynamic("posixAccounts")(posixAccounts.asInstanceOf[js.Any])
    if (sshPublicKeys != null) __obj.updateDynamic("sshPublicKeys")(sshPublicKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(suspended)) __obj.updateDynamic("suspended")(suspended.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginProfile]
  }
}

