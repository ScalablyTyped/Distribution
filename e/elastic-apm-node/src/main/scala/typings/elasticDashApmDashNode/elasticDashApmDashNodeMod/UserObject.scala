package typings.elasticDashApmDashNode.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserObject extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object UserObject {
  @scala.inline
  def apply(email: String = null, id: String | Double = null, username: String = null): UserObject = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[UserObject]
  }
}

