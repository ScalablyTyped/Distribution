package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDraftActionResponse extends js.Object {
  def printJson(): String
}

object UpdateDraftActionResponse {
  @scala.inline
  def apply(printJson: () => String): UpdateDraftActionResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
  
    __obj.asInstanceOf[UpdateDraftActionResponse]
  }
}

