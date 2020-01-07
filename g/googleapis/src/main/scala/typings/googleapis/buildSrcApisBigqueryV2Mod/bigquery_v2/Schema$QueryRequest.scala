package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$QueryRequest extends js.Object {
  /**
    * [Optional] Specifies the default datasetId and projectId to assume for
    * any unqualified table names in the query. If not set, all table names in
    * the query string must be qualified in the format
    * &#39;datasetId.tableId&#39;.
    */
  var defaultDataset: js.UndefOr[Schema$DatasetReference] = js.native
  /**
    * [Optional] If set to true, BigQuery doesn&#39;t run the job. Instead, if
    * the query is valid, BigQuery returns statistics about the job such as how
    * many bytes would be processed. If the query is invalid, an error returns.
    * The default value is false.
    */
  var dryRun: js.UndefOr[Boolean] = js.native
  /**
    * The resource type of the request.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The geographic location where the job should run. See details at
    * https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * [Optional] The maximum number of rows of data to return per page of
    * results. Setting this flag to a small value such as 1000 and then paging
    * through results might improve reliability when the query result set is
    * large. In addition to this limit, responses are also limited to 10 MB. By
    * default, there is no maximum row count, and only the byte limit applies.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Standard SQL only. Set to POSITIONAL to use positional (?) query
    * parameters or to NAMED to use named (@myparam) query parameters in this
    * query.
    */
  var parameterMode: js.UndefOr[String] = js.native
  /**
    * [Deprecated] This property is deprecated.
    */
  var preserveNulls: js.UndefOr[Boolean] = js.native
  /**
    * [Required] A query string, following the BigQuery query syntax, of the
    * query to execute. Example: &quot;SELECT count(f1) FROM
    * [myProjectId:myDatasetId.myTableId]&quot;.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Query parameters for Standard SQL queries.
    */
  var queryParameters: js.UndefOr[js.Array[Schema$QueryParameter]] = js.native
  /**
    * [Optional] How long to wait for the query to complete, in milliseconds,
    * before the request times out and returns. Note that this is only a
    * timeout for the request, not the query. If the query takes longer to run
    * than the timeout value, the call returns without any results and with the
    * &#39;jobComplete&#39; flag set to false. You can call GetQueryResults()
    * to wait for the query to complete and read the results. The default value
    * is 10000 milliseconds (10 seconds).
    */
  var timeoutMs: js.UndefOr[Double] = js.native
  /**
    * Specifies whether to use BigQuery&#39;s legacy SQL dialect for this
    * query. The default value is true. If set to false, the query will use
    * BigQuery&#39;s standard SQL:
    * https://cloud.google.com/bigquery/sql-reference/ When useLegacySql is set
    * to false, the value of flattenResults is ignored; query will be run as if
    * flattenResults is false.
    */
  var useLegacySql: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] Whether to look for the result in the query cache. The query
    * cache is a best-effort cache that will be flushed whenever tables in the
    * query are modified. The default value is true.
    */
  var useQueryCache: js.UndefOr[Boolean] = js.native
}

object Schema$QueryRequest {
  @scala.inline
  def apply(
    defaultDataset: Schema$DatasetReference = null,
    dryRun: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    location: String = null,
    maxResults: Int | Double = null,
    parameterMode: String = null,
    preserveNulls: js.UndefOr[Boolean] = js.undefined,
    query: String = null,
    queryParameters: js.Array[Schema$QueryParameter] = null,
    timeoutMs: Int | Double = null,
    useLegacySql: js.UndefOr[Boolean] = js.undefined,
    useQueryCache: js.UndefOr[Boolean] = js.undefined
  ): Schema$QueryRequest = {
    val __obj = js.Dynamic.literal()
    if (defaultDataset != null) __obj.updateDynamic("defaultDataset")(defaultDataset.asInstanceOf[js.Any])
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (parameterMode != null) __obj.updateDynamic("parameterMode")(parameterMode.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveNulls)) __obj.updateDynamic("preserveNulls")(preserveNulls.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters.asInstanceOf[js.Any])
    if (timeoutMs != null) __obj.updateDynamic("timeoutMs")(timeoutMs.asInstanceOf[js.Any])
    if (!js.isUndefined(useLegacySql)) __obj.updateDynamic("useLegacySql")(useLegacySql.asInstanceOf[js.Any])
    if (!js.isUndefined(useQueryCache)) __obj.updateDynamic("useQueryCache")(useQueryCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$QueryRequest]
  }
}

