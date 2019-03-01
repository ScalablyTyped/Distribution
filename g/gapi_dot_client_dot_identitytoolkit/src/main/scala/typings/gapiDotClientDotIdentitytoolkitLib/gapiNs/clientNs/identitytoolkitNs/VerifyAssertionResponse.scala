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

object VerifyAssertionResponse {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    appInstallationUrl: java.lang.String = null,
    appScheme: java.lang.String = null,
    context: java.lang.String = null,
    dateOfBirth: java.lang.String = null,
    displayName: java.lang.String = null,
    email: java.lang.String = null,
    emailRecycled: js.UndefOr[scala.Boolean] = js.undefined,
    emailVerified: js.UndefOr[scala.Boolean] = js.undefined,
    errorMessage: java.lang.String = null,
    expiresIn: java.lang.String = null,
    federatedId: java.lang.String = null,
    firstName: java.lang.String = null,
    fullName: java.lang.String = null,
    idToken: java.lang.String = null,
    inputEmail: java.lang.String = null,
    isNewUser: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    language: java.lang.String = null,
    lastName: java.lang.String = null,
    localId: java.lang.String = null,
    needConfirmation: js.UndefOr[scala.Boolean] = js.undefined,
    needEmail: js.UndefOr[scala.Boolean] = js.undefined,
    nickName: java.lang.String = null,
    oauthAccessToken: java.lang.String = null,
    oauthAuthorizationCode: java.lang.String = null,
    oauthExpireIn: scala.Int | scala.Double = null,
    oauthIdToken: java.lang.String = null,
    oauthRequestToken: java.lang.String = null,
    oauthScope: java.lang.String = null,
    oauthTokenSecret: java.lang.String = null,
    originalEmail: java.lang.String = null,
    photoUrl: java.lang.String = null,
    providerId: java.lang.String = null,
    rawUserInfo: java.lang.String = null,
    refreshToken: java.lang.String = null,
    screenName: java.lang.String = null,
    timeZone: java.lang.String = null,
    verifiedProvider: js.Array[java.lang.String] = null
  ): VerifyAssertionResponse = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (appInstallationUrl != null) __obj.updateDynamic("appInstallationUrl")(appInstallationUrl)
    if (appScheme != null) __obj.updateDynamic("appScheme")(appScheme)
    if (context != null) __obj.updateDynamic("context")(context)
    if (dateOfBirth != null) __obj.updateDynamic("dateOfBirth")(dateOfBirth)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(emailRecycled)) __obj.updateDynamic("emailRecycled")(emailRecycled)
    if (!js.isUndefined(emailVerified)) __obj.updateDynamic("emailVerified")(emailVerified)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn)
    if (federatedId != null) __obj.updateDynamic("federatedId")(federatedId)
    if (firstName != null) __obj.updateDynamic("firstName")(firstName)
    if (fullName != null) __obj.updateDynamic("fullName")(fullName)
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (inputEmail != null) __obj.updateDynamic("inputEmail")(inputEmail)
    if (!js.isUndefined(isNewUser)) __obj.updateDynamic("isNewUser")(isNewUser)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (language != null) __obj.updateDynamic("language")(language)
    if (lastName != null) __obj.updateDynamic("lastName")(lastName)
    if (localId != null) __obj.updateDynamic("localId")(localId)
    if (!js.isUndefined(needConfirmation)) __obj.updateDynamic("needConfirmation")(needConfirmation)
    if (!js.isUndefined(needEmail)) __obj.updateDynamic("needEmail")(needEmail)
    if (nickName != null) __obj.updateDynamic("nickName")(nickName)
    if (oauthAccessToken != null) __obj.updateDynamic("oauthAccessToken")(oauthAccessToken)
    if (oauthAuthorizationCode != null) __obj.updateDynamic("oauthAuthorizationCode")(oauthAuthorizationCode)
    if (oauthExpireIn != null) __obj.updateDynamic("oauthExpireIn")(oauthExpireIn.asInstanceOf[js.Any])
    if (oauthIdToken != null) __obj.updateDynamic("oauthIdToken")(oauthIdToken)
    if (oauthRequestToken != null) __obj.updateDynamic("oauthRequestToken")(oauthRequestToken)
    if (oauthScope != null) __obj.updateDynamic("oauthScope")(oauthScope)
    if (oauthTokenSecret != null) __obj.updateDynamic("oauthTokenSecret")(oauthTokenSecret)
    if (originalEmail != null) __obj.updateDynamic("originalEmail")(originalEmail)
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl)
    if (providerId != null) __obj.updateDynamic("providerId")(providerId)
    if (rawUserInfo != null) __obj.updateDynamic("rawUserInfo")(rawUserInfo)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    if (screenName != null) __obj.updateDynamic("screenName")(screenName)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    if (verifiedProvider != null) __obj.updateDynamic("verifiedProvider")(verifiedProvider)
    __obj.asInstanceOf[VerifyAssertionResponse]
  }
}

