package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewDefinition extends js.Object {
  /** [Required] A query that BigQuery executes when the view is referenced. */
  var query: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies whether to use BigQuery's legacy SQL for this view. The default value is true. If set to false, the view will use BigQuery's standard SQL:
    * https://cloud.google.com/bigquery/sql-reference/ Queries and views that reference this view must use the same flag value.
    */
  var useLegacySql: js.UndefOr[scala.Boolean] = js.undefined
  /** Describes user-defined function resources used in the query. */
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

