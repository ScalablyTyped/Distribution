package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartyVerifyAssertionRequest extends js.Object {
  /**
    * When it's true, automatically creates a new account if the user doesn't exist. When it's false, allows existing user to sign in normally and throws
    * exception if the user doesn't exist.
    */
  var autoCreate: js.UndefOr[scala.Boolean] = js.undefined
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The GITKit token of the authenticated user. */
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  /** Instance id token of the app. */
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  /** The GITKit token for the non-trusted IDP pending to be confirmed by the user. */
  var pendingIdToken: js.UndefOr[java.lang.String] = js.undefined
  /** The post body if the request is a HTTP POST. */
  var postBody: js.UndefOr[java.lang.String] = js.undefined
  /** The URI to which the IDP redirects the user back. It may contain federated login result params added by the IDP. */
  var requestUri: js.UndefOr[java.lang.String] = js.undefined
  /** Whether return 200 and IDP credential rather than throw exception when federated id is already linked. */
  var returnIdpCredential: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to return refresh tokens. */
  var returnRefreshToken: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether return sts id token and refresh token instead of gitkit token. */
  var returnSecureToken: js.UndefOr[scala.Boolean] = js.undefined
  /** Session ID, which should match the one in previous createAuthUri request. */
  var sessionId: js.UndefOr[java.lang.String] = js.undefined
}

