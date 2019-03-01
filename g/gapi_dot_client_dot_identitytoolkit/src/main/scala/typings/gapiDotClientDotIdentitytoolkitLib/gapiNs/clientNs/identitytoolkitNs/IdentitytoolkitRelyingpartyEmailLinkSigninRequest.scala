package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartyEmailLinkSigninRequest extends js.Object {
  /** The email address of the user. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** Token for linking flow. */
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  /** The confirmation code. */
  var oobCode: js.UndefOr[java.lang.String] = js.undefined
}

object IdentitytoolkitRelyingpartyEmailLinkSigninRequest {
  @scala.inline
  def apply(email: java.lang.String = null, idToken: java.lang.String = null, oobCode: java.lang.String = null): IdentitytoolkitRelyingpartyEmailLinkSigninRequest = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (oobCode != null) __obj.updateDynamic("oobCode")(oobCode)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyEmailLinkSigninRequest]
  }
}

