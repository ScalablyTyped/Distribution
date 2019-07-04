package typings
package firebaseDashAdminLib.adminNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a user's info from a third-party identity provider
  * such as Google or Facebook.
  */
trait UserInfo extends js.Object {
  /**
    * The display name for the linked provider.
    */
  var displayName: java.lang.String
  /**
    * The email for the linked provider.
    */
  var email: java.lang.String
  /**
    * The phone number for the linked provider.
    */
  var phoneNumber: java.lang.String
  /**
    * The photo URL for the linked provider.
    */
  var photoURL: java.lang.String
  /**
    * The linked provider ID (for example, "google.com" for the Google provider).
    */
  var providerId: java.lang.String
  /**
    * The user identifier for the linked provider.
    */
  var uid: java.lang.String
  /**
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object
}

object UserInfo {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    email: java.lang.String,
    phoneNumber: java.lang.String,
    photoURL: java.lang.String,
    providerId: java.lang.String,
    toJSON: () => js.Object,
    uid: java.lang.String
  ): UserInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName, email = email, phoneNumber = phoneNumber, photoURL = photoURL, providerId = providerId, toJSON = js.Any.fromFunction0(toJSON), uid = uid)
  
    __obj.asInstanceOf[UserInfo]
  }
}

