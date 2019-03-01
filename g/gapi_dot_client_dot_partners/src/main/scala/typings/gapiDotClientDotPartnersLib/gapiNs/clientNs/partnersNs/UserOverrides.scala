package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserOverrides extends js.Object {
  /** IP address to use instead of the user's geo-located IP address. */
  var ipAddress: js.UndefOr[java.lang.String] = js.undefined
  /** Logged-in user ID to impersonate instead of the user's ID. */
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object UserOverrides {
  @scala.inline
  def apply(ipAddress: java.lang.String = null, userId: java.lang.String = null): UserOverrides = {
    val __obj = js.Dynamic.literal()
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[UserOverrides]
  }
}

