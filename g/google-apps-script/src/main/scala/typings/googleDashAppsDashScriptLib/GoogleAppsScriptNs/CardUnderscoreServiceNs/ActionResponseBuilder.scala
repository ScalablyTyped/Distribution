package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionResponseBuilder extends js.Object {
  def build(): ActionResponse
  def setNavigation(navigation: Navigation): ActionResponseBuilder
  def setNotification(notification: Notification): ActionResponseBuilder
  def setOpenLink(openLink: OpenLink): ActionResponseBuilder
  def setStateChanged(stateChanged: scala.Boolean): ActionResponseBuilder
}

object ActionResponseBuilder {
  @scala.inline
  def apply(
    build: js.Function0[ActionResponse],
    setNavigation: js.Function1[Navigation, ActionResponseBuilder],
    setNotification: js.Function1[Notification, ActionResponseBuilder],
    setOpenLink: js.Function1[OpenLink, ActionResponseBuilder],
    setStateChanged: js.Function1[scala.Boolean, ActionResponseBuilder]
  ): ActionResponseBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("setNavigation")(setNavigation)
    __obj.updateDynamic("setNotification")(setNotification)
    __obj.updateDynamic("setOpenLink")(setOpenLink)
    __obj.updateDynamic("setStateChanged")(setStateChanged)
    __obj.asInstanceOf[ActionResponseBuilder]
  }
}

