package typings.gapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryRequest extends js.Object {
  /**
    * [Optional] Specifies the default datasetId and projectId to assume for any unqualified table names in the query. If not set, all table names in the
    * query string must be qualified in the format 'datasetId.tableId'.
    */
  var defaultDataset: js.UndefOr[DatasetReference] = js.native
  /**
    * [Optional] If set to true, BigQuery doesn't run the job. Instead, if the query is valid, BigQuery returns statistics about the job such as how many
    * bytes would be processed. If the query is invalid, an error returns. The default value is false.
    */
  var dryRun: js.UndefOr[Boolean] = js.native
  /** The resource type of the request. */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Optional] The maximum number of rows of data to return per page of results. Setting this flag to a small value such as 1000 and then paging through
    * results might improve reliability when the query result set is large. In addition to this limit, responses are also limited to 10 MB. By default, there
    * is no maximum row count, and only the byte limit applies.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /** Standard SQL only. Set to POSITIONAL to use positional (?) query parameters or to NAMED to use named (@myparam) query parameters in this query. */
  var parameterMode: js.UndefOr[String] = js.native
  /** [Deprecated] This property is deprecated. */
  var preserveNulls: js.UndefOr[Boolean] = js.native
  /**
    * [Required] A query string, following the BigQuery query syntax, of the query to execute. Example: "SELECT count(f1) FROM
    * [myProjectId:myDatasetId.myTableId]".
    */
  var query: js.UndefOr[String] = js.native
  /** Query parameters for Standard SQL queries. */
  var queryParameters: js.UndefOr[js.Array[QueryParameter]] = js.native
  /**
    * [Optional] How long to wait for the query to complete, in milliseconds, before the request times out and returns. Note that this is only a timeout for
    * the request, not the query. If the query takes longer to run than the timeout value, the call returns without any results and with the 'jobComplete'
    * flag set to false. You can call GetQueryResults() to wait for the query to complete and read the results. The default value is 10000 milliseconds (10
    * seconds).
    */
  var timeoutMs: js.UndefOr[Double] = js.native
  /**
    * Specifies whether to use BigQuery's legacy SQL dialect for this query. The default value is true. If set to false, the query will use BigQuery's
    * standard SQL: https://cloud.google.com/bigquery/sql-reference/ When useLegacySql is set to false, the value of flattenResults is ignored; query will be
    * run as if flattenResults is false.
    */
  var useLegacySql: js.UndefOr[Boolean] = js.native
  /**
    * [Optional] Whether to look for the result in the query cache. The query cache is a best-effort cache that will be flushed whenever tables in the query
    * are modified. The default value is true.
    */
  var useQueryCache: js.UndefOr[Boolean] = js.native
}

object QueryRequest {
  @scala.inline
  def apply(): QueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRequest]
  }
  @scala.inline
  implicit class QueryRequestOps[Self <: QueryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultDataset(value: DatasetReference): Self = this.set("defaultDataset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDataset: Self = this.set("defaultDataset", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setParameterMode(value: String): Self = this.set("parameterMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterMode: Self = this.set("parameterMode", js.undefined)
    @scala.inline
    def setPreserveNulls(value: Boolean): Self = this.set("preserveNulls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveNulls: Self = this.set("preserveNulls", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setQueryParametersVarargs(value: QueryParameter*): Self = this.set("queryParameters", js.Array(value :_*))
    @scala.inline
    def setQueryParameters(value: js.Array[QueryParameter]): Self = this.set("queryParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryParameters: Self = this.set("queryParameters", js.undefined)
    @scala.inline
    def setTimeoutMs(value: Double): Self = this.set("timeoutMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutMs: Self = this.set("timeoutMs", js.undefined)
    @scala.inline
    def setUseLegacySql(value: Boolean): Self = this.set("useLegacySql", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseLegacySql: Self = this.set("useLegacySql", js.undefined)
    @scala.inline
    def setUseQueryCache(value: Boolean): Self = this.set("useQueryCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseQueryCache: Self = this.set("useQueryCache", js.undefined)
  }
  
}

