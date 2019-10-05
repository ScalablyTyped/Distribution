package typings.firebase.firebaseMod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structure containing additional user information from a federated identity
  * provider.
  */
trait AdditionalUserInfo extends js.Object {
  var isNewUser: Boolean
  var profile: js.Object | Null
  var providerId: String
  var username: js.UndefOr[String | Null] = js.undefined
}

object AdditionalUserInfo {
  @scala.inline
  def apply(isNewUser: Boolean, providerId: String, profile: js.Object = null, username: String = null): AdditionalUserInfo = {
    val __obj = js.Dynamic.literal(isNewUser = isNewUser, providerId = providerId)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[AdditionalUserInfo]
  }
}

