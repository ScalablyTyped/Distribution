package typings.googleAppsScript.GoogleAppsScript.CardService

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
@js.native
trait TextButton extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): TextButton = js.native
  def setBackgroundColor(backgroundColor: String): TextButton = js.native
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): TextButton = js.native
  def setDisabled(disabled: Boolean): TextButton = js.native
  def setOnClickAction(action: Action): TextButton = js.native
  def setOnClickOpenLinkAction(action: Action): TextButton = js.native
  def setOpenLink(openLink: OpenLink): TextButton = js.native
  def setText(text: String): TextButton = js.native
  def setTextButtonStyle(textButtonStyle: TextButtonStyle): TextButton = js.native
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
  @scala.inline
  implicit class TextButtonOps[Self <: TextButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSetAuthorizationAction(value: AuthorizationAction => TextButton): Self = this.set("setAuthorizationAction", js.Any.fromFunction1(value))
    @scala.inline
    def setSetBackgroundColor(value: String => TextButton): Self = this.set("setBackgroundColor", js.Any.fromFunction1(value))
    @scala.inline
    def setSetComposeAction(value: (Action, ComposedEmailType) => TextButton): Self = this.set("setComposeAction", js.Any.fromFunction2(value))
    @scala.inline
    def setSetDisabled(value: Boolean => TextButton): Self = this.set("setDisabled", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOnClickAction(value: Action => TextButton): Self = this.set("setOnClickAction", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOnClickOpenLinkAction(value: Action => TextButton): Self = this.set("setOnClickOpenLinkAction", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOpenLink(value: OpenLink => TextButton): Self = this.set("setOpenLink", js.Any.fromFunction1(value))
    @scala.inline
    def setSetText(value: String => TextButton): Self = this.set("setText", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTextButtonStyle(value: TextButtonStyle => TextButton): Self = this.set("setTextButtonStyle", js.Any.fromFunction1(value))
  }
  
}

