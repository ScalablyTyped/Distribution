package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdministratorWebToken extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#administratorWebToken". */
  var kind: js.UndefOr[String] = js.native
  /** An opaque token to be passed to the Play front-end to generate an iframe. */
  var token: js.UndefOr[String] = js.native
}

object AdministratorWebToken {
  @scala.inline
  def apply(): AdministratorWebToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministratorWebToken]
  }
  @scala.inline
  implicit class AdministratorWebTokenOps[Self <: AdministratorWebToken] (val x: Self) extends AnyVal {
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
  }
  
}

