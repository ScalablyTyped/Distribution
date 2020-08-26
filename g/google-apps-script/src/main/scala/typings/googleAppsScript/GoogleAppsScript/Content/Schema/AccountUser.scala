package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountUser extends js.Object {
  var admin: js.UndefOr[Boolean] = js.native
  var emailAddress: js.UndefOr[String] = js.native
  var orderManager: js.UndefOr[Boolean] = js.native
  var paymentsAnalyst: js.UndefOr[Boolean] = js.native
  var paymentsManager: js.UndefOr[Boolean] = js.native
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
    @scala.inline
    def setOrderManager(value: Boolean): Self = this.set("orderManager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderManager: Self = this.set("orderManager", js.undefined)
    @scala.inline
    def setPaymentsAnalyst(value: Boolean): Self = this.set("paymentsAnalyst", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentsAnalyst: Self = this.set("paymentsAnalyst", js.undefined)
    @scala.inline
    def setPaymentsManager(value: Boolean): Self = this.set("paymentsManager", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentsManager: Self = this.set("paymentsManager", js.undefined)
  }
  
}

