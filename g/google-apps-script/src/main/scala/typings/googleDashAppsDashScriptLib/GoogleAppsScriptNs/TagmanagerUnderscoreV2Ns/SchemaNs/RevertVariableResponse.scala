package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevertVariableResponse extends js.Object {
  var variable: js.UndefOr[Variable] = js.undefined
}

object RevertVariableResponse {
  @scala.inline
  def apply(variable: Variable = null): RevertVariableResponse = {
    val __obj = js.Dynamic.literal()
    if (variable != null) __obj.updateDynamic("variable")(variable)
    __obj.asInstanceOf[RevertVariableResponse]
  }
}

