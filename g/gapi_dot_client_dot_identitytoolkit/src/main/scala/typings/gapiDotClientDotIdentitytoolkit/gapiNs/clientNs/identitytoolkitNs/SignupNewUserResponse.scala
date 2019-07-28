package typings.gapiDotClientDotIdentitytoolkit.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignupNewUserResponse extends js.Object {
  /** The name of the user. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The email of the user. */
  var email: js.UndefOr[String] = js.undefined
  /** If idToken is STS id token, then this field will be expiration time of STS id token in seconds. */
  var expiresIn: js.UndefOr[String] = js.undefined
  /** The Gitkit id token to login the newly sign up user. */
  var idToken: js.UndefOr[String] = js.undefined
  /** The fixed string "identitytoolkit#SignupNewUserResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** The RP local ID of the user. */
  var localId: js.UndefOr[String] = js.undefined
  /** If idToken is STS id token, then this field will be refresh token. */
  var refreshToken: js.UndefOr[String] = js.undefined
}

object SignupNewUserResponse {
  @scala.inline
  def apply(
    displayName: String = null,
    email: String = null,
    expiresIn: String = null,
    idToken: String = null,
    kind: String = null,
    localId: String = null,
    refreshToken: String = null
  ): SignupNewUserResponse = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn)
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (localId != null) __obj.updateDynamic("localId")(localId)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    __obj.asInstanceOf[SignupNewUserResponse]
  }
}

