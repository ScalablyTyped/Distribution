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
    build: () => ActionResponse,
    setNavigation: Navigation => ActionResponseBuilder,
    setNotification: Notification => ActionResponseBuilder,
    setOpenLink: OpenLink => ActionResponseBuilder,
    setStateChanged: scala.Boolean => ActionResponseBuilder
  ): ActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setNavigation = js.Any.fromFunction1(setNavigation), setNotification = js.Any.fromFunction1(setNotification), setOpenLink = js.Any.fromFunction1(setOpenLink), setStateChanged = js.Any.fromFunction1(setStateChanged))
  
    __obj.asInstanceOf[ActionResponseBuilder]
  }
}

