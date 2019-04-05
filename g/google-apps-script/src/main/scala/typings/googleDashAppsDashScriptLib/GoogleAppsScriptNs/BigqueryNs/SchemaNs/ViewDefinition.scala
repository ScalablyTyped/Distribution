package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewDefinition extends js.Object {
  var query: js.UndefOr[java.lang.String] = js.undefined
  var useLegacySql: js.UndefOr[scala.Boolean] = js.undefined
  var userDefinedFunctionResources: js.UndefOr[js.Array[UserDefinedFunctionResource]] = js.undefined
}

object ViewDefinition {
  @scala.inline
  def apply(
    query: java.lang.String = null,
    useLegacySql: js.UndefOr[scala.Boolean] = js.undefined,
    userDefinedFunctionResources: js.Array[UserDefinedFunctionResource] = null
  ): ViewDefinition = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query)
    if (!js.isUndefined(useLegacySql)) __obj.updateDynamic("useLegacySql")(useLegacySql)
    if (userDefinedFunctionResources != null) __obj.updateDynamic("userDefinedFunctionResources")(userDefinedFunctionResources)
    __obj.asInstanceOf[ViewDefinition]
  }
}

