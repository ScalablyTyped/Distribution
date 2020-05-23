package typings.firebaseAdmin.admin.auth

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
    * The user's updated multi-factor related properties.
    */
  var multiFactor: js.UndefOr[typings.firebaseAdmin.authMod.admin.auth.MultiFactorUpdateSettings] = js.undefined
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
    displayName: js.UndefOr[Null | String] = js.undefined,
    email: String = null,
    emailVerified: js.UndefOr[Boolean] = js.undefined,
    multiFactor: typings.firebaseAdmin.authMod.admin.auth.MultiFactorUpdateSettings = null,
    password: String = null,
    phoneNumber: js.UndefOr[Null | String] = js.undefined,
    photoURL: js.UndefOr[Null | String] = js.undefined
  ): UpdateRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayName)) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(emailVerified)) __obj.updateDynamic("emailVerified")(emailVerified.get.asInstanceOf[js.Any])
    if (multiFactor != null) __obj.updateDynamic("multiFactor")(multiFactor.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(phoneNumber)) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(photoURL)) __obj.updateDynamic("photoURL")(photoURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRequest]
  }
}

