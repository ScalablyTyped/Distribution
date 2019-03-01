package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): Button
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): Button
  def setOnClickAction(action: Action): Button
  def setOnClickOpenLinkAction(action: Action): Button
  def setOpenLink(openLink: OpenLink): Button
}

object Button {
  @scala.inline
  def apply(
    setAuthorizationAction: js.Function1[AuthorizationAction, Button],
    setComposeAction: js.Function2[Action, ComposedEmailType, Button],
    setOnClickAction: js.Function1[Action, Button],
    setOnClickOpenLinkAction: js.Function1[Action, Button],
    setOpenLink: js.Function1[OpenLink, Button]
  ): Button = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setAuthorizationAction")(setAuthorizationAction)
    __obj.updateDynamic("setComposeAction")(setComposeAction)
    __obj.updateDynamic("setOnClickAction")(setOnClickAction)
    __obj.updateDynamic("setOnClickOpenLinkAction")(setOnClickOpenLinkAction)
    __obj.updateDynamic("setOpenLink")(setOpenLink)
    __obj.asInstanceOf[Button]
  }
}

