package typings
package firebaseLib.firebaseMod.firebaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User profile information, visible only to the Firebase project's
  * apps.
  *
  */
trait UserInfo extends js.Object {
  var displayName: java.lang.String | scala.Null
  var email: java.lang.String | scala.Null
  var phoneNumber: java.lang.String | scala.Null
  var photoURL: java.lang.String | scala.Null
  var providerId: java.lang.String
  /**
    * The user's unique ID.
    */
  var uid: java.lang.String
}

object UserInfo {
  @scala.inline
  def apply(
    providerId: java.lang.String,
    uid: java.lang.String,
    displayName: java.lang.String = null,
    email: java.lang.String = null,
    phoneNumber: java.lang.String = null,
    photoURL: java.lang.String = null
  ): UserInfo = {
    val __obj = js.Dynamic.literal(providerId = providerId, uid = uid)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (photoURL != null) __obj.updateDynamic("photoURL")(photoURL)
    __obj.asInstanceOf[UserInfo]
  }
}

