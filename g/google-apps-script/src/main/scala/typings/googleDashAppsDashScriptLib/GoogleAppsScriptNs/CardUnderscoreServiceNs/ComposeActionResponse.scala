package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeActionResponse extends js.Object {
  def printJson(): java.lang.String
}

object ComposeActionResponse {
  @scala.inline
  def apply(printJson: () => java.lang.String): ComposeActionResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
  
    __obj.asInstanceOf[ComposeActionResponse]
  }
}

