package typings.gapiClientOslogin.gapi.client.oslogin

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginProfile extends js.Object {
  /** A unique user ID for identifying the user. */
  var name: js.UndefOr[String] = js.native
  /** The list of POSIX accounts associated with the Directory API user. */
  var posixAccounts: js.UndefOr[js.Array[PosixAccount]] = js.native
  /** A map from SSH public key fingerprint to the associated key object. */
  var sshPublicKeys: js.UndefOr[Record[String, SshPublicKey]] = js.native
  /** Indicates if the user is suspended. */
  var suspended: js.UndefOr[Boolean] = js.native
}

object LoginProfile {
  @scala.inline
  def apply(): LoginProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginProfile]
  }
  @scala.inline
  implicit class LoginProfileOps[Self <: LoginProfile] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPosixAccountsVarargs(value: PosixAccount*): Self = this.set("posixAccounts", js.Array(value :_*))
    @scala.inline
    def setPosixAccounts(value: js.Array[PosixAccount]): Self = this.set("posixAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosixAccounts: Self = this.set("posixAccounts", js.undefined)
    @scala.inline
    def setSshPublicKeys(value: Record[String, SshPublicKey]): Self = this.set("sshPublicKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSshPublicKeys: Self = this.set("sshPublicKeys", js.undefined)
    @scala.inline
    def setSuspended(value: Boolean): Self = this.set("suspended", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuspended: Self = this.set("suspended", js.undefined)
  }
  
}

