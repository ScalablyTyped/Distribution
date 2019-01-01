package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): Button
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): Button
  def setOnClickAction(action: Action): Button
  def setOnClickOpenLinkAction(action: Action): Button
  def setOpenLink(openLink: OpenLink): Button
}

