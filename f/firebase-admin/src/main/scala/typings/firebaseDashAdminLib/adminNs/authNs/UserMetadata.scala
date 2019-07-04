package typings
package firebaseDashAdminLib.adminNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a user's metadata.
  */
trait UserMetadata extends js.Object {
  /**
    * The date the user was created, formatted as a UTC string.
    *
    */
  var creationTime: java.lang.String
  /**
    * The date the user last signed in, formatted as a UTC string.
    */
  var lastSignInTime: java.lang.String
  /**
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object
}

object UserMetadata {
  @scala.inline
  def apply(creationTime: java.lang.String, lastSignInTime: java.lang.String, toJSON: () => js.Object): UserMetadata = {
    val __obj = js.Dynamic.literal(creationTime = creationTime, lastSignInTime = lastSignInTime, toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[UserMetadata]
  }
}

