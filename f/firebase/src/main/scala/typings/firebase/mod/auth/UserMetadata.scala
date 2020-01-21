package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface representing a user's metadata.
  */
trait UserMetadata extends js.Object {
  var creationTime: js.UndefOr[String] = js.undefined
  var lastSignInTime: js.UndefOr[String] = js.undefined
}

object UserMetadata {
  @scala.inline
  def apply(creationTime: String = null, lastSignInTime: String = null): UserMetadata = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (lastSignInTime != null) __obj.updateDynamic("lastSignInTime")(lastSignInTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserMetadata]
  }
}

