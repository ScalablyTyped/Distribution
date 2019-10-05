package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRequest extends js.Object {
  var defaultDataset: js.UndefOr[DatasetReference] = js.undefined
  var dryRun: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var maxResults: js.UndefOr[Double] = js.undefined
  var parameterMode: js.UndefOr[String] = js.undefined
  var preserveNulls: js.UndefOr[Boolean] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var queryParameters: js.UndefOr[js.Array[QueryParameter]] = js.undefined
  var timeoutMs: js.UndefOr[Double] = js.undefined
  var useLegacySql: js.UndefOr[Boolean] = js.undefined
  var useQueryCache: js.UndefOr[Boolean] = js.undefined
}

object QueryRequest {
  @scala.inline
  def apply(
    defaultDataset: DatasetReference = null,
    dryRun: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    location: String = null,
    maxResults: Int | Double = null,
    parameterMode: String = null,
    preserveNulls: js.UndefOr[Boolean] = js.undefined,
    query: String = null,
    queryParameters: js.Array[QueryParameter] = null,
    timeoutMs: Int | Double = null,
    useLegacySql: js.UndefOr[Boolean] = js.undefined,
    useQueryCache: js.UndefOr[Boolean] = js.undefined
  ): QueryRequest = {
    val __obj = js.Dynamic.literal()
    if (defaultDataset != null) __obj.updateDynamic("defaultDataset")(defaultDataset)
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (location != null) __obj.updateDynamic("location")(location)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (parameterMode != null) __obj.updateDynamic("parameterMode")(parameterMode)
    if (!js.isUndefined(preserveNulls)) __obj.updateDynamic("preserveNulls")(preserveNulls)
    if (query != null) __obj.updateDynamic("query")(query)
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters)
    if (timeoutMs != null) __obj.updateDynamic("timeoutMs")(timeoutMs.asInstanceOf[js.Any])
    if (!js.isUndefined(useLegacySql)) __obj.updateDynamic("useLegacySql")(useLegacySql)
    if (!js.isUndefined(useQueryCache)) __obj.updateDynamic("useQueryCache")(useQueryCache)
    __obj.asInstanceOf[QueryRequest]
  }
}

