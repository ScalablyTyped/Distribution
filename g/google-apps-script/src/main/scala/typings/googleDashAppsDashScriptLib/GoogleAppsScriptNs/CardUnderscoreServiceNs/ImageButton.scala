package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageButton extends js.Object {
  def setAltText(altText: java.lang.String): ImageButton
  def setAuthorizationAction(action: AuthorizationAction): ImageButton
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): ImageButton
  def setIcon(icon: Icon): ImageButton
  def setIconUrl(url: java.lang.String): ImageButton
  def setOnClickAction(action: Action): ImageButton
  def setOnClickOpenLinkAction(action: Action): ImageButton
  def setOpenLink(openLink: OpenLink): ImageButton
}

object ImageButton {
  @scala.inline
  def apply(
    setAltText: java.lang.String => ImageButton,
    setAuthorizationAction: AuthorizationAction => ImageButton,
    setComposeAction: (Action, ComposedEmailType) => ImageButton,
    setIcon: Icon => ImageButton,
    setIconUrl: java.lang.String => ImageButton,
    setOnClickAction: Action => ImageButton,
    setOnClickOpenLinkAction: Action => ImageButton,
    setOpenLink: OpenLink => ImageButton
  ): ImageButton = {
    val __obj = js.Dynamic.literal(setAltText = js.Any.fromFunction1(setAltText), setAuthorizationAction = js.Any.fromFunction1(setAuthorizationAction), setComposeAction = js.Any.fromFunction2(setComposeAction), setIcon = js.Any.fromFunction1(setIcon), setIconUrl = js.Any.fromFunction1(setIconUrl), setOnClickAction = js.Any.fromFunction1(setOnClickAction), setOnClickOpenLinkAction = js.Any.fromFunction1(setOnClickOpenLinkAction), setOpenLink = js.Any.fromFunction1(setOpenLink))
  
    __obj.asInstanceOf[ImageButton]
  }
}

