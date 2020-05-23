package typings.firebase.mod.auth

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
  def apply(
    isNewUser: Boolean,
    providerId: String,
    profile: js.Object = null,
    username: js.UndefOr[Null | String] = js.undefined
  ): AdditionalUserInfo = {
    val __obj = js.Dynamic.literal(isNewUser = isNewUser.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    if (!js.isUndefined(username)) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalUserInfo]
  }
}

