package typings.electron.Electron

import typings.electron.electronStrings.basic
import typings.electron.electronStrings.digest
import typings.electron.electronStrings.negotiate
import typings.electron.electronStrings.ntlm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovePassword extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/remove-password
  /**
    * When provided, the authentication info related to the origin will only be
    * removed otherwise the entire cache will be cleared.
    */
  var origin: js.UndefOr[String] = js.native
  /**
    * Credentials of the authentication. Must be provided if removing by `origin`.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * Realm of the authentication. Must be provided if removing by `origin`.
    */
  var realm: js.UndefOr[String] = js.native
  /**
    * Scheme of the authentication. Can be `basic`, `digest`, `ntlm`, `negotiate`.
    * Must be provided if removing by `origin`.
    */
  var scheme: js.UndefOr[basic | digest | ntlm | negotiate] = js.native
  /**
    * `password`.
    */
  var `type`: String = js.native
  /**
    * Credentials of the authentication. Must be provided if removing by `origin`.
    */
  var username: js.UndefOr[String] = js.native
}

object RemovePassword {
  @scala.inline
  def apply(`type`: String): RemovePassword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovePassword]
  }
  @scala.inline
  implicit class RemovePasswordOps[Self <: RemovePassword] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setRealm(value: String): Self = this.set("realm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRealm: Self = this.set("realm", js.undefined)
    @scala.inline
    def setScheme(value: basic | digest | ntlm | negotiate): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

