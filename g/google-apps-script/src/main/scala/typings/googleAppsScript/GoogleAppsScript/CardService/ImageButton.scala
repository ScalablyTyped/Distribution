package typings.googleAppsScript.GoogleAppsScript.CardService

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
trait ImageButton extends js.Object {
  
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
  implicit class ImageButtonOps[Self <: ImageButton] (val x: Self) extends AnyVal {
    
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
    def setSetAltText(value: String => ImageButton): Self = this.set("setAltText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAuthorizationAction(value: AuthorizationAction => ImageButton): Self = this.set("setAuthorizationAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetComposeAction(value: (Action, ComposedEmailType) => ImageButton): Self = this.set("setComposeAction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetIcon(value: Icon => ImageButton): Self = this.set("setIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIconUrl(value: String => ImageButton): Self = this.set("setIconUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOnClickAction(value: Action => ImageButton): Self = this.set("setOnClickAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOnClickOpenLinkAction(value: Action => ImageButton): Self = this.set("setOnClickOpenLinkAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOpenLink(value: OpenLink => ImageButton): Self = this.set("setOpenLink", js.Any.fromFunction1(value))
  }
}
