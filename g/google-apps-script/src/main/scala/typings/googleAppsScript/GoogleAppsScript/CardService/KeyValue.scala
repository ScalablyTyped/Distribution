package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A widget that displays one or more "keys" around a text "value". The possible keys include an
  * icon, a label above and a label below. Setting the text content and one of the keys is required
  * using setContent(text) and one of setIcon(icon), setIconUrl(url), setTopLabel(text),
  * or setBottomLabel(text).
  *
  *     var imageKeyValue = CardService.newKeyValue()
  *         .setIconUrl("https://icon.png")
  *         .setContent("KeyValue widget with an image on the left and text on the right");
  *
  *     var textKeyValue = CardService.newKeyValue()
  *         .setTopLabel("Text key")
  *         .setContent("KeyValue widget with text key on top and cotent below");
  *
  *     var multilineKeyValue = CardService.newKeyValue()
  *         .setTopLabel("Top label - single line)")
  *         .setContent("Content can be multiple lines")
  *         .setMultiline(true)
  *         .setBottomLabel("Bottom label - single line");
  */
@js.native
trait KeyValue extends StObject {
  
  def setAuthorizationAction(action: AuthorizationAction): KeyValue = js.native
  
  def setBottomLabel(text: String): KeyValue = js.native
  
  def setButton(button: Button): KeyValue = js.native
  
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): KeyValue = js.native
  
  def setContent(text: String): KeyValue = js.native
  
  def setIcon(icon: Icon): KeyValue = js.native
  
  def setIconAltText(altText: String): KeyValue = js.native
  
  def setIconUrl(url: String): KeyValue = js.native
  
  def setMultiline(multiline: Boolean): KeyValue = js.native
  
  def setOnClickAction(action: Action): KeyValue = js.native
  
  def setOnClickOpenLinkAction(action: Action): KeyValue = js.native
  
  def setOpenLink(openLink: OpenLink): KeyValue = js.native
  
  def setSwitch(switchToSet: Switch): KeyValue = js.native
  
  def setTopLabel(text: String): KeyValue = js.native
}
object KeyValue {
  
  @scala.inline
  def apply(
    setAuthorizationAction: AuthorizationAction => KeyValue,
    setBottomLabel: String => KeyValue,
    setButton: Button => KeyValue,
    setComposeAction: (Action, ComposedEmailType) => KeyValue,
    setContent: String => KeyValue,
    setIcon: Icon => KeyValue,
    setIconAltText: String => KeyValue,
    setIconUrl: String => KeyValue,
    setMultiline: Boolean => KeyValue,
    setOnClickAction: Action => KeyValue,
    setOnClickOpenLinkAction: Action => KeyValue,
    setOpenLink: OpenLink => KeyValue,
    setSwitch: Switch => KeyValue,
    setTopLabel: String => KeyValue
  ): KeyValue = {
    val __obj = js.Dynamic.literal(setAuthorizationAction = js.Any.fromFunction1(setAuthorizationAction), setBottomLabel = js.Any.fromFunction1(setBottomLabel), setButton = js.Any.fromFunction1(setButton), setComposeAction = js.Any.fromFunction2(setComposeAction), setContent = js.Any.fromFunction1(setContent), setIcon = js.Any.fromFunction1(setIcon), setIconAltText = js.Any.fromFunction1(setIconAltText), setIconUrl = js.Any.fromFunction1(setIconUrl), setMultiline = js.Any.fromFunction1(setMultiline), setOnClickAction = js.Any.fromFunction1(setOnClickAction), setOnClickOpenLinkAction = js.Any.fromFunction1(setOnClickOpenLinkAction), setOpenLink = js.Any.fromFunction1(setOpenLink), setSwitch = js.Any.fromFunction1(setSwitch), setTopLabel = js.Any.fromFunction1(setTopLabel))
    __obj.asInstanceOf[KeyValue]
  }
  
  @scala.inline
  implicit class KeyValueMutableBuilder[Self <: KeyValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetAuthorizationAction(value: AuthorizationAction => KeyValue): Self = StObject.set(x, "setAuthorizationAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBottomLabel(value: String => KeyValue): Self = StObject.set(x, "setBottomLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetButton(value: Button => KeyValue): Self = StObject.set(x, "setButton", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetComposeAction(value: (Action, ComposedEmailType) => KeyValue): Self = StObject.set(x, "setComposeAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetContent(value: String => KeyValue): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIcon(value: Icon => KeyValue): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIconAltText(value: String => KeyValue): Self = StObject.set(x, "setIconAltText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIconUrl(value: String => KeyValue): Self = StObject.set(x, "setIconUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMultiline(value: Boolean => KeyValue): Self = StObject.set(x, "setMultiline", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOnClickAction(value: Action => KeyValue): Self = StObject.set(x, "setOnClickAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOnClickOpenLinkAction(value: Action => KeyValue): Self = StObject.set(x, "setOnClickOpenLinkAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOpenLink(value: OpenLink => KeyValue): Self = StObject.set(x, "setOpenLink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSwitch(value: Switch => KeyValue): Self = StObject.set(x, "setSwitch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTopLabel(value: String => KeyValue): Self = StObject.set(x, "setTopLabel", js.Any.fromFunction1(value))
  }
}
