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
    setAuthorizationAction: AuthorizationAction => TextButton,
    setBackgroundColor: java.lang.String => TextButton,
    setComposeAction: (Action, ComposedEmailType) => TextButton,
    setDisabled: scala.Boolean => TextButton,
    setOnClickAction: Action => TextButton,
    setOnClickOpenLinkAction: Action => TextButton,
    setOpenLink: OpenLink => TextButton,
    setText: java.lang.String => TextButton,
    setTextButtonStyle: TextButtonStyle => TextButton
  ): TextButton = {
    val __obj = js.Dynamic.literal(setAuthorizationAction = js.Any.fromFunction1(setAuthorizationAction), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setComposeAction = js.Any.fromFunction2(setComposeAction), setDisabled = js.Any.fromFunction1(setDisabled), setOnClickAction = js.Any.fromFunction1(setOnClickAction), setOnClickOpenLinkAction = js.Any.fromFunction1(setOnClickOpenLinkAction), setOpenLink = js.Any.fromFunction1(setOpenLink), setText = js.Any.fromFunction1(setText), setTextButtonStyle = js.Any.fromFunction1(setTextButtonStyle))
  
    __obj.asInstanceOf[TextButton]
  }
}

