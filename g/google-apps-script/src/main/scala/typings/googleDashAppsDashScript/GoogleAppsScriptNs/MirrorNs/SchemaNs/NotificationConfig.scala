package typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationConfig extends js.Object {
  var deliveryTime: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[String] = js.undefined
}

object NotificationConfig {
  @scala.inline
  def apply(deliveryTime: String = null, level: String = null): NotificationConfig = {
    val __obj = js.Dynamic.literal()
    if (deliveryTime != null) __obj.updateDynamic("deliveryTime")(deliveryTime)
    if (level != null) __obj.updateDynamic("level")(level)
    __obj.asInstanceOf[NotificationConfig]
  }
}

