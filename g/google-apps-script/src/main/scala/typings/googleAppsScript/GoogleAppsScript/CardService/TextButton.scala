package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A TextButton with a text label. You can set the background color and disable the button when
  * needed.
  *
  *     var textButton = CardService.newTextButton()
  *         .setText("Open Link")
  *         .setOpenLink(CardService.newOpenLink()
  *             .setUrl("https://www.google.com"));
  */
trait TextButton extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: TextButton] (val x: Self) extends AnyVal {
    
    inline def setSetAuthorizationAction(value: AuthorizationAction => TextButton): Self = StObject.set(x, "setAuthorizationAction", js.Any.fromFunction1(value))
    
    inline def setSetBackgroundColor(value: String => TextButton): Self = StObject.set(x, "setBackgroundColor", js.Any.fromFunction1(value))
    
    inline def setSetComposeAction(value: (Action, ComposedEmailType) => TextButton): Self = StObject.set(x, "setComposeAction", js.Any.fromFunction2(value))
    
    inline def setSetDisabled(value: Boolean => TextButton): Self = StObject.set(x, "setDisabled", js.Any.fromFunction1(value))
    
    inline def setSetOnClickAction(value: Action => TextButton): Self = StObject.set(x, "setOnClickAction", js.Any.fromFunction1(value))
    
    inline def setSetOnClickOpenLinkAction(value: Action => TextButton): Self = StObject.set(x, "setOnClickOpenLinkAction", js.Any.fromFunction1(value))
    
    inline def setSetOpenLink(value: OpenLink => TextButton): Self = StObject.set(x, "setOpenLink", js.Any.fromFunction1(value))
    
    inline def setSetText(value: String => TextButton): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    inline def setSetTextButtonStyle(value: TextButtonStyle => TextButton): Self = StObject.set(x, "setTextButtonStyle", js.Any.fromFunction1(value))
  }
}
