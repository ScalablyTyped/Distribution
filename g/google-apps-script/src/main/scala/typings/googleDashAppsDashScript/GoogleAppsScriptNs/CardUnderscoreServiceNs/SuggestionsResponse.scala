package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionsResponse extends js.Object {
  def printJson(): String
}

object SuggestionsResponse {
  @scala.inline
  def apply(printJson: () => String): SuggestionsResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
  
    __obj.asInstanceOf[SuggestionsResponse]
  }
}

