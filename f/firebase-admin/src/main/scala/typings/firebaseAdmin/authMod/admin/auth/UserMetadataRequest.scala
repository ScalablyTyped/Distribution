package typings.firebaseAdmin.authMod.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User metadata to include when importing a user.
  */
trait UserMetadataRequest extends js.Object {
  /**
    * The date the user was created, formatted as a UTC string.
    */
  var creationTime: js.UndefOr[String] = js.undefined
  /**
    * The time at which the user was last active (ID token refreshed),
    * formatted as a UTC Date string (eg 'Sat, 03 Feb 2001 04:05:06 GMT').
    * Null implies the user was never active.
    */
  var lastRefreshTime: js.UndefOr[String | Null] = js.undefined
  /**
    * The date the user last signed in, formatted as a UTC string.
    */
  var lastSignInTime: js.UndefOr[String] = js.undefined
}

object UserMetadataRequest {
  @scala.inline
  def apply(
    creationTime: String = null,
    lastRefreshTime: js.UndefOr[Null | String] = js.undefined,
    lastSignInTime: String = null
  ): UserMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (!js.isUndefined(lastRefreshTime)) __obj.updateDynamic("lastRefreshTime")(lastRefreshTime.asInstanceOf[js.Any])
    if (lastSignInTime != null) __obj.updateDynamic("lastSignInTime")(lastSignInTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserMetadataRequest]
  }
}

