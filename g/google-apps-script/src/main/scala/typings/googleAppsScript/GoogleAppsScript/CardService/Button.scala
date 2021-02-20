package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A base class for all buttons.
  */
@js.native
trait Button extends StObject {
  
  def setAuthorizationAction(action: AuthorizationAction): Button = js.native
  
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): Button = js.native
  
  def setOnClickAction(action: Action): Button = js.native
  
  def setOnClickOpenLinkAction(action: Action): Button = js.native
  
  def setOpenLink(openLink: OpenLink): Button = js.native
}
object Button {
  
  @scala.inline
  def apply(
    setAuthorizationAction: AuthorizationAction => Button,
    setComposeAction: (Action, ComposedEmailType) => Button,
    setOnClickAction: Action => Button,
    setOnClickOpenLinkAction: Action => Button,
    setOpenLink: OpenLink => Button
  ): Button = {
    val __obj = js.Dynamic.literal(setAuthorizationAction = js.Any.fromFunction1(setAuthorizationAction), setComposeAction = js.Any.fromFunction2(setComposeAction), setOnClickAction = js.Any.fromFunction1(setOnClickAction), setOnClickOpenLinkAction = js.Any.fromFunction1(setOnClickOpenLinkAction), setOpenLink = js.Any.fromFunction1(setOpenLink))
    __obj.asInstanceOf[Button]
  }
  
  @scala.inline
  implicit class ButtonMutableBuilder[Self <: Button] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetAuthorizationAction(value: AuthorizationAction => Button): Self = StObject.set(x, "setAuthorizationAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetComposeAction(value: (Action, ComposedEmailType) => Button): Self = StObject.set(x, "setComposeAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetOnClickAction(value: Action => Button): Self = StObject.set(x, "setOnClickAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOnClickOpenLinkAction(value: Action => Button): Self = StObject.set(x, "setOnClickOpenLinkAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOpenLink(value: OpenLink => Button): Self = StObject.set(x, "setOpenLink", js.Any.fromFunction1(value))
  }
}
