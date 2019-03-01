package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  def setText(text: java.lang.String): Notification
  def setType(`type`: NotificationType): Notification
}

object Notification {
  @scala.inline
  def apply(
    setText: js.Function1[java.lang.String, Notification],
    setType: js.Function1[NotificationType, Notification]
  ): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setText")(setText)
    __obj.updateDynamic("setType")(setType)
    __obj.asInstanceOf[Notification]
  }
}

