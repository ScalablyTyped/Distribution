package typings.googleapis.buildSrcApisOsloginV1alphaMod.oslogin_v1alpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The user profile information used for logging in to a virtual machine on
  * Google Compute Engine.
  */
@js.native
trait Schema$LoginProfile extends js.Object {
  /**
    * A unique user ID.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The list of POSIX accounts associated with the user.
    */
  var posixAccounts: js.UndefOr[js.Array[Schema$PosixAccount]] = js.native
  /**
    * A map from SSH public key fingerprint to the associated key object.
    */
  var sshPublicKeys: js.UndefOr[StringDictionary[Schema$SshPublicKey]] = js.native
}

object Schema$LoginProfile {
  @scala.inline
  def apply(
    name: String = null,
    posixAccounts: js.Array[Schema$PosixAccount] = null,
    sshPublicKeys: StringDictionary[Schema$SshPublicKey] = null
  ): Schema$LoginProfile = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (posixAccounts != null) __obj.updateDynamic("posixAccounts")(posixAccounts.asInstanceOf[js.Any])
    if (sshPublicKeys != null) __obj.updateDynamic("sshPublicKeys")(sshPublicKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LoginProfile]
  }
}

