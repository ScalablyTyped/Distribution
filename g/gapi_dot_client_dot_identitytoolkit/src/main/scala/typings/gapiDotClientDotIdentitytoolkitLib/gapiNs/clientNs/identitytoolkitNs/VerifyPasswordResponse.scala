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

