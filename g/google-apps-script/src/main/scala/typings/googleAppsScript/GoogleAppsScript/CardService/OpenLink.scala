package typings.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an action to open a link with some options.
  *
  *     // A button that opens as a link in an overlay and
  *     // requires a reload when closed.
  *     var button = CardService.newTextButton()
  *         .setText("This button opens a link in an overlay window")
  *         .setOpenLink(CardService.newOpenLink()
  *             .setUrl("https://www.google.com")
  *             .setOpenAs(CardService.OpenAs.OVERLAY)
  *             .setOnClose(CardService.OnClose.RELOAD_ADD_ON));
  *
  *     // An action response that opens a link in full screen and
  *     // requires no action when closed.
  *     var actionResponse = CardService.newActionResponseBuilder()
  *         .setOpenLink(CardService.newOpenLink()
  *             .setUrl("https://www.google.com")
  *             .setOpenAs(CardService.OpenAs.FULL_SIZE)
  *             .setOnClose(CardService.OnClose.NOTHING));
  *         .build();
  */
trait OpenLink extends StObject {
  
  def setOnClose(onClose: OnClose): OpenLink
  
  def setOpenAs(openAs: OpenAs): OpenLink
  
  def setUrl(url: String): OpenLink
}
object OpenLink {
  
  inline def apply(setOnClose: OnClose => OpenLink, setOpenAs: OpenAs => OpenLink, setUrl: String => OpenLink): OpenLink = {
    val __obj = js.Dynamic.literal(setOnClose = js.Any.fromFunction1(setOnClose), setOpenAs = js.Any.fromFunction1(setOpenAs), setUrl = js.Any.fromFunction1(setUrl))
    __obj.asInstanceOf[OpenLink]
  }
  
  extension [Self <: OpenLink](x: Self) {
    
    inline def setSetOnClose(value: OnClose => OpenLink): Self = StObject.set(x, "setOnClose", js.Any.fromFunction1(value))
    
    inline def setSetOpenAs(value: OpenAs => OpenLink): Self = StObject.set(x, "setOpenAs", js.Any.fromFunction1(value))
    
    inline def setSetUrl(value: String => OpenLink): Self = StObject.set(x, "setUrl", js.Any.fromFunction1(value))
  }
}
