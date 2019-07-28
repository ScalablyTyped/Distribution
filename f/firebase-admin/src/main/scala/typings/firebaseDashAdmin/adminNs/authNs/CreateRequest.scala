package typings.firebaseDashAdmin.adminNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing the properties to set on a new user record to be
  * created.
  */
trait CreateRequest extends UpdateRequest {
  /**
    * The user's `uid`.
    */
  var uid: js.UndefOr[String] = js.undefined
}

object CreateRequest {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    email: String = null,
    emailVerified: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    phoneNumber: String = null,
    photoURL: String = null,
    uid: String = null
  ): CreateRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(emailVerified)) __obj.updateDynamic("emailVerified")(emailVerified)
    if (password != null) __obj.updateDynamic("password")(password)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (photoURL != null) __obj.updateDynamic("photoURL")(photoURL)
    if (uid != null) __obj.updateDynamic("uid")(uid)
    __obj.asInstanceOf[CreateRequest]
  }
}

