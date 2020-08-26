package typings.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeldAccount extends js.Object {
  /**
    * The account's ID as provided by the
    * <a href="https://developers.google.com/admin-sdk/">Admin SDK</a>.
    */
  var accountId: js.UndefOr[String] = js.native
  /** When the account was put on hold. */
  var holdTime: js.UndefOr[String] = js.native
}

object HeldAccount {
  @scala.inline
  def apply(): HeldAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeldAccount]
  }
  @scala.inline
  implicit class HeldAccountOps[Self <: HeldAccount] (val x: Self) extends AnyVal {
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
    def setHoldTime(value: String): Self = this.set("holdTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoldTime: Self = this.set("holdTime", js.undefined)
  }
  
}

