package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPosixAccount extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var gecos: js.UndefOr[java.lang.String] = js.undefined
  var gid: js.UndefOr[java.lang.String] = js.undefined
  var homeDirectory: js.UndefOr[java.lang.String] = js.undefined
  var operatingSystemType: js.UndefOr[java.lang.String] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var shell: js.UndefOr[java.lang.String] = js.undefined
  var systemId: js.UndefOr[java.lang.String] = js.undefined
  var uid: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object UserPosixAccount {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    gecos: java.lang.String = null,
    gid: java.lang.String = null,
    homeDirectory: java.lang.String = null,
    operatingSystemType: java.lang.String = null,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    shell: java.lang.String = null,
    systemId: java.lang.String = null,
    uid: java.lang.String = null,
    username: java.lang.String = null
  ): UserPosixAccount = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (gecos != null) __obj.updateDynamic("gecos")(gecos)
    if (gid != null) __obj.updateDynamic("gid")(gid)
    if (homeDirectory != null) __obj.updateDynamic("homeDirectory")(homeDirectory)
    if (operatingSystemType != null) __obj.updateDynamic("operatingSystemType")(operatingSystemType)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (shell != null) __obj.updateDynamic("shell")(shell)
    if (systemId != null) __obj.updateDynamic("systemId")(systemId)
    if (uid != null) __obj.updateDynamic("uid")(uid)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[UserPosixAccount]
  }
}

