package typings.atFirebaseAuthDashTypes.atFirebaseAuthDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserCredential extends js.Object {
  var additionalUserInfo: js.UndefOr[AdditionalUserInfo | Null] = js.undefined
  var credential: AuthCredential | Null
  var operationType: js.UndefOr[String | Null] = js.undefined
  var user: User | Null
}

object UserCredential {
  @scala.inline
  def apply(
    additionalUserInfo: AdditionalUserInfo = null,
    credential: AuthCredential = null,
    operationType: String = null,
    user: User = null
  ): UserCredential = {
    val __obj = js.Dynamic.literal()
    if (additionalUserInfo != null) __obj.updateDynamic("additionalUserInfo")(additionalUserInfo.asInstanceOf[js.Any])
    if (credential != null) __obj.updateDynamic("credential")(credential.asInstanceOf[js.Any])
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserCredential]
  }
}

