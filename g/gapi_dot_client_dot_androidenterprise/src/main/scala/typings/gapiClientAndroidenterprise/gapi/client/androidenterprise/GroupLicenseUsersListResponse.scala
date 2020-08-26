package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupLicenseUsersListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#groupLicenseUsersListResponse". */
  var kind: js.UndefOr[String] = js.native
  /** A user of an enterprise. */
  var user: js.UndefOr[js.Array[User]] = js.native
}

object GroupLicenseUsersListResponse {
  @scala.inline
  def apply(): GroupLicenseUsersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupLicenseUsersListResponse]
  }
  @scala.inline
  implicit class GroupLicenseUsersListResponseOps[Self <: GroupLicenseUsersListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setUserVarargs(value: User*): Self = this.set("user", js.Array(value :_*))
    @scala.inline
    def setUser(value: js.Array[User]): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

