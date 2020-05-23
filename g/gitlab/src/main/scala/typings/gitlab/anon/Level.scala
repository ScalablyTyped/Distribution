package typings.gitlab.anon

import typings.gitlab.notificationSettingsMod.NotificationSettingLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Level extends js.Object {
  var level: js.UndefOr[NotificationSettingLevel] = js.undefined
}

object Level {
  @scala.inline
  def apply(level: NotificationSettingLevel = null): Level = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
}

