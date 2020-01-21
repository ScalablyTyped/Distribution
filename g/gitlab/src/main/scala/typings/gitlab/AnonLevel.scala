package typings.gitlab

import typings.gitlab.notificationSettingsMod.NotificationSettingLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  var level: js.UndefOr[NotificationSettingLevel] = js.undefined
}

object AnonLevel {
  @scala.inline
  def apply(level: NotificationSettingLevel = null): AnonLevel = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLevel]
  }
}

