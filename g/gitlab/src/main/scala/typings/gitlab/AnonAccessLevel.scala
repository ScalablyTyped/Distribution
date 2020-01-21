package typings.gitlab

import typings.gitlab.resourceAccessRequestsMod.AccessLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccessLevel extends js.Object {
  var accessLevel: js.UndefOr[AccessLevel] = js.undefined
}

object AnonAccessLevel {
  @scala.inline
  def apply(accessLevel: AccessLevel = null): AnonAccessLevel = {
    val __obj = js.Dynamic.literal()
    if (accessLevel != null) __obj.updateDynamic("accessLevel")(accessLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccessLevel]
  }
}

