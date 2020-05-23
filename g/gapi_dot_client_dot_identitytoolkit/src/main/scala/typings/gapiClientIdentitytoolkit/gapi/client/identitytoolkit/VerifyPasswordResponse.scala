package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyPasswordResponse extends js.Object {
  /** The name of the user. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The email returned by the IdP. NOTE: The federated login user may not own the email. */
  var email: js.UndefOr[String] = js.undefined
  /** If idToken is STS id token, then this field will be expiration time of STS id token in seconds. */
  var expiresIn: js.UndefOr[String] = js.undefined
  /** The GITKit token for authenticated user. */
  var idToken: js.UndefOr[String] = js.undefined
  /** The fixed string "identitytoolkit#VerifyPasswordResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** The RP local ID if it's already been mapped to the IdP account identified by the federated ID. */
  var localId: js.UndefOr[String] = js.undefined
  /** The OAuth2 access token. */
  var oauthAccessToken: js.UndefOr[String] = js.undefined
  /** The OAuth2 authorization code. */
  var oauthAuthorizationCode: js.UndefOr[String] = js.undefined
  /** The lifetime in seconds of the OAuth2 access token. */
  var oauthExpireIn: js.UndefOr[Double] = js.undefined
  /** The URI of the user's photo at IdP */
  var photoUrl: js.UndefOr[String] = js.undefined
  /** If idToken is STS id token, then this field will be refresh token. */
  var refreshToken: js.UndefOr[String] = js.undefined
  /** Whether the email is registered. */
  var registered: js.UndefOr[Boolean] = js.undefined
}

object VerifyPasswordResponse {
  @scala.inline
  def apply(
    displayName: String = null,
    email: String = null,
    expiresIn: String = null,
    idToken: String = null,
    kind: String = null,
    localId: String = null,
    oauthAccessToken: String = null,
    oauthAuthorizationCode: String = null,
    oauthExpireIn: js.UndefOr[Double] = js.undefined,
    photoUrl: String = null,
    refreshToken: String = null,
    registered: js.UndefOr[Boolean] = js.undefined
  ): VerifyPasswordResponse = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (localId != null) __obj.updateDynamic("localId")(localId.asInstanceOf[js.Any])
    if (oauthAccessToken != null) __obj.updateDynamic("oauthAccessToken")(oauthAccessToken.asInstanceOf[js.Any])
    if (oauthAuthorizationCode != null) __obj.updateDynamic("oauthAuthorizationCode")(oauthAuthorizationCode.asInstanceOf[js.Any])
    if (!js.isUndefined(oauthExpireIn)) __obj.updateDynamic("oauthExpireIn")(oauthExpireIn.get.asInstanceOf[js.Any])
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    if (!js.isUndefined(registered)) __obj.updateDynamic("registered")(registered.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyPasswordResponse]
  }
}

