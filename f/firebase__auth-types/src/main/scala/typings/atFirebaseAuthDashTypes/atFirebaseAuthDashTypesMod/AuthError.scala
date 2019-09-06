package typings.atFirebaseAuthDashTypes.atFirebaseAuthDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthError extends Error {
  var credential: js.UndefOr[AuthCredential] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var phoneNumber: js.UndefOr[String] = js.undefined
  var tenantId: js.UndefOr[String] = js.undefined
}

object AuthError {
  @scala.inline
  def apply(
    code: String,
    message: String,
    credential: AuthCredential = null,
    email: String = null,
    phoneNumber: String = null,
    tenantId: String = null
  ): AuthError = {
    val __obj = js.Dynamic.literal(code = code, message = message)
    if (credential != null) __obj.updateDynamic("credential")(credential)
    if (email != null) __obj.updateDynamic("email")(email)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (tenantId != null) __obj.updateDynamic("tenantId")(tenantId)
    __obj.asInstanceOf[AuthError]
  }
}

