package typings.electron.Electron

import typings.electron.electronStrings.basic
import typings.electron.electronStrings.digest
import typings.electron.electronStrings.negotiate
import typings.electron.electronStrings.ntlm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemovePassword extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/remove-password
  /**
    * When provided, the authentication info related to the origin will only be
    * removed otherwise the entire cache will be cleared.
    */
  var origin: js.UndefOr[String] = js.undefined
  /**
    * Credentials of the authentication. Must be provided if removing by `origin`.
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * Realm of the authentication. Must be provided if removing by `origin`.
    */
  var realm: js.UndefOr[String] = js.undefined
  /**
    * Scheme of the authentication. Can be `basic`, `digest`, `ntlm`, `negotiate`.
    * Must be provided if removing by `origin`.
    */
  var scheme: js.UndefOr[basic | digest | ntlm | negotiate] = js.undefined
  /**
    * `password`.
    */
  var `type`: String
  /**
    * Credentials of the authentication. Must be provided if removing by `origin`.
    */
  var username: js.UndefOr[String] = js.undefined
}

object RemovePassword {
  @scala.inline
  def apply(
    `type`: String,
    origin: String = null,
    password: String = null,
    realm: String = null,
    scheme: basic | digest | ntlm | negotiate = null,
    username: String = null
  ): RemovePassword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (realm != null) __obj.updateDynamic("realm")(realm.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovePassword]
  }
}

