package typings.firebase.mod.auth

import typings.firebase.mod.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structure containing a User, an AuthCredential, the operationType, and
  * any additional user information that was returned from the identity provider.
  * operationType could be 'signIn' for a sign-in operation, 'link' for a linking
  * operation and 'reauthenticate' for a reauthentication operation.
  */
trait UserCredential extends js.Object {
  var additionalUserInfo: js.UndefOr[AdditionalUserInfo | Null] = js.undefined
  var credential: AuthCredential | Null
  var operationType: js.UndefOr[String | Null] = js.undefined
  var user: User | Null
}

object UserCredential {
  @scala.inline
  def apply(
    additionalUserInfo: js.UndefOr[Null | AdditionalUserInfo] = js.undefined,
    credential: AuthCredential = null,
    operationType: js.UndefOr[Null | String] = js.undefined,
    user: User = null
  ): UserCredential = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    if (!js.isUndefined(additionalUserInfo)) __obj.updateDynamic("additionalUserInfo")(additionalUserInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(operationType)) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserCredential]
  }
}

