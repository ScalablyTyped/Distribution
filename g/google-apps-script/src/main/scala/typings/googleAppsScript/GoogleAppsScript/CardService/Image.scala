package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A widget that shows a single image.
  *
  *     var image = CardService.newImage().setAltText("A nice image").setImageUrl("https://image.png");
  */
trait Image extends StObject {
  
  def setAltText(altText: String): Image
  
  def setAuthorizationAction(action: AuthorizationAction): Image
  
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): Image
  
  def setImageUrl(url: String): Image
  
  def setOnClickAction(action: Action): Image
  
  def setOnClickOpenLinkAction(action: Action): Image
  
  def setOpenLink(openLink: OpenLink): Image
}
object Image {
  
  inline def apply(
    setAltText: String => Image,
    setAuthorizationAction: AuthorizationAction => Image,
    setComposeAction: (Action, ComposedEmailType) => Image,
    setImageUrl: String => Image,
    setOnClickAction: Action => Image,
    setOnClickOpenLinkAction: Action => Image,
    setOpenLink: OpenLink => Image
  ): Image = {
    val __obj = js.Dynamic.literal(setAltText = js.Any.fromFunction1(setAltText), setAuthorizationAction = js.Any.fromFunction1(setAuthorizationAction), setComposeAction = js.Any.fromFunction2(setComposeAction), setImageUrl = js.Any.fromFunction1(setImageUrl), setOnClickAction = js.Any.fromFunction1(setOnClickAction), setOnClickOpenLinkAction = js.Any.fromFunction1(setOnClickOpenLinkAction), setOpenLink = js.Any.fromFunction1(setOpenLink))
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    inline def setSetAltText(value: String => Image): Self = StObject.set(x, "setAltText", js.Any.fromFunction1(value))
    
    inline def setSetAuthorizationAction(value: AuthorizationAction => Image): Self = StObject.set(x, "setAuthorizationAction", js.Any.fromFunction1(value))
    
    inline def setSetComposeAction(value: (Action, ComposedEmailType) => Image): Self = StObject.set(x, "setComposeAction", js.Any.fromFunction2(value))
    
    inline def setSetImageUrl(value: String => Image): Self = StObject.set(x, "setImageUrl", js.Any.fromFunction1(value))
    
    inline def setSetOnClickAction(value: Action => Image): Self = StObject.set(x, "setOnClickAction", js.Any.fromFunction1(value))
    
    inline def setSetOnClickOpenLinkAction(value: Action => Image): Self = StObject.set(x, "setOnClickOpenLinkAction", js.Any.fromFunction1(value))
    
    inline def setSetOpenLink(value: OpenLink => Image): Self = StObject.set(x, "setOpenLink", js.Any.fromFunction1(value))
  }
}
