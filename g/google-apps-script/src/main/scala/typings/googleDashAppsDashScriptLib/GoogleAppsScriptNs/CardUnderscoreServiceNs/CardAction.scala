package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardAction extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): CardAction
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): CardAction
  def setOnClickAction(action: Action): CardAction
  def setOnClickOpenLinkAction(action: Action): CardAction
  def setOpenLink(openLink: OpenLink): CardAction
  def setText(text: java.lang.String): CardAction
}

object CardAction {
  @scala.inline
  def apply(
    setAuthorizationAction: js.Function1[AuthorizationAction, CardAction],
    setComposeAction: js.Function2[Action, ComposedEmailType, CardAction],
    setOnClickAction: js.Function1[Action, CardAction],
    setOnClickOpenLinkAction: js.Function1[Action, CardAction],
    setOpenLink: js.Function1[OpenLink, CardAction],
    setText: js.Function1[java.lang.String, CardAction]
  ): CardAction = {
    val __obj = js.Dynamic.literal(setAuthorizationAction = setAuthorizationAction, setComposeAction = setComposeAction, setOnClickAction = setOnClickAction, setOnClickOpenLinkAction = setOnClickOpenLinkAction, setOpenLink = setOpenLink, setText = setText)
  
    __obj.asInstanceOf[CardAction]
  }
}

