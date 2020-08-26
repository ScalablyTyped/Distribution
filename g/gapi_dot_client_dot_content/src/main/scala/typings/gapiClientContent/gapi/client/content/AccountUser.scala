package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountUser extends js.Object {
  /** Whether user is an admin. */
  var admin: js.UndefOr[Boolean] = js.native
  /** User's email address. */
  var emailAddress: js.UndefOr[String] = js.native
}

object AccountUser {
  @scala.inline
  def apply(): AccountUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountUser]
  }
  @scala.inline
  implicit class AccountUserOps[Self <: AccountUser] (val x: Self) extends AnyVal {
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
    def setAdmin(value: Boolean): Self = this.set("admin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdmin: Self = this.set("admin", js.undefined)
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
  }
  
}

