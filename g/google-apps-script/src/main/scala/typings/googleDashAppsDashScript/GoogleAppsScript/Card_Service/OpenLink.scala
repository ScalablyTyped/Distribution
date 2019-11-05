package typings.googleDashAppsDashScript.GoogleAppsScript.Card_Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait OpenLink extends js.Object {
  def setOnClose(onClose: OnClose): OpenLink
  def setOpenAs(openAs: OpenAs): OpenLink
  def setUrl(url: String): OpenLink
}

object OpenLink {
  @scala.inline
  def apply(setOnClose: OnClose => OpenLink, setOpenAs: OpenAs => OpenLink, setUrl: String => OpenLink): OpenLink = {
    val __obj = js.Dynamic.literal(setOnClose = js.Any.fromFunction1(setOnClose), setOpenAs = js.Any.fromFunction1(setOpenAs), setUrl = js.Any.fromFunction1(setUrl))
  
    __obj.asInstanceOf[OpenLink]
  }
}

