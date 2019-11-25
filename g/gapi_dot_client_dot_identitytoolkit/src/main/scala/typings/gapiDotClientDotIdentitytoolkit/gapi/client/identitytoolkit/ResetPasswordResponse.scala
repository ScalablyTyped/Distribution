package typings.gapiDotClientDotIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetPasswordResponse extends js.Object {
  /** The user's email. If the out-of-band code is for email recovery, the user's original email. */
  var email: js.UndefOr[String] = js.undefined
  /** The fixed string "identitytoolkit#ResetPasswordResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** If the out-of-band code is for email recovery, the user's new email. */
  var newEmail: js.UndefOr[String] = js.undefined
  /** The request type. */
  var requestType: js.UndefOr[String] = js.undefined
}

object ResetPasswordResponse {
  @scala.inline
  def apply(email: String = null, kind: String = null, newEmail: String = null, requestType: String = null): ResetPasswordResponse = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (newEmail != null) __obj.updateDynamic("newEmail")(newEmail.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetPasswordResponse]
  }
}

