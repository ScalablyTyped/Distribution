package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewDefinition extends js.Object {
  var query: js.UndefOr[String] = js.undefined
  var useLegacySql: js.UndefOr[Boolean] = js.undefined
  var userDefinedFunctionResources: js.UndefOr[js.Array[UserDefinedFunctionResource]] = js.undefined
}

object ViewDefinition {
  @scala.inline
  def apply(
    query: String = null,
    useLegacySql: js.UndefOr[Boolean] = js.undefined,
    userDefinedFunctionResources: js.Array[UserDefinedFunctionResource] = null
  ): ViewDefinition = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(useLegacySql)) __obj.updateDynamic("useLegacySql")(useLegacySql.asInstanceOf[js.Any])
    if (userDefinedFunctionResources != null) __obj.updateDynamic("userDefinedFunctionResources")(userDefinedFunctionResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewDefinition]
  }
}

