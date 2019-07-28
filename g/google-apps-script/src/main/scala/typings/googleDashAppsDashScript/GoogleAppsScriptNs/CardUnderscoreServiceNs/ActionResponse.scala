package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionResponse extends js.Object {
  def printJson(): String
}

object ActionResponse {
  @scala.inline
  def apply(printJson: () => String): ActionResponse = {
    val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
  
    __obj.asInstanceOf[ActionResponse]
  }
}

