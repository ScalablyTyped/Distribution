package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetPasswordResponse extends js.Object {
  /** The user's email. If the out-of-band code is for email recovery, the user's original email. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** The fixed string "identitytoolkit#ResetPasswordResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** If the out-of-band code is for email recovery, the user's new email. */
  var newEmail: js.UndefOr[java.lang.String] = js.undefined
  /** The request type. */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
}

object ResetPasswordResponse {
  @scala.inline
  def apply(
    email: java.lang.String = null,
    kind: java.lang.String = null,
    newEmail: java.lang.String = null,
    requestType: java.lang.String = null
  ): ResetPasswordResponse = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (newEmail != null) __obj.updateDynamic("newEmail")(newEmail)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    __obj.asInstanceOf[ResetPasswordResponse]
  }
}

