package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyPasswordResponse extends js.Object {
  /** The name of the user. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The email returned by the IdP. NOTE: The federated login user may not own the email. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** If idToken is STS id token, then this field will be expiration time of STS id token in seconds. */
  var expiresIn: js.UndefOr[java.lang.String] = js.undefined
  /** The GITKit token for authenticated user. */
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  /** The fixed string "identitytoolkit#VerifyPasswordResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The RP local ID if it's already been mapped to the IdP account identified by the federated ID. */
  var localId: js.UndefOr[java.lang.String] = js.undefined
  /** The OAuth2 access token. */
  var oauthAccessToken: js.UndefOr[java.lang.String] = js.undefined
  /** The OAuth2 authorization code. */
  var oauthAuthorizationCode: js.UndefOr[java.lang.String] = js.undefined
  /** The lifetime in seconds of the OAuth2 access token. */
  var oauthExpireIn: js.UndefOr[scala.Double] = js.undefined
  /** The URI of the user's photo at IdP */
  var photoUrl: js.UndefOr[java.lang.String] = js.undefined
  /** If idToken is STS id token, then this field will be refresh token. */
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the email is registered. */
  var registered: js.UndefOr[scala.Boolean] = js.undefined
}

object VerifyPasswordResponse {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    email: java.lang.String = null,
    expiresIn: java.lang.String = null,
    idToken: java.lang.String = null,
    kind: java.lang.String = null,
    localId: java.lang.String = null,
    oauthAccessToken: java.lang.String = null,
    oauthAuthorizationCode: java.lang.String = null,
    oauthExpireIn: scala.Int | scala.Double = null,
    photoUrl: java.lang.String = null,
    refreshToken: java.lang.String = null,
    registered: js.UndefOr[scala.Boolean] = js.undefined
  ): VerifyPasswordResponse = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn)
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (localId != null) __obj.updateDynamic("localId")(localId)
    if (oauthAccessToken != null) __obj.updateDynamic("oauthAccessToken")(oauthAccessToken)
    if (oauthAuthorizationCode != null) __obj.updateDynamic("oauthAuthorizationCode")(oauthAuthorizationCode)
    if (oauthExpireIn != null) __obj.updateDynamic("oauthExpireIn")(oauthExpireIn.asInstanceOf[js.Any])
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    if (!js.isUndefined(registered)) __obj.updateDynamic("registered")(registered)
    __obj.asInstanceOf[VerifyPasswordResponse]
  }
}

