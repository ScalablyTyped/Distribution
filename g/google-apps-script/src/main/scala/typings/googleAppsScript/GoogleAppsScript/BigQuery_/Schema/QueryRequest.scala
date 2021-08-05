package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRequest extends StObject {
  
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
  
  inline def apply(): QueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRequest]
  }
  
  extension [Self <: QueryRequest](x: Self) {
    
    inline def setDefaultDataset(value: DatasetReference): Self = StObject.set(x, "defaultDataset", value.asInstanceOf[js.Any])
    
    inline def setDefaultDatasetUndefined: Self = StObject.set(x, "defaultDataset", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setParameterMode(value: String): Self = StObject.set(x, "parameterMode", value.asInstanceOf[js.Any])
    
    inline def setParameterModeUndefined: Self = StObject.set(x, "parameterMode", js.undefined)
    
    inline def setPreserveNulls(value: Boolean): Self = StObject.set(x, "preserveNulls", value.asInstanceOf[js.Any])
    
    inline def setPreserveNullsUndefined: Self = StObject.set(x, "preserveNulls", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryParameters(value: js.Array[QueryParameter]): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    
    inline def setQueryParametersVarargs(value: QueryParameter*): Self = StObject.set(x, "queryParameters", js.Array(value :_*))
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setTimeoutMs(value: Double): Self = StObject.set(x, "timeoutMs", value.asInstanceOf[js.Any])
    
    inline def setTimeoutMsUndefined: Self = StObject.set(x, "timeoutMs", js.undefined)
    
    inline def setUseLegacySql(value: Boolean): Self = StObject.set(x, "useLegacySql", value.asInstanceOf[js.Any])
    
    inline def setUseLegacySqlUndefined: Self = StObject.set(x, "useLegacySql", js.undefined)
    
    inline def setUseQueryCache(value: Boolean): Self = StObject.set(x, "useQueryCache", value.asInstanceOf[js.Any])
    
    inline def setUseQueryCacheUndefined: Self = StObject.set(x, "useQueryCache", js.undefined)
  }
}
