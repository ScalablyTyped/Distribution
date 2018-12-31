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

