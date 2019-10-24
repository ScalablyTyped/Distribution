package typings.gitlab

import typings.gitlab.distSrcCoreServicesMod.UserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UserId extends js.Object {
  var userId: js.UndefOr[UserId] = js.undefined
}

object Anon_UserId {
  @scala.inline
  def apply(userId: Int | Double = null): Anon_UserId = {
    val __obj = js.Dynamic.literal()
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_UserId]
  }
}

