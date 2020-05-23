package typings.firebaseAdmin.authMod.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User provider data to include when importing a user.
  */
trait UserProviderRequest extends js.Object {
  /**
    * The display name for the linked provider.
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * The email for the linked provider.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * The phone number for the linked provider.
    */
  var phoneNumber: js.UndefOr[String] = js.undefined
  /**
    * The photo URL for the linked provider.
    */
  var photoURL: js.UndefOr[String] = js.undefined
  /**
    * The linked provider ID (for example, "google.com" for the Google provider).
    */
  var providerId: String
  /**
    * The user identifier for the linked provider.
    */
  var uid: String
}

object UserProviderRequest {
  @scala.inline
  def apply(
    providerId: String,
    uid: String,
    displayName: String = null,
    email: String = null,
    phoneNumber: String = null,
    photoURL: String = null
  ): UserProviderRequest = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (photoURL != null) __obj.updateDynamic("photoURL")(photoURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserProviderRequest]
  }
}

