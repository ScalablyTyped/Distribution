package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextButton with a text label. You can set the background color and disable the button when
  * needed.
  *
  *     var textButton = CardService.newTextButton()
  *         .setText("Open Link")
  *         .setOpenLink(CardService.newOpenLink()
  *             .setUrl("https://www.google.com"));
  */
trait TextButton extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): TextButton
  def setBackgroundColor(backgroundColor: String): TextButton
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): TextButton
  def setDisabled(disabled: Boolean): TextButton
  def setOnClickAction(action: Action): TextButton
  def setOnClickOpenLinkAction(action: Action): TextButton
  def setOpenLink(openLink: OpenLink): TextButton
  def setText(text: String): TextButton
  def setTextButtonStyle(textButtonStyle: TextButtonStyle): TextButton
}

object TextButton {
  @scala.inline
  def apply(
    setAuthorizationAction: AuthorizationAction => TextButton,
    setBackgroundColor: String => TextButton,
    setComposeAction: (Action, ComposedEmailType) => TextButton,
    setDisabled: Boolean => TextButton,
    setOnClickAction: Action => TextButton,
    setOnClickOpenLinkAction: Action => TextButton,
    setOpenLink: OpenLink => TextButton,
    setText: String => TextButton,
    setTextButtonStyle: TextButtonStyle => TextButton
  ): TextButton = {
    val __obj = js.Dynamic.literal(setAuthorizationAction = js.Any.fromFunction1(setAuthorizationAction), setBackgroundColor = js.Any.fromFunction1(setBackgroundColor), setComposeAction = js.Any.fromFunction2(setComposeAction), setDisabled = js.Any.fromFunction1(setDisabled), setOnClickAction = js.Any.fromFunction1(setOnClickAction), setOnClickOpenLinkAction = js.Any.fromFunction1(setOnClickOpenLinkAction), setOpenLink = js.Any.fromFunction1(setOpenLink), setText = js.Any.fromFunction1(setText), setTextButtonStyle = js.Any.fromFunction1(setTextButtonStyle))
  
    __obj.asInstanceOf[TextButton]
  }
}

