package typings.gapiDotClientDotIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyAssertionResponse extends js.Object {
  /** The action code. */
  var action: js.UndefOr[String] = js.undefined
  /** URL for OTA app installation. */
  var appInstallationUrl: js.UndefOr[String] = js.undefined
  /** The custom scheme used by mobile app. */
  var appScheme: js.UndefOr[String] = js.undefined
  /** The opaque value used by the client to maintain context info between the authentication request and the IDP callback. */
  var context: js.UndefOr[String] = js.undefined
  /** The birth date of the IdP account. */
  var dateOfBirth: js.UndefOr[String] = js.undefined
  /** The display name of the user. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The email returned by the IdP. NOTE: The federated login user may not own the email. */
  var email: js.UndefOr[String] = js.undefined
  /** It's true if the email is recycled. */
  var emailRecycled: js.UndefOr[Boolean] = js.undefined
  /** The value is true if the IDP is also the email provider. It means the user owns the email. */
  var emailVerified: js.UndefOr[Boolean] = js.undefined
  /** Client error code. */
  var errorMessage: js.UndefOr[String] = js.undefined
  /** If idToken is STS id token, then this field will be expiration time of STS id token in seconds. */
  var expiresIn: js.UndefOr[String] = js.undefined
  /** The unique ID identifies the IdP account. */
  var federatedId: js.UndefOr[String] = js.undefined
  /** The first name of the user. */
  var firstName: js.UndefOr[String] = js.undefined
  /** The full name of the user. */
  var fullName: js.UndefOr[String] = js.undefined
  /** The ID token. */
  var idToken: js.UndefOr[String] = js.undefined
  /**
    * It's the identifier param in the createAuthUri request if the identifier is an email. It can be used to check whether the user input email is different
    * from the asserted email.
    */
  var inputEmail: js.UndefOr[String] = js.undefined
  /** True if it's a new user sign-in, false if it's a returning user. */
  var isNewUser: js.UndefOr[Boolean] = js.undefined
  /** The fixed string "identitytoolkit#VerifyAssertionResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** The language preference of the user. */
  var language: js.UndefOr[String] = js.undefined
  /** The last name of the user. */
  var lastName: js.UndefOr[String] = js.undefined
  /** The RP local ID if it's already been mapped to the IdP account identified by the federated ID. */
  var localId: js.UndefOr[String] = js.undefined
  /** Whether the assertion is from a non-trusted IDP and need account linking confirmation. */
  var needConfirmation: js.UndefOr[Boolean] = js.undefined
  /** Whether need client to supply email to complete the federated login flow. */
  var needEmail: js.UndefOr[Boolean] = js.undefined
  /** The nick name of the user. */
  var nickName: js.UndefOr[String] = js.undefined
  /** The OAuth2 access token. */
  var oauthAccessToken: js.UndefOr[String] = js.undefined
  /** The OAuth2 authorization code. */
  var oauthAuthorizationCode: js.UndefOr[String] = js.undefined
  /** The lifetime in seconds of the OAuth2 access token. */
  var oauthExpireIn: js.UndefOr[Double] = js.undefined
  /** The OIDC id token. */
  var oauthIdToken: js.UndefOr[String] = js.undefined
  /** The user approved request token for the OpenID OAuth extension. */
  var oauthRequestToken: js.UndefOr[String] = js.undefined
  /** The scope for the OpenID OAuth extension. */
  var oauthScope: js.UndefOr[String] = js.undefined
  /** The OAuth1 access token secret. */
  var oauthTokenSecret: js.UndefOr[String] = js.undefined
  /** The original email stored in the mapping storage. It's returned when the federated ID is associated to a different email. */
  var originalEmail: js.UndefOr[String] = js.undefined
  /** The URI of the public accessible profiel picture. */
  var photoUrl: js.UndefOr[String] = js.undefined
  /**
    * The IdP ID. For white listed IdPs it's a short domain name e.g. google.com, aol.com, live.net and yahoo.com. If the "providerId" param is set to OpenID
    * OP identifer other than the whilte listed IdPs the OP identifier is returned. If the "identifier" param is federated ID in the createAuthUri request.
    * The domain part of the federated ID is returned.
    */
  var providerId: js.UndefOr[String] = js.undefined
  /** Raw IDP-returned user info. */
  var rawUserInfo: js.UndefOr[String] = js.undefined
  /** If idToken is STS id token, then this field will be refresh token. */
  var refreshToken: js.UndefOr[String] = js.undefined
  /** The screen_name of a Twitter user or the login name at Github. */
  var screenName: js.UndefOr[String] = js.undefined
  /** The timezone of the user. */
  var timeZone: js.UndefOr[String] = js.undefined
  /** When action is 'map', contains the idps which can be used for confirmation. */
  var verifiedProvider: js.UndefOr[js.Array[String]] = js.undefined
}

object VerifyAssertionResponse {
  @scala.inline
  def apply(
    action: String = null,
    appInstallationUrl: String = null,
    appScheme: String = null,
    context: String = null,
    dateOfBirth: String = null,
    displayName: String = null,
    email: String = null,
    emailRecycled: js.UndefOr[Boolean] = js.undefined,
    emailVerified: js.UndefOr[Boolean] = js.undefined,
    errorMessage: String = null,
    expiresIn: String = null,
    federatedId: String = null,
    firstName: String = null,
    fullName: String = null,
    idToken: String = null,
    inputEmail: String = null,
    isNewUser: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    language: String = null,
    lastName: String = null,
    localId: String = null,
    needConfirmation: js.UndefOr[Boolean] = js.undefined,
    needEmail: js.UndefOr[Boolean] = js.undefined,
    nickName: String = null,
    oauthAccessToken: String = null,
    oauthAuthorizationCode: String = null,
    oauthExpireIn: Int | Double = null,
    oauthIdToken: String = null,
    oauthRequestToken: String = null,
    oauthScope: String = null,
    oauthTokenSecret: String = null,
    originalEmail: String = null,
    photoUrl: String = null,
    providerId: String = null,
    rawUserInfo: String = null,
    refreshToken: String = null,
    screenName: String = null,
    timeZone: String = null,
    verifiedProvider: js.Array[String] = null
  ): VerifyAssertionResponse = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (appInstallationUrl != null) __obj.updateDynamic("appInstallationUrl")(appInstallationUrl.asInstanceOf[js.Any])
    if (appScheme != null) __obj.updateDynamic("appScheme")(appScheme.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (dateOfBirth != null) __obj.updateDynamic("dateOfBirth")(dateOfBirth.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(emailRecycled)) __obj.updateDynamic("emailRecycled")(emailRecycled.asInstanceOf[js.Any])
    if (!js.isUndefined(emailVerified)) __obj.updateDynamic("emailVerified")(emailVerified.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (federatedId != null) __obj.updateDynamic("federatedId")(federatedId.asInstanceOf[js.Any])
    if (firstName != null) __obj.updateDynamic("firstName")(firstName.asInstanceOf[js.Any])
    if (fullName != null) __obj.updateDynamic("fullName")(fullName.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (inputEmail != null) __obj.updateDynamic("inputEmail")(inputEmail.asInstanceOf[js.Any])
    if (!js.isUndefined(isNewUser)) __obj.updateDynamic("isNewUser")(isNewUser.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (lastName != null) __obj.updateDynamic("lastName")(lastName.asInstanceOf[js.Any])
    if (localId != null) __obj.updateDynamic("localId")(localId.asInstanceOf[js.Any])
    if (!js.isUndefined(needConfirmation)) __obj.updateDynamic("needConfirmation")(needConfirmation.asInstanceOf[js.Any])
    if (!js.isUndefined(needEmail)) __obj.updateDynamic("needEmail")(needEmail.asInstanceOf[js.Any])
    if (nickName != null) __obj.updateDynamic("nickName")(nickName.asInstanceOf[js.Any])
    if (oauthAccessToken != null) __obj.updateDynamic("oauthAccessToken")(oauthAccessToken.asInstanceOf[js.Any])
    if (oauthAuthorizationCode != null) __obj.updateDynamic("oauthAuthorizationCode")(oauthAuthorizationCode.asInstanceOf[js.Any])
    if (oauthExpireIn != null) __obj.updateDynamic("oauthExpireIn")(oauthExpireIn.asInstanceOf[js.Any])
    if (oauthIdToken != null) __obj.updateDynamic("oauthIdToken")(oauthIdToken.asInstanceOf[js.Any])
    if (oauthRequestToken != null) __obj.updateDynamic("oauthRequestToken")(oauthRequestToken.asInstanceOf[js.Any])
    if (oauthScope != null) __obj.updateDynamic("oauthScope")(oauthScope.asInstanceOf[js.Any])
    if (oauthTokenSecret != null) __obj.updateDynamic("oauthTokenSecret")(oauthTokenSecret.asInstanceOf[js.Any])
    if (originalEmail != null) __obj.updateDynamic("originalEmail")(originalEmail.asInstanceOf[js.Any])
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl.asInstanceOf[js.Any])
    if (providerId != null) __obj.updateDynamic("providerId")(providerId.asInstanceOf[js.Any])
    if (rawUserInfo != null) __obj.updateDynamic("rawUserInfo")(rawUserInfo.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    if (screenName != null) __obj.updateDynamic("screenName")(screenName.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (verifiedProvider != null) __obj.updateDynamic("verifiedProvider")(verifiedProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyAssertionResponse]
  }
}

