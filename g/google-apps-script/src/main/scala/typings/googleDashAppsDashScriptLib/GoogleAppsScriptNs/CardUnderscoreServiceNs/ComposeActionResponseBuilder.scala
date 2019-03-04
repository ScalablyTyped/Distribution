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
    build: js.Function0[ComposeActionResponse],
    setGmailDraft: js.Function1[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.GmailDraft, 
      ComposeActionResponseBuilder
    ]
  ): ComposeActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = build, setGmailDraft = setGmailDraft)
  
    __obj.asInstanceOf[ComposeActionResponseBuilder]
  }
}

