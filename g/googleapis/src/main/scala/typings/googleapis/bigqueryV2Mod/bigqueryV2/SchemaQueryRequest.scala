package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryRequest extends StObject {
  
  /**
    * [Optional] Specifies the default datasetId and projectId to assume for
    * any unqualified table names in the query. If not set, all table names in
    * the query string must be qualified in the format
    * &#39;datasetId.tableId&#39;.
    */
  var defaultDataset: js.UndefOr[SchemaDatasetReference] = js.undefined
  
  /**
    * [Optional] If set to true, BigQuery doesn&#39;t run the job. Instead, if
    * the query is valid, BigQuery returns statistics about the job such as how
    * many bytes would be processed. If the query is invalid, an error returns.
    * The default value is false.
    */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The resource type of the request.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The geographic location where the job should run. See details at
    * https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] The maximum number of rows of data to return per page of
    * results. Setting this flag to a small value such as 1000 and then paging
    * through results might improve reliability when the query result set is
    * large. In addition to this limit, responses are also limited to 10 MB. By
    * default, there is no maximum row count, and only the byte limit applies.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Standard SQL only. Set to POSITIONAL to use positional (?) query
    * parameters or to NAMED to use named (@myparam) query parameters in this
    * query.
    */
  var parameterMode: js.UndefOr[String] = js.undefined
  
  /**
    * [Deprecated] This property is deprecated.
    */
  var preserveNulls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [Required] A query string, following the BigQuery query syntax, of the
    * query to execute. Example: &quot;SELECT count(f1) FROM
    * [myProjectId:myDatasetId.myTableId]&quot;.
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * Query parameters for Standard SQL queries.
    */
  var queryParameters: js.UndefOr[js.Array[SchemaQueryParameter]] = js.undefined
  
  /**
    * [Optional] How long to wait for the query to complete, in milliseconds,
    * before the request times out and returns. Note that this is only a
    * timeout for the request, not the query. If the query takes longer to run
    * than the timeout value, the call returns without any results and with the
    * &#39;jobComplete&#39; flag set to false. You can call GetQueryResults()
    * to wait for the query to complete and read the results. The default value
    * is 10000 milliseconds (10 seconds).
    */
  var timeoutMs: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether to use BigQuery&#39;s legacy SQL dialect for this
    * query. The default value is true. If set to false, the query will use
    * BigQuery&#39;s standard SQL:
    * https://cloud.google.com/bigquery/sql-reference/ When useLegacySql is set
    * to false, the value of flattenResults is ignored; query will be run as if
    * flattenResults is false.
    */
  var useLegacySql: js.UndefOr[Boolean] = js.undefined
  
  /**
    * [Optional] Whether to look for the result in the query cache. The query
    * cache is a best-effort cache that will be flushed whenever tables in the
    * query are modified. The default value is true.
    */
  var useQueryCache: js.UndefOr[Boolean] = js.undefined
}
object SchemaQueryRequest {
  
  @scala.inline
  def apply(): SchemaQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryRequest]
  }
  
  @scala.inline
  implicit class SchemaQueryRequestMutableBuilder[Self <: SchemaQueryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultDataset(value: SchemaDatasetReference): Self = StObject.set(x, "defaultDataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDatasetUndefined: Self = StObject.set(x, "defaultDataset", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setParameterMode(value: String): Self = StObject.set(x, "parameterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterModeUndefined: Self = StObject.set(x, "parameterMode", js.undefined)
    
    @scala.inline
    def setPreserveNulls(value: Boolean): Self = StObject.set(x, "preserveNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveNullsUndefined: Self = StObject.set(x, "preserveNulls", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParameters(value: js.Array[SchemaQueryParameter]): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    
    @scala.inline
    def setQueryParametersVarargs(value: SchemaQueryParameter*): Self = StObject.set(x, "queryParameters", js.Array(value :_*))
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setTimeoutMs(value: Double): Self = StObject.set(x, "timeoutMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutMsUndefined: Self = StObject.set(x, "timeoutMs", js.undefined)
    
    @scala.inline
    def setUseLegacySql(value: Boolean): Self = StObject.set(x, "useLegacySql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLegacySqlUndefined: Self = StObject.set(x, "useLegacySql", js.undefined)
    
    @scala.inline
    def setUseQueryCache(value: Boolean): Self = StObject.set(x, "useQueryCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseQueryCacheUndefined: Self = StObject.set(x, "useQueryCache", js.undefined)
  }
}
