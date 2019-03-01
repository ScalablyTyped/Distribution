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

object IdentitytoolkitRelyingpartyVerifyAssertionRequest {
  @scala.inline
  def apply(
    autoCreate: js.UndefOr[scala.Boolean] = js.undefined,
    delegatedProjectNumber: java.lang.String = null,
    idToken: java.lang.String = null,
    instanceId: java.lang.String = null,
    pendingIdToken: java.lang.String = null,
    postBody: java.lang.String = null,
    requestUri: java.lang.String = null,
    returnIdpCredential: js.UndefOr[scala.Boolean] = js.undefined,
    returnRefreshToken: js.UndefOr[scala.Boolean] = js.undefined,
    returnSecureToken: js.UndefOr[scala.Boolean] = js.undefined,
    sessionId: java.lang.String = null
  ): IdentitytoolkitRelyingpartyVerifyAssertionRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCreate)) __obj.updateDynamic("autoCreate")(autoCreate)
    if (delegatedProjectNumber != null) __obj.updateDynamic("delegatedProjectNumber")(delegatedProjectNumber)
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId)
    if (pendingIdToken != null) __obj.updateDynamic("pendingIdToken")(pendingIdToken)
    if (postBody != null) __obj.updateDynamic("postBody")(postBody)
    if (requestUri != null) __obj.updateDynamic("requestUri")(requestUri)
    if (!js.isUndefined(returnIdpCredential)) __obj.updateDynamic("returnIdpCredential")(returnIdpCredential)
    if (!js.isUndefined(returnRefreshToken)) __obj.updateDynamic("returnRefreshToken")(returnRefreshToken)
    if (!js.isUndefined(returnSecureToken)) __obj.updateDynamic("returnSecureToken")(returnSecureToken)
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyVerifyAssertionRequest]
  }
}

