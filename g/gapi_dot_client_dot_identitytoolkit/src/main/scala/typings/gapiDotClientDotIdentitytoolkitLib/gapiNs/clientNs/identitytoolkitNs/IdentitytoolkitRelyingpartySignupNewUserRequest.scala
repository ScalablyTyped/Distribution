package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IdentitytoolkitRelyingpartySignupNewUserRequest extends js.Object {
  /** The captcha challenge. */
  var captchaChallenge: js.UndefOr[java.lang.String] = js.undefined
  /** Response to the captcha. */
  var captchaResponse: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to disable the user. Only can be used by service account. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** The name of the user. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The email of the user. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** Mark the email as verified or not. Only can be used by service account. */
  var emailVerified: js.UndefOr[scala.Boolean] = js.undefined
  /** The GITKit token of the authenticated user. */
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  /** Instance id token of the app. */
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  /** Privileged caller can create user with specified user id. */
  var localId: js.UndefOr[java.lang.String] = js.undefined
  /** The new password of the user. */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** Privileged caller can create user with specified phone number. */
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The photo url of the user. */
  var photoUrl: js.UndefOr[java.lang.String] = js.undefined
}

