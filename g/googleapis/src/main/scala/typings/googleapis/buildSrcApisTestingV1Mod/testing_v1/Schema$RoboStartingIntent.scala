package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message for specifying the start activities to crawl.
  */
@js.native
trait Schema$RoboStartingIntent extends js.Object {
  var launcherActivity: js.UndefOr[Schema$LauncherActivityIntent] = js.native
  var startActivity: js.UndefOr[Schema$StartActivityIntent] = js.native
  /**
    * Timeout in seconds for each intent.
    */
  var timeout: js.UndefOr[String] = js.native
}

object Schema$RoboStartingIntent {
  @scala.inline
  def apply(
    launcherActivity: Schema$LauncherActivityIntent = null,
    startActivity: Schema$StartActivityIntent = null,
    timeout: String = null
  ): Schema$RoboStartingIntent = {
    val __obj = js.Dynamic.literal()
    if (launcherActivity != null) __obj.updateDynamic("launcherActivity")(launcherActivity.asInstanceOf[js.Any])
    if (startActivity != null) __obj.updateDynamic("startActivity")(startActivity.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RoboStartingIntent]
  }
}

