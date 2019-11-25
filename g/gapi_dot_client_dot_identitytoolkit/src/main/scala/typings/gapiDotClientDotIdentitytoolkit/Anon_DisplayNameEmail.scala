package typings.gapiDotClientDotIdentitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayNameEmail extends js.Object {
  /** The user's display name at the IDP. */
  var displayName: js.UndefOr[String] = js.undefined
  /** User's email at IDP. */
  var email: js.UndefOr[String] = js.undefined
  /** User's identifier at IDP. */
  var federatedId: js.UndefOr[String] = js.undefined
  /** User's phone number. */
  var phoneNumber: js.UndefOr[String] = js.undefined
  /** The user's photo url at the IDP. */
  var photoUrl: js.UndefOr[String] = js.undefined
  /**
    * The IdP ID. For white listed IdPs it's a short domain name, e.g., google.com, aol.com, live.net and yahoo.com. For other OpenID IdPs it's the OP
    * identifier.
    */
  var providerId: js.UndefOr[String] = js.undefined
  /** User's raw identifier directly returned from IDP. */
  var rawId: js.UndefOr[String] = js.undefined
  /** User's screen name at Twitter or login name at Github. */
  var screenName: js.UndefOr[String] = js.undefined
}

object Anon_DisplayNameEmail {
  @scala.inline
  def apply(
    displayName: String = null,
    email: String = null,
    federatedId: String = null,
    phoneNumber: String = null,
    photoUrl: String = null,
    providerId: String = null,
    rawId: String = null,
    screenName: String = null
  ): Anon_DisplayNameEmail = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (federatedId != null) __obj.updateDynamic("federatedId")(federatedId.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl.asInstanceOf[js.Any])
    if (providerId != null) __obj.updateDynamic("providerId")(providerId.asInstanceOf[js.Any])
    if (rawId != null) __obj.updateDynamic("rawId")(rawId.asInstanceOf[js.Any])
    if (screenName != null) __obj.updateDynamic("screenName")(screenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DisplayNameEmail]
  }
}

