package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A clickable menu item that is added to the card header menu.
  *
  *     var action = CardService.newAction();
  *     // Finish building the action...
  *
  *     var cardAction = CardService.newCardAction()
  *         .setText("Card action")
  *         .setOnClickAction(action);
  */
trait CardAction extends StObject {
  
  def setAuthorizationAction(action: AuthorizationAction): CardAction
  
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): CardAction
  
  def setOnClickAction(action: Action): CardAction
  
  def setOnClickOpenLinkAction(action: Action): CardAction
  
  def setOpenLink(openLink: OpenLink): CardAction
  
  def setText(text: String): CardAction
}
object CardAction {
  
  @scala.inline
  def apply(
    setAuthorizationAction: AuthorizationAction => CardAction,
    setComposeAction: (Action, ComposedEmailType) => CardAction,
    setOnClickAction: Action => CardAction,
    setOnClickOpenLinkAction: Action => CardAction,
    setOpenLink: OpenLink => CardAction,
    setText: String => CardAction
  ): CardAction = {
    val __obj = js.Dynamic.literal(setAuthorizationAction = js.Any.fromFunction1(setAuthorizationAction), setComposeAction = js.Any.fromFunction2(setComposeAction), setOnClickAction = js.Any.fromFunction1(setOnClickAction), setOnClickOpenLinkAction = js.Any.fromFunction1(setOnClickOpenLinkAction), setOpenLink = js.Any.fromFunction1(setOpenLink), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[CardAction]
  }
  
  @scala.inline
  implicit class CardActionMutableBuilder[Self <: CardAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetAuthorizationAction(value: AuthorizationAction => CardAction): Self = StObject.set(x, "setAuthorizationAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetComposeAction(value: (Action, ComposedEmailType) => CardAction): Self = StObject.set(x, "setComposeAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetOnClickAction(value: Action => CardAction): Self = StObject.set(x, "setOnClickAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOnClickOpenLinkAction(value: Action => CardAction): Self = StObject.set(x, "setOnClickOpenLinkAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOpenLink(value: OpenLink => CardAction): Self = StObject.set(x, "setOpenLink", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: String => CardAction): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
  }
}
