package typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRef extends js.Object {
  /** Email ID of this user. */
  var email: js.UndefOr[String] = js.undefined
  /** User ID. */
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object UserRef {
  @scala.inline
  def apply(email: String = null, id: String = null, kind: String = null): UserRef = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[UserRef]
  }
}

