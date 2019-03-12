package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniversalActionResponse extends js.Object {
  def printJson(): java.lang.String
}

object UniversalActionResponse {
  @scala.inline
  def apply(printJson: () => java.lang.String): UniversalActionResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
  
    __obj.asInstanceOf[UniversalActionResponse]
  }
}

