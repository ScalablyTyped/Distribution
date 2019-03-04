package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemovePassword extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/remove-password
  /**
    * When provided, the authentication info related to the origin will only be
    * removed otherwise the entire cache will be cleared.
    */
  var origin: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Credentials of the authentication. Must be provided if removing by origin.
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Realm of the authentication. Must be provided if removing by origin.
    */
  var realm: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Scheme of the authentication. Can be basic, digest, ntlm, negotiate. Must be
    * provided if removing by origin.
    */
  var scheme: js.UndefOr[
    electronLib.electronLibStrings.basic | electronLib.electronLibStrings.digest | electronLib.electronLibStrings.ntlm | electronLib.electronLibStrings.negotiate
  ] = js.undefined
  /**
    * password.
    */
  var `type`: java.lang.String
  /**
    * Credentials of the authentication. Must be provided if removing by origin.
    */
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object RemovePassword {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    origin: java.lang.String = null,
    password: java.lang.String = null,
    realm: java.lang.String = null,
    scheme: electronLib.electronLibStrings.basic | electronLib.electronLibStrings.digest | electronLib.electronLibStrings.ntlm | electronLib.electronLibStrings.negotiate = null,
    username: java.lang.String = null
  ): RemovePassword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (password != null) __obj.updateDynamic("password")(password)
    if (realm != null) __obj.updateDynamic("realm")(realm)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[RemovePassword]
  }
}

