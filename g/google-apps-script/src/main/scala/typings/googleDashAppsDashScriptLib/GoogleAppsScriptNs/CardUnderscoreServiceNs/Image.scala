package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  def setAltText(altText: java.lang.String): Image
  def setAuthorizationAction(action: AuthorizationAction): Image
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): Image
  def setImageUrl(url: java.lang.String): Image
  def setOnClickAction(action: Action): Image
  def setOnClickOpenLinkAction(action: Action): Image
  def setOpenLink(openLink: OpenLink): Image
}

object Image {
  @scala.inline
  def apply(
    setAltText: js.Function1[java.lang.String, Image],
    setAuthorizationAction: js.Function1[AuthorizationAction, Image],
    setComposeAction: js.Function2[Action, ComposedEmailType, Image],
    setImageUrl: js.Function1[java.lang.String, Image],
    setOnClickAction: js.Function1[Action, Image],
    setOnClickOpenLinkAction: js.Function1[Action, Image],
    setOpenLink: js.Function1[OpenLink, Image]
  ): Image = {
    val __obj = js.Dynamic.literal(setAltText = setAltText, setAuthorizationAction = setAuthorizationAction, setComposeAction = setComposeAction, setImageUrl = setImageUrl, setOnClickAction = setOnClickAction, setOnClickOpenLinkAction = setOnClickOpenLinkAction, setOpenLink = setOpenLink)
  
    __obj.asInstanceOf[Image]
  }
}

