package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeActionResponseBuilder extends js.Object {
  def build(): ComposeActionResponse
  def setGmailDraft(draft: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.GmailDraft): ComposeActionResponseBuilder
}

object ComposeActionResponseBuilder {
  @scala.inline
  def apply(
    build: () => ComposeActionResponse,
    setGmailDraft: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.GmailDraft => ComposeActionResponseBuilder
  ): ComposeActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setGmailDraft = js.Any.fromFunction1(setGmailDraft))
  
    __obj.asInstanceOf[ComposeActionResponseBuilder]
  }
}

