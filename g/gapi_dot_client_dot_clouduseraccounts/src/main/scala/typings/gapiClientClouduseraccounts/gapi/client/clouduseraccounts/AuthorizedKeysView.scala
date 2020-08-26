package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizedKeysView extends js.Object {
  /** [Output Only] The list of authorized public keys in SSH format. */
  var keys: js.UndefOr[js.Array[String]] = js.native
  /** [Output Only] Whether the user has the ability to elevate on the instance that requested the authorized keys. */
  var sudoer: js.UndefOr[Boolean] = js.native
}

object AuthorizedKeysView {
  @scala.inline
  def apply(): AuthorizedKeysView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizedKeysView]
  }
  @scala.inline
  implicit class AuthorizedKeysViewOps[Self <: AuthorizedKeysView] (val x: Self) extends AnyVal {
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
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setSudoer(value: Boolean): Self = this.set("sudoer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSudoer: Self = this.set("sudoer", js.undefined)
  }
  
}

