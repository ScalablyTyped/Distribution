package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionResponse extends js.Object {
  def printJson(): java.lang.String
}

object ActionResponse {
  @scala.inline
  def apply(printJson: js.Function0[java.lang.String]): ActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("printJson")(printJson)
    __obj.asInstanceOf[ActionResponse]
  }
}

