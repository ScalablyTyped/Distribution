package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A widget that displays text with optional decorations. Possible keys include an icon, a label
  * above and a label below. Setting the text content and one of the keys is required using setText(text)
  * and one of setIcon(icon), setIconUrl(url), setTopLabel(text), or setBottomLabel(text).
  * This class is intended to replace KeyValue.
  */
trait DecoratedText extends StObject {
  
  def setAuthorizationAction(action: AuthorizationAction): DecoratedText
  
  def setBottomLabel(text: String): DecoratedText
  
  def setButton(button: Button): DecoratedText
  
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): DecoratedText
  
  def setEndIcon(endIcon: IconImage): DecoratedText
  
  def setIcon(icon: Icon): DecoratedText
  
  def setIconAltText(altText: String): DecoratedText
  
  def setIconUrl(url: String): DecoratedText
  
  def setOnClickAction(action: Action): DecoratedText
  
  def setOnClickOpenLinkAction(action: Action): DecoratedText
  
  def setOpenLink(openLink: OpenLink): DecoratedText
  
  def setStartIcon(startIcon: IconImage): DecoratedText
  
  def setSwitchControl(switchToSet: Switch): DecoratedText
  
  def setText(text: String): DecoratedText
  
  def setTopLabel(text: String): DecoratedText
  
  def setWrapText(wrapText: Boolean): DecoratedText
}
object DecoratedText {
  
  inline def apply(
    setAuthorizationAction: AuthorizationAction => DecoratedText,
    setBottomLabel: String => DecoratedText,
    setButton: Button => DecoratedText,
    setComposeAction: (Action, ComposedEmailType) => DecoratedText,
    setEndIcon: IconImage => DecoratedText,
    setIcon: Icon => DecoratedText,
    setIconAltText: String => DecoratedText,
    setIconUrl: String => DecoratedText,
    setOnClickAction: Action => DecoratedText,
    setOnClickOpenLinkAction: Action => DecoratedText,
    setOpenLink: OpenLink => DecoratedText,
    setStartIcon: IconImage => DecoratedText,
    setSwitchControl: Switch => DecoratedText,
    setText: String => DecoratedText,
    setTopLabel: String => DecoratedText,
    setWrapText: Boolean => DecoratedText
  ): DecoratedText = {
    val __obj = js.Dynamic.literal(setAuthorizationAction = js.Any.fromFunction1(setAuthorizationAction), setBottomLabel = js.Any.fromFunction1(setBottomLabel), setButton = js.Any.fromFunction1(setButton), setComposeAction = js.Any.fromFunction2(setComposeAction), setEndIcon = js.Any.fromFunction1(setEndIcon), setIcon = js.Any.fromFunction1(setIcon), setIconAltText = js.Any.fromFunction1(setIconAltText), setIconUrl = js.Any.fromFunction1(setIconUrl), setOnClickAction = js.Any.fromFunction1(setOnClickAction), setOnClickOpenLinkAction = js.Any.fromFunction1(setOnClickOpenLinkAction), setOpenLink = js.Any.fromFunction1(setOpenLink), setStartIcon = js.Any.fromFunction1(setStartIcon), setSwitchControl = js.Any.fromFunction1(setSwitchControl), setText = js.Any.fromFunction1(setText), setTopLabel = js.Any.fromFunction1(setTopLabel), setWrapText = js.Any.fromFunction1(setWrapText))
    __obj.asInstanceOf[DecoratedText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecoratedText] (val x: Self) extends AnyVal {
    
    inline def setSetAuthorizationAction(value: AuthorizationAction => DecoratedText): Self = StObject.set(x, "setAuthorizationAction", js.Any.fromFunction1(value))
    
    inline def setSetBottomLabel(value: String => DecoratedText): Self = StObject.set(x, "setBottomLabel", js.Any.fromFunction1(value))
    
    inline def setSetButton(value: Button => DecoratedText): Self = StObject.set(x, "setButton", js.Any.fromFunction1(value))
    
    inline def setSetComposeAction(value: (Action, ComposedEmailType) => DecoratedText): Self = StObject.set(x, "setComposeAction", js.Any.fromFunction2(value))
    
    inline def setSetEndIcon(value: IconImage => DecoratedText): Self = StObject.set(x, "setEndIcon", js.Any.fromFunction1(value))
    
    inline def setSetIcon(value: Icon => DecoratedText): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
    
    inline def setSetIconAltText(value: String => DecoratedText): Self = StObject.set(x, "setIconAltText", js.Any.fromFunction1(value))
    
    inline def setSetIconUrl(value: String => DecoratedText): Self = StObject.set(x, "setIconUrl", js.Any.fromFunction1(value))
    
    inline def setSetOnClickAction(value: Action => DecoratedText): Self = StObject.set(x, "setOnClickAction", js.Any.fromFunction1(value))
    
    inline def setSetOnClickOpenLinkAction(value: Action => DecoratedText): Self = StObject.set(x, "setOnClickOpenLinkAction", js.Any.fromFunction1(value))
    
    inline def setSetOpenLink(value: OpenLink => DecoratedText): Self = StObject.set(x, "setOpenLink", js.Any.fromFunction1(value))
    
    inline def setSetStartIcon(value: IconImage => DecoratedText): Self = StObject.set(x, "setStartIcon", js.Any.fromFunction1(value))
    
    inline def setSetSwitchControl(value: Switch => DecoratedText): Self = StObject.set(x, "setSwitchControl", js.Any.fromFunction1(value))
    
    inline def setSetText(value: String => DecoratedText): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    inline def setSetTopLabel(value: String => DecoratedText): Self = StObject.set(x, "setTopLabel", js.Any.fromFunction1(value))
    
    inline def setSetWrapText(value: Boolean => DecoratedText): Self = StObject.set(x, "setWrapText", js.Any.fromFunction1(value))
  }
}
