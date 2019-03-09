package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

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
  var additionalUserInfo: js.UndefOr[AdditionalUserInfo | scala.Null] = js.undefined
  var credential: AuthCredential | scala.Null
  var operationType: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var user: firebaseLib.firebaseMod.firebaseNs.User | scala.Null
}

object UserCredential {
  @scala.inline
  def apply(
    additionalUserInfo: AdditionalUserInfo = null,
    credential: AuthCredential = null,
    operationType: java.lang.String = null,
    user: firebaseLib.firebaseMod.firebaseNs.User = null
  ): UserCredential = {
    val __obj = js.Dynamic.literal()
    if (additionalUserInfo != null) __obj.updateDynamic("additionalUserInfo")(additionalUserInfo)
    if (credential != null) __obj.updateDynamic("credential")(credential)
    if (operationType != null) __obj.updateDynamic("operationType")(operationType)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[UserCredential]
  }
}

