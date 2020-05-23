package typings.firebaseAdmin.authMod.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the properties to set on a new user record to be
  * created.
  */
trait CreateRequest extends UpdateRequest {
  /**
    * The user's multi-factor related properties.
    */
  @JSName("multiFactor")
  var multiFactor_CreateRequest: js.UndefOr[MultiFactorCreateSettings] = js.undefined
  /**
    * The user's `uid`.
    */
  var uid: js.UndefOr[String] = js.undefined
}

object CreateRequest {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayName: js.UndefOr[Null | String] = js.undefined,
    email: String = null,
    emailVerified: js.UndefOr[Boolean] = js.undefined,
    multiFactor: MultiFactorCreateSettings = null,
    password: String = null,
    phoneNumber: js.UndefOr[Null | String] = js.undefined,
    photoURL: js.UndefOr[Null | String] = js.undefined,
    uid: String = null
  ): CreateRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayName)) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(emailVerified)) __obj.updateDynamic("emailVerified")(emailVerified.get.asInstanceOf[js.Any])
    if (multiFactor != null) __obj.updateDynamic("multiFactor")(multiFactor.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(phoneNumber)) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(photoURL)) __obj.updateDynamic("photoURL")(photoURL.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRequest]
  }
}

