package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserSshPublicKey extends js.Object {
  var expirationTimeUsec: js.UndefOr[java.lang.String] = js.undefined
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
}

object UserSshPublicKey {
  @scala.inline
  def apply(
    expirationTimeUsec: java.lang.String = null,
    fingerprint: java.lang.String = null,
    key: java.lang.String = null
  ): UserSshPublicKey = {
    val __obj = js.Dynamic.literal()
    if (expirationTimeUsec != null) __obj.updateDynamic("expirationTimeUsec")(expirationTimeUsec)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[UserSshPublicKey]
  }
}

