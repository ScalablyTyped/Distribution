package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserSshPublicKey extends js.Object {
  var expirationTimeUsec: js.UndefOr[String] = js.undefined
  var fingerprint: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
}

object UserSshPublicKey {
  @scala.inline
  def apply(expirationTimeUsec: String = null, fingerprint: String = null, key: String = null): UserSshPublicKey = {
    val __obj = js.Dynamic.literal()
    if (expirationTimeUsec != null) __obj.updateDynamic("expirationTimeUsec")(expirationTimeUsec.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSshPublicKey]
  }
}

