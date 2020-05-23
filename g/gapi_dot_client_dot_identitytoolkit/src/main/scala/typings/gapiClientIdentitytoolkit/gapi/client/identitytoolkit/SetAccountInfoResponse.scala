package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import typings.gapiClientIdentitytoolkit.anon.DisplayName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetAccountInfoResponse extends js.Object {
  /** The name of the user. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The email of the user. */
  var email: js.UndefOr[String] = js.undefined
  /** If email has been verified. */
  var emailVerified: js.UndefOr[Boolean] = js.undefined
  /** If idToken is STS id token, then this field will be expiration time of STS id token in seconds. */
  var expiresIn: js.UndefOr[String] = js.undefined
  /** The Gitkit id token to login the newly sign up user. */
  var idToken: js.UndefOr[String] = js.undefined
  /** The fixed string "identitytoolkit#SetAccountInfoResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** The local ID of the user. */
  var localId: js.UndefOr[String] = js.undefined
  /** The new email the user attempts to change to. */
  var newEmail: js.UndefOr[String] = js.undefined
  /** The user's hashed password. */
  var passwordHash: js.UndefOr[String] = js.undefined
  /** The photo url of the user. */
  var photoUrl: js.UndefOr[String] = js.undefined
  /** The user's profiles at the associated IdPs. */
  var providerUserInfo: js.UndefOr[js.Array[DisplayName]] = js.undefined
  /** If idToken is STS id token, then this field will be refresh token. */
  var refreshToken: js.UndefOr[String] = js.undefined
}

object SetAccountInfoResponse {
  @scala.inline
  def apply(
    displayName: String = null,
    email: String = null,
    emailVerified: js.UndefOr[Boolean] = js.undefined,
    expiresIn: String = null,
    idToken: String = null,
    kind: String = null,
    localId: String = null,
    newEmail: String = null,
    passwordHash: String = null,
    photoUrl: String = null,
    providerUserInfo: js.Array[DisplayName] = null,
    refreshToken: String = null
  ): SetAccountInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(emailVerified)) __obj.updateDynamic("emailVerified")(emailVerified.get.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (localId != null) __obj.updateDynamic("localId")(localId.asInstanceOf[js.Any])
    if (newEmail != null) __obj.updateDynamic("newEmail")(newEmail.asInstanceOf[js.Any])
    if (passwordHash != null) __obj.updateDynamic("passwordHash")(passwordHash.asInstanceOf[js.Any])
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl.asInstanceOf[js.Any])
    if (providerUserInfo != null) __obj.updateDynamic("providerUserInfo")(providerUserInfo.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAccountInfoResponse]
  }
}

