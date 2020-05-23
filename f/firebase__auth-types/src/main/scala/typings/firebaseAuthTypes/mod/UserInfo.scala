package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  var displayName: String | Null
  var email: String | Null
  var phoneNumber: String | Null
  var photoURL: String | Null
  var providerId: String
  var uid: String
}

object UserInfo {
  @scala.inline
  def apply(
    providerId: String,
    uid: String,
    displayName: String = null,
    email: String = null,
    phoneNumber: String = null,
    photoURL: String = null
  ): UserInfo = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any], photoURL = photoURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
}

