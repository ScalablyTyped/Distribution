package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartyCreateAuthUriRequest extends js.Object {
  /** The app ID of the mobile app, base64(CERT_SHA1):PACKAGE_NAME for Android, BUNDLE_ID for iOS. */
  var appId: js.UndefOr[java.lang.String] = js.undefined
  /** Explicitly specify the auth flow type. Currently only support "CODE_FLOW" type. The field is only used for Google provider. */
  var authFlowType: js.UndefOr[java.lang.String] = js.undefined
  /** The relying party OAuth client ID. */
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  /** The opaque value used by the client to maintain context info between the authentication request and the IDP callback. */
  var context: js.UndefOr[java.lang.String] = js.undefined
  /** The URI to which the IDP redirects the user after the federated login flow. */
  var continueUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The query parameter that client can customize by themselves in auth url. The following parameters are reserved for server so that they cannot be
    * customized by clients: client_id, response_type, scope, redirect_uri, state, oauth_token.
    */
  var customParameter: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The hosted domain to restrict sign-in to accounts at that domain for Google Apps hosted accounts. */
  var hostedDomain: js.UndefOr[java.lang.String] = js.undefined
  /** The email or federated ID of the user. */
  var identifier: js.UndefOr[java.lang.String] = js.undefined
  /** The developer's consumer key for OpenId OAuth Extension */
  var oauthConsumerKey: js.UndefOr[java.lang.String] = js.undefined
  /** Additional oauth scopes, beyond the basid user profile, that the user would be prompted to grant */
  var oauthScope: js.UndefOr[java.lang.String] = js.undefined
  /** Optional realm for OpenID protocol. The sub string "scheme://domain:port" of the param "continueUri" is used if this is not set. */
  var openidRealm: js.UndefOr[java.lang.String] = js.undefined
  /** The native app package for OTA installation. */
  var otaApp: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The IdP ID. For white listed IdPs it's a short domain name e.g. google.com, aol.com, live.net and yahoo.com. For other OpenID IdPs it's the OP
    * identifier.
    */
  var providerId: js.UndefOr[java.lang.String] = js.undefined
  /** The session_id passed by client. */
  var sessionId: js.UndefOr[java.lang.String] = js.undefined
}

