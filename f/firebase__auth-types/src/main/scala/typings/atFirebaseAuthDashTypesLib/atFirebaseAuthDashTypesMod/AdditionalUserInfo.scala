package typings
package atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalUserInfo extends js.Object {
  var isNewUser: scala.Boolean
  var profile: js.Object | scala.Null
  var providerId: java.lang.String
  var username: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object AdditionalUserInfo {
  @scala.inline
  def apply(
    isNewUser: scala.Boolean,
    providerId: java.lang.String,
    profile: js.Object = null,
    username: java.lang.String = null
  ): AdditionalUserInfo = {
    val __obj = js.Dynamic.literal(isNewUser = isNewUser, providerId = providerId)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[AdditionalUserInfo]
  }
}

