package typings.googleAppsScript.GoogleAppsScript.CardService

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
@js.native
trait OpenLink extends js.Object {
  def setOnClose(onClose: OnClose): OpenLink = js.native
  def setOpenAs(openAs: OpenAs): OpenLink = js.native
  def setUrl(url: String): OpenLink = js.native
}

object OpenLink {
  @scala.inline
  def apply(setOnClose: OnClose => OpenLink, setOpenAs: OpenAs => OpenLink, setUrl: String => OpenLink): OpenLink = {
    val __obj = js.Dynamic.literal(setOnClose = js.Any.fromFunction1(setOnClose), setOpenAs = js.Any.fromFunction1(setOpenAs), setUrl = js.Any.fromFunction1(setUrl))
    __obj.asInstanceOf[OpenLink]
  }
  @scala.inline
  implicit class OpenLinkOps[Self <: OpenLink] (val x: Self) extends AnyVal {
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
    def setSetOnClose(value: OnClose => OpenLink): Self = this.set("setOnClose", js.Any.fromFunction1(value))
    @scala.inline
    def setSetOpenAs(value: OpenAs => OpenLink): Self = this.set("setOpenAs", js.Any.fromFunction1(value))
    @scala.inline
    def setSetUrl(value: String => OpenLink): Self = this.set("setUrl", js.Any.fromFunction1(value))
  }
  
}

