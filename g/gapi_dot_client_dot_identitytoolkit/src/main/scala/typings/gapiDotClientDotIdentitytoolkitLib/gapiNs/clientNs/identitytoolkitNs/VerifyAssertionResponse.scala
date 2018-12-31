package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyAssertionResponse extends js.Object {
  /** The action code. */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** URL for OTA app installation. */
  var appInstallationUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The custom scheme used by mobile app. */
  var appScheme: js.UndefOr[java.lang.String] = js.undefined
  /** The opaque value used by the client to maintain context info between the authentication request and the IDP callback. */
  var context: js.UndefOr[java.lang.String] = js.undefined
  /** The birth date of the IdP account. */
  var dateOfBirth: js.UndefOr[java.lang.String] = js.undefined
  /** The display name of the user. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The email returned by the IdP. NOTE: The federated login user may not own the email. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** It's true if the email is recycled. */
  var emailRecycled: js.UndefOr[scala.Boolean] = js.undefined
  /** The value is true if the IDP is also the email provider. It means the user owns the email. */
  var emailVerified: js.UndefOr[scala.Boolean] = js.undefined
  /** Client error code. */
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  /** If idToken is STS id token, then this field will be expiration time of STS id token in seconds. */
  var expiresIn: js.UndefOr[java.lang.String] = js.undefined
  /** The unique ID identifies the IdP account. */
  var federatedId: js.UndefOr[java.lang.String] = js.undefined
  /** The first name of the user. */
  var firstName: js.UndefOr[java.lang.String] = js.undefined
  /** The full name of the user. */
  var fullName: js.UndefOr[java.lang.String] = js.undefined
  /** The ID token. */
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * It's the identifier param in the createAuthUri request if the identifier is an email. It can be used to check whether the user input email is different
    * from the asserted email.
    */
  var inputEmail: js.UndefOr[java.lang.String] = js.undefined
  /** True if it's a new user sign-in, false if it's a returning user. */
  var isNewUser: js.UndefOr[scala.Boolean] = js.undefined
  /** The fixed string "identitytoolkit#VerifyAssertionResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The language preference of the user. */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /** The last name of the user. */
  var lastName: js.UndefOr[java.lang.String] = js.undefined
  /** The RP local ID if it's already been mapped to the IdP account identified by the federated ID. */
  var localId: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the assertion is from a non-trusted IDP and need account linking confirmation. */
  var needConfirmation: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether need client to supply email to complete the federated login flow. */
  var needEmail: js.UndefOr[scala.Boolean] = js.undefined
  /** The nick name of the user. */
  var nickName: js.UndefOr[java.lang.String] = js.undefined
  /** The OAuth2 access token. */
  var oauthAccessToken: js.UndefOr[java.lang.String] = js.undefined
  /** The OAuth2 authorization code. */
  var oauthAuthorizationCode: js.UndefOr[java.lang.String] = js.undefined
  /** The lifetime in seconds of the OAuth2 access token. */
  var oauthExpireIn: js.UndefOr[scala.Double] = js.undefined
  /** The OIDC id token. */
  var oauthIdToken: js.UndefOr[java.lang.String] = js.undefined
  /** The user approved request token for the OpenID OAuth extension. */
  var oauthRequestToken: js.UndefOr[java.lang.String] = js.undefined
  /** The scope for the OpenID OAuth extension. */
  var oauthScope: js.UndefOr[java.lang.String] = js.undefined
  /** The OAuth1 access token secret. */
  var oauthTokenSecret: js.UndefOr[java.lang.String] = js.undefined
  /** The original email stored in the mapping storage. It's returned when the federated ID is associated to a different email. */
  var originalEmail: js.UndefOr[java.lang.String] = js.undefined
  /** The URI of the public accessible profiel picture. */
  var photoUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The IdP ID. For white listed IdPs it's a short domain name e.g. google.com, aol.com, live.net and yahoo.com. If the "providerId" param is set to OpenID
    * OP identifer other than the whilte listed IdPs the OP identifier is returned. If the "identifier" param is federated ID in the createAuthUri request.
    * The domain part of the federated ID is returned.
    */
  var providerId: js.UndefOr[java.lang.String] = js.undefined
  /** Raw IDP-returned user info. */
  var rawUserInfo: js.UndefOr[java.lang.String] = js.undefined
  /** If idToken is STS id token, then this field will be refresh token. */
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
  /** The screen_name of a Twitter user or the login name at Github. */
  var screenName: js.UndefOr[java.lang.String] = js.undefined
  /** The timezone of the user. */
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
  /** When action is 'map', contains the idps which can be used for confirmation. */
  var verifiedProvider: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

