package typings
package firebaseDashAdminLib.adminNs.authNs

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
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The user's display name.
    */
  var displayName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The user's primary email.
    */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether or not the user's primary email is verified.
    */
  var emailVerified: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The user's unhashed password.
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The user's primary phone number.
    */
  var phoneNumber: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The user's photo URL.
    */
  var photoURL: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object UpdateRequest {
  @scala.inline
  def apply(
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    displayName: java.lang.String = null,
    email: java.lang.String = null,
    emailVerified: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    phoneNumber: java.lang.String = null,
    photoURL: java.lang.String = null
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

