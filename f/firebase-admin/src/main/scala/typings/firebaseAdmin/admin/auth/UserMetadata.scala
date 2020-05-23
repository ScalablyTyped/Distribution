package typings.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a user's metadata.
  */
trait UserMetadata extends js.Object {
  /**
    * The date the user was created, formatted as a UTC string.
    */
  var creationTime: String
  /**
    * The time at which the user was last active (ID token refreshed),
    * formatted as a UTC Date string (eg 'Sat, 03 Feb 2001 04:05:06 GMT').
    * Returns null if the user was never active.
    */
  var lastRefreshTime: js.UndefOr[String | Null] = js.undefined
  /**
    * The date the user last signed in, formatted as a UTC string.
    */
  var lastSignInTime: String
  /**
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object
}

object UserMetadata {
  @scala.inline
  def apply(
    creationTime: String,
    lastSignInTime: String,
    toJSON: () => js.Object,
    lastRefreshTime: js.UndefOr[Null | String] = js.undefined
  ): UserMetadata = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], lastSignInTime = lastSignInTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    if (!js.isUndefined(lastRefreshTime)) __obj.updateDynamic("lastRefreshTime")(lastRefreshTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserMetadata]
  }
}

