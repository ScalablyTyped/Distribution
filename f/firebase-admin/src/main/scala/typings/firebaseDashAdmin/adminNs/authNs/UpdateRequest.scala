package typings.firebaseDashAdmin.adminNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the properties to update on the provided user.
  */
trait UpdateRequest extends js.Object {
  /**
    * Whether or not the user is disabled: `true` for disabled;
    * `false` for enabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The user's display name.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  /**
    * The user's primary email.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * Whether or not the user's primary email is verified.
    */
  var emailVerified: js.UndefOr[Boolean] = js.undefined
  /**
    * The user's unhashed password.
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * The user's primary phone number.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
  /**
    * The user's photo URL.
    */
  var photoURL: js.UndefOr[String | Null] = js.undefined
}

object UpdateRequest {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    email: String = null,
    emailVerified: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    phoneNumber: String = null,
    photoURL: String = null
  ): UpdateRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(emailVerified)) __obj.updateDynamic("emailVerified")(emailVerified)
    if (password != null) __obj.updateDynamic("password")(password)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (photoURL != null) __obj.updateDynamic("photoURL")(photoURL)
    __obj.asInstanceOf[UpdateRequest]
  }
}

