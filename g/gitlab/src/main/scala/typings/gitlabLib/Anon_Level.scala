package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Level extends js.Object {
  var level: js.UndefOr[gitlabLib.distServicesMod.NotificationSettingLevel] = js.undefined
}

object Anon_Level {
  @scala.inline
  def apply(level: gitlabLib.distServicesMod.NotificationSettingLevel = null): Anon_Level = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level)
    __obj.asInstanceOf[Anon_Level]
  }
}

