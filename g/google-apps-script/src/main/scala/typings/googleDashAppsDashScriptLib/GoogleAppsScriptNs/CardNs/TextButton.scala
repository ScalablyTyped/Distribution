package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TextButton extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): TextButton
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): TextButton
  def setOnClickAction(action: Action): TextButton
  def setOnClickOpenLinkAction(action: Action): TextButton
  def setOpenLink(openLink: OpenLink): TextButton
  def setText(text: java.lang.String): TextButton
}

