package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextButton extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): TextButton
  def setBackgroundColor(backgroundColor: java.lang.String): TextButton
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): TextButton
  def setDisabled(disabled: scala.Boolean): TextButton
  def setOnClickAction(action: Action): TextButton
  def setOnClickOpenLinkAction(action: Action): TextButton
  def setOpenLink(openLink: OpenLink): TextButton
  def setText(text: java.lang.String): TextButton
  def setTextButtonStyle(textButtonStyle: TextButtonStyle): TextButton
}

object TextButton {
  @scala.inline
  def apply(
    setAuthorizationAction: js.Function1[AuthorizationAction, TextButton],
    setBackgroundColor: js.Function1[java.lang.String, TextButton],
    setComposeAction: js.Function2[Action, ComposedEmailType, TextButton],
    setDisabled: js.Function1[scala.Boolean, TextButton],
    setOnClickAction: js.Function1[Action, TextButton],
    setOnClickOpenLinkAction: js.Function1[Action, TextButton],
    setOpenLink: js.Function1[OpenLink, TextButton],
    setText: js.Function1[java.lang.String, TextButton],
    setTextButtonStyle: js.Function1[TextButtonStyle, TextButton]
  ): TextButton = {
    val __obj = js.Dynamic.literal(setAuthorizationAction = setAuthorizationAction, setBackgroundColor = setBackgroundColor, setComposeAction = setComposeAction, setDisabled = setDisabled, setOnClickAction = setOnClickAction, setOnClickOpenLinkAction = setOnClickOpenLinkAction, setOpenLink = setOpenLink, setText = setText, setTextButtonStyle = setTextButtonStyle)
  
    __obj.asInstanceOf[TextButton]
  }
}

