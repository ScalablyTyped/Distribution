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
    setAltText: js.Function1[java.lang.String, ImageButton],
    setAuthorizationAction: js.Function1[AuthorizationAction, ImageButton],
    setComposeAction: js.Function2[Action, ComposedEmailType, ImageButton],
    setIcon: js.Function1[Icon, ImageButton],
    setIconUrl: js.Function1[java.lang.String, ImageButton],
    setOnClickAction: js.Function1[Action, ImageButton],
    setOnClickOpenLinkAction: js.Function1[Action, ImageButton],
    setOpenLink: js.Function1[OpenLink, ImageButton]
  ): ImageButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setAltText")(setAltText)
    __obj.updateDynamic("setAuthorizationAction")(setAuthorizationAction)
    __obj.updateDynamic("setComposeAction")(setComposeAction)
    __obj.updateDynamic("setIcon")(setIcon)
    __obj.updateDynamic("setIconUrl")(setIconUrl)
    __obj.updateDynamic("setOnClickAction")(setOnClickAction)
    __obj.updateDynamic("setOnClickOpenLinkAction")(setOnClickOpenLinkAction)
    __obj.updateDynamic("setOpenLink")(setOpenLink)
    __obj.asInstanceOf[ImageButton]
  }
}

