package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPosixAccount extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var gecos: js.UndefOr[String] = js.undefined
  var gid: js.UndefOr[String] = js.undefined
  var homeDirectory: js.UndefOr[String] = js.undefined
  var operatingSystemType: js.UndefOr[String] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
  var shell: js.UndefOr[String] = js.undefined
  var systemId: js.UndefOr[String] = js.undefined
  var uid: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object UserPosixAccount {
  @scala.inline
  def apply(
    accountId: String = null,
    gecos: String = null,
    gid: String = null,
    homeDirectory: String = null,
    operatingSystemType: String = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    shell: String = null,
    systemId: String = null,
    uid: String = null,
    username: String = null
  ): UserPosixAccount = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (gecos != null) __obj.updateDynamic("gecos")(gecos.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (homeDirectory != null) __obj.updateDynamic("homeDirectory")(homeDirectory.asInstanceOf[js.Any])
    if (operatingSystemType != null) __obj.updateDynamic("operatingSystemType")(operatingSystemType.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.get.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (systemId != null) __obj.updateDynamic("systemId")(systemId.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPosixAccount]
  }
}

