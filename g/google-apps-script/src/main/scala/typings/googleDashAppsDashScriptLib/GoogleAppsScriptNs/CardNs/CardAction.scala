package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardAction extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): CardAction
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): CardAction
  def setOnClickAction(action: Action): CardAction
  def setOnClickOpenLinkAction(action: Action): CardAction
  def setOpenLink(openLink: OpenLink): CardAction
  def setText(text: java.lang.String): CardAction
}

