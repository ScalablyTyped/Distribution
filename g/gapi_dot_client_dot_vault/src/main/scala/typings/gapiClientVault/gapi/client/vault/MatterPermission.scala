package typings.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatterPermission extends js.Object {
  /** The account id, as provided by <a href="https://developers.google.com/admin-sdk/">Admin SDK</a>. */
  var accountId: js.UndefOr[String] = js.native
  /** The user's role in this matter. */
  var role: js.UndefOr[String] = js.native
}

object MatterPermission {
  @scala.inline
  def apply(): MatterPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterPermission]
  }
  @scala.inline
  implicit class MatterPermissionOps[Self <: MatterPermission] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

