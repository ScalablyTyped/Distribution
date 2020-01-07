package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a POSIX account entry.
  */
@js.native
trait Schema$UserSshPublicKey extends js.Object {
  /**
    * An expiration time in microseconds since epoch.
    */
  var expirationTimeUsec: js.UndefOr[String] = js.native
  /**
    * A SHA-256 fingerprint of the SSH public key. (Read-only)
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * An SSH public key.
    */
  var key: js.UndefOr[String] = js.native
}

object Schema$UserSshPublicKey {
  @scala.inline
  def apply(expirationTimeUsec: String = null, fingerprint: String = null, key: String = null): Schema$UserSshPublicKey = {
    val __obj = js.Dynamic.literal()
    if (expirationTimeUsec != null) __obj.updateDynamic("expirationTimeUsec")(expirationTimeUsec.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserSshPublicKey]
  }
}

