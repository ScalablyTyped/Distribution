package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUserId extends js.Object {
  var userId: js.UndefOr[Double] = js.undefined
}

object AnonUserId {
  @scala.inline
  def apply(userId: Int | Double = null): AnonUserId = {
    val __obj = js.Dynamic.literal()
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUserId]
  }
}

