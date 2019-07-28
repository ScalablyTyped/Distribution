package typings.gapiDotClientDotIdentitytoolkit.gapiNs.clientNs.identitytoolkitNs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartyCreateAuthUriRequest extends js.Object {
  /** The app ID of the mobile app, base64(CERT_SHA1):PACKAGE_NAME for Android, BUNDLE_ID for iOS. */
  var appId: js.UndefOr[String] = js.undefined
  /** Explicitly specify the auth flow type. Currently only support "CODE_FLOW" type. The field is only used for Google provider. */
  var authFlowType: js.UndefOr[String] = js.undefined
  /** The relying party OAuth client ID. */
  var clientId: js.UndefOr[String] = js.undefined
  /** The opaque value used by the client to maintain context info between the authentication request and the IDP callback. */
  var context: js.UndefOr[String] = js.undefined
  /** The URI to which the IDP redirects the user after the federated login flow. */
  var continueUri: js.UndefOr[String] = js.undefined
  /**
    * The query parameter that client can customize by themselves in auth url. The following parameters are reserved for server so that they cannot be
    * customized by clients: client_id, response_type, scope, redirect_uri, state, oauth_token.
    */
  var customParameter: js.UndefOr[Record[String, String]] = js.undefined
  /** The hosted domain to restrict sign-in to accounts at that domain for Google Apps hosted accounts. */
  var hostedDomain: js.UndefOr[String] = js.undefined
  /** The email or federated ID of the user. */
  var identifier: js.UndefOr[String] = js.undefined
  /** The developer's consumer key for OpenId OAuth Extension */
  var oauthConsumerKey: js.UndefOr[String] = js.undefined
  /** Additional oauth scopes, beyond the basid user profile, that the user would be prompted to grant */
  var oauthScope: js.UndefOr[String] = js.undefined
  /** Optional realm for OpenID protocol. The sub string "scheme://domain:port" of the param "continueUri" is used if this is not set. */
  var openidRealm: js.UndefOr[String] = js.undefined
  /** The native app package for OTA installation. */
  var otaApp: js.UndefOr[String] = js.undefined
  /**
    * The IdP ID. For white listed IdPs it's a short domain name e.g. google.com, aol.com, live.net and yahoo.com. For other OpenID IdPs it's the OP
    * identifier.
    */
  var providerId: js.UndefOr[String] = js.undefined
  /** The session_id passed by client. */
  var sessionId: js.UndefOr[String] = js.undefined
}

object IdentitytoolkitRelyingpartyCreateAuthUriRequest {
  @scala.inline
  def apply(
    appId: String = null,
    authFlowType: String = null,
    clientId: String = null,
    context: String = null,
    continueUri: String = null,
    customParameter: Record[String, String] = null,
    hostedDomain: String = null,
    identifier: String = null,
    oauthConsumerKey: String = null,
    oauthScope: String = null,
    openidRealm: String = null,
    otaApp: String = null,
    providerId: String = null,
    sessionId: String = null
  ): IdentitytoolkitRelyingpartyCreateAuthUriRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (authFlowType != null) __obj.updateDynamic("authFlowType")(authFlowType)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (context != null) __obj.updateDynamic("context")(context)
    if (continueUri != null) __obj.updateDynamic("continueUri")(continueUri)
    if (customParameter != null) __obj.updateDynamic("customParameter")(customParameter)
    if (hostedDomain != null) __obj.updateDynamic("hostedDomain")(hostedDomain)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (oauthConsumerKey != null) __obj.updateDynamic("oauthConsumerKey")(oauthConsumerKey)
    if (oauthScope != null) __obj.updateDynamic("oauthScope")(oauthScope)
    if (openidRealm != null) __obj.updateDynamic("openidRealm")(openidRealm)
    if (otaApp != null) __obj.updateDynamic("otaApp")(otaApp)
    if (providerId != null) __obj.updateDynamic("providerId")(providerId)
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyCreateAuthUriRequest]
  }
}

