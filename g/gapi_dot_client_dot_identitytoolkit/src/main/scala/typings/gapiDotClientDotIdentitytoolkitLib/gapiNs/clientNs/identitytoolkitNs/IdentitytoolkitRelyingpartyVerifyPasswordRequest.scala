package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartyVerifyPasswordRequest extends js.Object {
  /** The captcha challenge. */
  var captchaChallenge: js.UndefOr[java.lang.String] = js.undefined
  /** Response to the captcha. */
  var captchaResponse: js.UndefOr[java.lang.String] = js.undefined
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The email of the user. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** The GITKit token of the authenticated user. */
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  /** Instance id token of the app. */
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  /** The password inputed by the user. */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** The GITKit token for the non-trusted IDP, which is to be confirmed by the user. */
  var pendingIdToken: js.UndefOr[java.lang.String] = js.undefined
  /** Whether return sts id token and refresh token instead of gitkit token. */
  var returnSecureToken: js.UndefOr[scala.Boolean] = js.undefined
}

object IdentitytoolkitRelyingpartyVerifyPasswordRequest {
  @scala.inline
  def apply(
    captchaChallenge: java.lang.String = null,
    captchaResponse: java.lang.String = null,
    delegatedProjectNumber: java.lang.String = null,
    email: java.lang.String = null,
    idToken: java.lang.String = null,
    instanceId: java.lang.String = null,
    password: java.lang.String = null,
    pendingIdToken: java.lang.String = null,
    returnSecureToken: js.UndefOr[scala.Boolean] = js.undefined
  ): IdentitytoolkitRelyingpartyVerifyPasswordRequest = {
    val __obj = js.Dynamic.literal()
    if (captchaChallenge != null) __obj.updateDynamic("captchaChallenge")(captchaChallenge)
    if (captchaResponse != null) __obj.updateDynamic("captchaResponse")(captchaResponse)
    if (delegatedProjectNumber != null) __obj.updateDynamic("delegatedProjectNumber")(delegatedProjectNumber)
    if (email != null) __obj.updateDynamic("email")(email)
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId)
    if (password != null) __obj.updateDynamic("password")(password)
    if (pendingIdToken != null) __obj.updateDynamic("pendingIdToken")(pendingIdToken)
    if (!js.isUndefined(returnSecureToken)) __obj.updateDynamic("returnSecureToken")(returnSecureToken)
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyVerifyPasswordRequest]
  }
}

