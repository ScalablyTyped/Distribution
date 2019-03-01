package typings
package atFirebaseAuthDashTypesLib.atFirebaseAuthDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserMetadata extends js.Object {
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  var lastSignInTime: js.UndefOr[java.lang.String] = js.undefined
}

object UserMetadata {
  @scala.inline
  def apply(creationTime: java.lang.String = null, lastSignInTime: java.lang.String = null): UserMetadata = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (lastSignInTime != null) __obj.updateDynamic("lastSignInTime")(lastSignInTime)
    __obj.asInstanceOf[UserMetadata]
  }
}

