package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartySetAccountInfoRequest extends js.Object {
  /** The captcha challenge. */
  var captchaChallenge: js.UndefOr[java.lang.String] = js.undefined
  /** Response to the captcha. */
  var captchaResponse: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp when the account is created. */
  var createdAt: js.UndefOr[java.lang.String] = js.undefined
  /** The custom attributes to be set in the user's id token. */
  var customAttributes: js.UndefOr[java.lang.String] = js.undefined
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The attributes users request to delete. */
  var deleteAttribute: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The IDPs the user request to delete. */
  var deleteProvider: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Whether to disable the user. */
  var disableUser: js.UndefOr[scala.Boolean] = js.undefined
  /** The name of the user. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The email of the user. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** Mark the email as verified or not. */
  var emailVerified: js.UndefOr[scala.Boolean] = js.undefined
  /** The GITKit token of the authenticated user. */
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  /** Instance id token of the app. */
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  /** Last login timestamp. */
  var lastLoginAt: js.UndefOr[java.lang.String] = js.undefined
  /** The local ID of the user. */
  var localId: js.UndefOr[java.lang.String] = js.undefined
  /** The out-of-band code of the change email request. */
  var oobCode: js.UndefOr[java.lang.String] = js.undefined
  /** The new password of the user. */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** Privileged caller can update user with specified phone number. */
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The photo url of the user. */
  var photoUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The associated IDPs of the user. */
  var provider: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Whether return sts id token and refresh token instead of gitkit token. */
  var returnSecureToken: js.UndefOr[scala.Boolean] = js.undefined
  /** Mark the user to upgrade to federated login. */
  var upgradeToFederatedLogin: js.UndefOr[scala.Boolean] = js.undefined
  /** Timestamp in seconds for valid login token. */
  var validSince: js.UndefOr[java.lang.String] = js.undefined
}

