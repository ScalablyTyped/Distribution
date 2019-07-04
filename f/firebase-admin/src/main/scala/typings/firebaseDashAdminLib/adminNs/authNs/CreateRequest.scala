package typings
package firebaseDashAdminLib.adminNs.authNs

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
  var uid: js.UndefOr[java.lang.String] = js.undefined
}

object CreateRequest {
  @scala.inline
  def apply(
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    displayName: java.lang.String = null,
    email: java.lang.String = null,
    emailVerified: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    phoneNumber: java.lang.String = null,
    photoURL: java.lang.String = null,
    uid: java.lang.String = null
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

