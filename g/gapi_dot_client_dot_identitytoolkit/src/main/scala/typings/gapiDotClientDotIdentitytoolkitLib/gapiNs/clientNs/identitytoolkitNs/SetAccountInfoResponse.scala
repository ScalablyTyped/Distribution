package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetAccountInfoResponse extends js.Object {
  /** The name of the user. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The email of the user. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** If email has been verified. */
  var emailVerified: js.UndefOr[scala.Boolean] = js.undefined
  /** If idToken is STS id token, then this field will be expiration time of STS id token in seconds. */
  var expiresIn: js.UndefOr[java.lang.String] = js.undefined
  /** The Gitkit id token to login the newly sign up user. */
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  /** The fixed string "identitytoolkit#SetAccountInfoResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The local ID of the user. */
  var localId: js.UndefOr[java.lang.String] = js.undefined
  /** The new email the user attempts to change to. */
  var newEmail: js.UndefOr[java.lang.String] = js.undefined
  /** The user's hashed password. */
  var passwordHash: js.UndefOr[java.lang.String] = js.undefined
  /** The photo url of the user. */
  var photoUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The user's profiles at the associated IdPs. */
  var providerUserInfo: js.UndefOr[js.Array[gapiDotClientDotIdentitytoolkitLib.Anon_DisplayName]] = js.undefined
  /** If idToken is STS id token, then this field will be refresh token. */
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
}

object SetAccountInfoResponse {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    email: java.lang.String = null,
    emailVerified: js.UndefOr[scala.Boolean] = js.undefined,
    expiresIn: java.lang.String = null,
    idToken: java.lang.String = null,
    kind: java.lang.String = null,
    localId: java.lang.String = null,
    newEmail: java.lang.String = null,
    passwordHash: java.lang.String = null,
    photoUrl: java.lang.String = null,
    providerUserInfo: js.Array[gapiDotClientDotIdentitytoolkitLib.Anon_DisplayName] = null,
    refreshToken: java.lang.String = null
  ): SetAccountInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(emailVerified)) __obj.updateDynamic("emailVerified")(emailVerified)
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn)
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (localId != null) __obj.updateDynamic("localId")(localId)
    if (newEmail != null) __obj.updateDynamic("newEmail")(newEmail)
    if (passwordHash != null) __obj.updateDynamic("passwordHash")(passwordHash)
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl)
    if (providerUserInfo != null) __obj.updateDynamic("providerUserInfo")(providerUserInfo)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    __obj.asInstanceOf[SetAccountInfoResponse]
  }
}

