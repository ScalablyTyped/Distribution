package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevertBuiltInVariableResponse extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
}

object RevertBuiltInVariableResponse {
  @scala.inline
  def apply(enabled: js.UndefOr[scala.Boolean] = js.undefined): RevertBuiltInVariableResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[RevertBuiltInVariableResponse]
  }
}

