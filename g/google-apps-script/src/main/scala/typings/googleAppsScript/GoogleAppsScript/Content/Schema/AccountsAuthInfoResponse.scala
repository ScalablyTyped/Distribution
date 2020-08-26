package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsAuthInfoResponse extends js.Object {
  var accountIdentifiers: js.UndefOr[js.Array[AccountIdentifier]] = js.native
  var kind: js.UndefOr[String] = js.native
}

object AccountsAuthInfoResponse {
  @scala.inline
  def apply(): AccountsAuthInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountsAuthInfoResponse]
  }
  @scala.inline
  implicit class AccountsAuthInfoResponseOps[Self <: AccountsAuthInfoResponse] (val x: Self) extends AnyVal {
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
    def setAccountIdentifiersVarargs(value: AccountIdentifier*): Self = this.set("accountIdentifiers", js.Array(value :_*))
    @scala.inline
    def setAccountIdentifiers(value: js.Array[AccountIdentifier]): Self = this.set("accountIdentifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountIdentifiers: Self = this.set("accountIdentifiers", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

