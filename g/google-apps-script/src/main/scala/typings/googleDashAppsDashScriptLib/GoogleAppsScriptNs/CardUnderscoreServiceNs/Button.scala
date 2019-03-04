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
    val __obj = js.Dynamic.literal(setAuthorizationAction = setAuthorizationAction, setComposeAction = setComposeAction, setOnClickAction = setOnClickAction, setOnClickOpenLinkAction = setOnClickOpenLinkAction, setOpenLink = setOpenLink)
  
    __obj.asInstanceOf[Button]
  }
}

