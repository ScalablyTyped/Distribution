package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.GmailDraft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeActionResponseBuilder extends js.Object {
  def build(): ComposeActionResponse
  def setGmailDraft(draft: GmailDraft): ComposeActionResponseBuilder
}

object ComposeActionResponseBuilder {
  @scala.inline
  def apply(build: () => ComposeActionResponse, setGmailDraft: GmailDraft => ComposeActionResponseBuilder): ComposeActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), setGmailDraft = js.Any.fromFunction1(setGmailDraft))
  
    __obj.asInstanceOf[ComposeActionResponseBuilder]
  }
}

