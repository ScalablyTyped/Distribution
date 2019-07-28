package typings.firebase.firebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User profile information, visible only to the Firebase project's
  * apps.
  *
  */
trait UserInfo extends js.Object {
  var displayName: String | Null
  var email: String | Null
  var phoneNumber: String | Null
  var photoURL: String | Null
  var providerId: String
  /**
    * The user's unique ID.
    */
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
    val __obj = js.Dynamic.literal(providerId = providerId, uid = uid)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (photoURL != null) __obj.updateDynamic("photoURL")(photoURL)
    __obj.asInstanceOf[UserInfo]
  }
}

