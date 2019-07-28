package typings.gapiDotClientDotClouduseraccounts.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxUserView extends js.Object {
  /** [Output Only] The GECOS (user information) entry for this account. */
  var gecos: js.UndefOr[String] = js.undefined
  /** [Output Only] User's default group ID. */
  var gid: js.UndefOr[Double] = js.undefined
  /** [Output Only] The path to the home directory for this account. */
  var homeDirectory: js.UndefOr[String] = js.undefined
  /** [Output Only] The path to the login shell for this account. */
  var shell: js.UndefOr[String] = js.undefined
  /** [Output Only] User ID. */
  var uid: js.UndefOr[Double] = js.undefined
  /** [Output Only] The username of the account. */
  var username: js.UndefOr[String] = js.undefined
}

object LinuxUserView {
  @scala.inline
  def apply(
    gecos: String = null,
    gid: Int | Double = null,
    homeDirectory: String = null,
    shell: String = null,
    uid: Int | Double = null,
    username: String = null
  ): LinuxUserView = {
    val __obj = js.Dynamic.literal()
    if (gecos != null) __obj.updateDynamic("gecos")(gecos)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (homeDirectory != null) __obj.updateDynamic("homeDirectory")(homeDirectory)
    if (shell != null) __obj.updateDynamic("shell")(shell)
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[LinuxUserView]
  }
}

