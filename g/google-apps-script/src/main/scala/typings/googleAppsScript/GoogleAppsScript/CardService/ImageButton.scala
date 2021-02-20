package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ImageButton with an image displayed on it.
  *
  *     var imageButton = CardService.newImageButton()
  *         .setAltText("An image button with an airplane icon.")
  *         .setIcon(CardService.Icon.AIRPLANE)
  *         .setOpenLink(CardService.newOpenLink()
  *             .setUrl("https://airplane.com"));
  */
@js.native
trait ImageButton extends StObject {
  
  def setAltText(altText: String): ImageButton = js.native
  
  def setAuthorizationAction(action: AuthorizationAction): ImageButton = js.native
  
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): ImageButton = js.native
  
  def setIcon(icon: Icon): ImageButton = js.native
  
  def setIconUrl(url: String): ImageButton = js.native
  
  def setOnClickAction(action: Action): ImageButton = js.native
  
  def setOnClickOpenLinkAction(action: Action): ImageButton = js.native
  
  def setOpenLink(openLink: OpenLink): ImageButton = js.native
}
object ImageButton {
  
  @scala.inline
  def apply(
    setAltText: String => ImageButton,
    setAuthorizationAction: AuthorizationAction => ImageButton,
    setComposeAction: (Action, ComposedEmailType) => ImageButton,
    setIcon: Icon => ImageButton,
    setIconUrl: String => ImageButton,
    setOnClickAction: Action => ImageButton,
    setOnClickOpenLinkAction: Action => ImageButton,
    setOpenLink: OpenLink => ImageButton
  ): ImageButton = {
    val __obj = js.Dynamic.literal(setAltText = js.Any.fromFunction1(setAltText), setAuthorizationAction = js.Any.fromFunction1(setAuthorizationAction), setComposeAction = js.Any.fromFunction2(setComposeAction), setIcon = js.Any.fromFunction1(setIcon), setIconUrl = js.Any.fromFunction1(setIconUrl), setOnClickAction = js.Any.fromFunction1(setOnClickAction), setOnClickOpenLinkAction = js.Any.fromFunction1(setOnClickOpenLinkAction), setOpenLink = js.Any.fromFunction1(setOpenLink))
    __obj.asInstanceOf[ImageButton]
  }
  
  @scala.inline
  implicit class ImageButtonMutableBuilder[Self <: ImageButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetAltText(value: String => ImageButton): Self = StObject.set(x, "setAltText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAuthorizationAction(value: AuthorizationAction => ImageButton): Self = StObject.set(x, "setAuthorizationAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetComposeAction(value: (Action, ComposedEmailType) => ImageButton): Self = StObject.set(x, "setComposeAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetIcon(value: Icon => ImageButton): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIconUrl(value: String => ImageButton): Self = StObject.set(x, "setIconUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOnClickAction(value: Action => ImageButton): Self = StObject.set(x, "setOnClickAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOnClickOpenLinkAction(value: Action => ImageButton): Self = StObject.set(x, "setOnClickOpenLinkAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOpenLink(value: OpenLink => ImageButton): Self = StObject.set(x, "setOpenLink", js.Any.fromFunction1(value))
  }
}
