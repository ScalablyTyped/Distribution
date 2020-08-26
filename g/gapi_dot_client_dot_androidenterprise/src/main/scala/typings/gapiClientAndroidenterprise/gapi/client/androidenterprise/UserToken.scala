package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserToken extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#userToken". */
  var kind: js.UndefOr[String] = js.native
  /** The token (activation code) to be entered by the user. This consists of a sequence of decimal digits. Note that the leading digit may be 0. */
  var token: js.UndefOr[String] = js.native
  /** The unique ID for the user. */
  var userId: js.UndefOr[String] = js.native
}

object UserToken {
  @scala.inline
  def apply(): UserToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserToken]
  }
  @scala.inline
  implicit class UserTokenOps[Self <: UserToken] (val x: Self) extends AnyVal {
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
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

