package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinuxUserView extends js.Object {
  /** [Output Only] The GECOS (user information) entry for this account. */
  var gecos: js.UndefOr[String] = js.native
  /** [Output Only] User's default group ID. */
  var gid: js.UndefOr[Double] = js.native
  /** [Output Only] The path to the home directory for this account. */
  var homeDirectory: js.UndefOr[String] = js.native
  /** [Output Only] The path to the login shell for this account. */
  var shell: js.UndefOr[String] = js.native
  /** [Output Only] User ID. */
  var uid: js.UndefOr[Double] = js.native
  /** [Output Only] The username of the account. */
  var username: js.UndefOr[String] = js.native
}

object LinuxUserView {
  @scala.inline
  def apply(): LinuxUserView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinuxUserView]
  }
  @scala.inline
  implicit class LinuxUserViewOps[Self <: LinuxUserView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGecos(value: String): Self = this.set("gecos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGecos: Self = this.set("gecos", js.undefined)
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGid: Self = this.set("gid", js.undefined)
    @scala.inline
    def setHomeDirectory(value: String): Self = this.set("homeDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeDirectory: Self = this.set("homeDirectory", js.undefined)
    @scala.inline
    def setShell(value: String): Self = this.set("shell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShell: Self = this.set("shell", js.undefined)
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

