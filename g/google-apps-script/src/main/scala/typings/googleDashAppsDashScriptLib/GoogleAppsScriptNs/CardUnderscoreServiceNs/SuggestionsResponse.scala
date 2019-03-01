package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestionsResponse extends js.Object {
  def printJson(): java.lang.String
}

object SuggestionsResponse {
  @scala.inline
  def apply(printJson: js.Function0[java.lang.String]): SuggestionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("printJson")(printJson)
    __obj.asInstanceOf[SuggestionsResponse]
  }
}

