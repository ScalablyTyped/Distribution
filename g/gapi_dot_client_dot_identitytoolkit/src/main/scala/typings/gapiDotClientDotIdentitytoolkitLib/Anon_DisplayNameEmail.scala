package typings
package gapiDotClientDotIdentitytoolkitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayNameEmail extends js.Object {
  /** The user's display name at the IDP. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** User's email at IDP. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** User's identifier at IDP. */
  var federatedId: js.UndefOr[java.lang.String] = js.undefined
  /** User's phone number. */
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The user's photo url at the IDP. */
  var photoUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The IdP ID. For white listed IdPs it's a short domain name, e.g., google.com, aol.com, live.net and yahoo.com. For other OpenID IdPs it's the OP
    * identifier.
    */
  var providerId: js.UndefOr[java.lang.String] = js.undefined
  /** User's raw identifier directly returned from IDP. */
  var rawId: js.UndefOr[java.lang.String] = js.undefined
  /** User's screen name at Twitter or login name at Github. */
  var screenName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DisplayNameEmail {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    email: java.lang.String = null,
    federatedId: java.lang.String = null,
    phoneNumber: java.lang.String = null,
    photoUrl: java.lang.String = null,
    providerId: java.lang.String = null,
    rawId: java.lang.String = null,
    screenName: java.lang.String = null
  ): Anon_DisplayNameEmail = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (federatedId != null) __obj.updateDynamic("federatedId")(federatedId)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl)
    if (providerId != null) __obj.updateDynamic("providerId")(providerId)
    if (rawId != null) __obj.updateDynamic("rawId")(rawId)
    if (screenName != null) __obj.updateDynamic("screenName")(screenName)
    __obj.asInstanceOf[Anon_DisplayNameEmail]
  }
}

