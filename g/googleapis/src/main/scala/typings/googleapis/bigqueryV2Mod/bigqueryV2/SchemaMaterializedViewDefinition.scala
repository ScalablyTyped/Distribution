package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMaterializedViewDefinition extends StObject {
  
  /**
    * [Optional] [TrustedTester] Enable automatic refresh of the materialized view when the base table is updated. The default value is "true".
    */
  var enableRefresh: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * [Output-only] [TrustedTester] The time when this materialized view was last modified, in milliseconds since the epoch.
    */
  var lastRefreshTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Optional] Max staleness of data that could be returned when materizlized view is queried (formatted as Google SQL Interval type).
    */
  var maxStaleness: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Required] A query whose result is persisted.
    */
  var query: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Optional] [TrustedTester] The maximum frequency at which this materialized view will be refreshed. The default value is "1800000" (30 minutes).
    */
  var refreshIntervalMs: js.UndefOr[String | Null] = js.undefined
}
object SchemaMaterializedViewDefinition {
  
  inline def apply(): SchemaMaterializedViewDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaterializedViewDefinition]
  }
  
  extension [Self <: SchemaMaterializedViewDefinition](x: Self) {
    
    inline def setEnableRefresh(value: Boolean): Self = StObject.set(x, "enableRefresh", value.asInstanceOf[js.Any])
    
    inline def setEnableRefreshNull: Self = StObject.set(x, "enableRefresh", null)
    
    inline def setEnableRefreshUndefined: Self = StObject.set(x, "enableRefresh", js.undefined)
    
    inline def setLastRefreshTime(value: String): Self = StObject.set(x, "lastRefreshTime", value.asInstanceOf[js.Any])
    
    inline def setLastRefreshTimeNull: Self = StObject.set(x, "lastRefreshTime", null)
    
    inline def setLastRefreshTimeUndefined: Self = StObject.set(x, "lastRefreshTime", js.undefined)
    
    inline def setMaxStaleness(value: String): Self = StObject.set(x, "maxStaleness", value.asInstanceOf[js.Any])
    
    inline def setMaxStalenessNull: Self = StObject.set(x, "maxStaleness", null)
    
    inline def setMaxStalenessUndefined: Self = StObject.set(x, "maxStaleness", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRefreshIntervalMs(value: String): Self = StObject.set(x, "refreshIntervalMs", value.asInstanceOf[js.Any])
    
    inline def setRefreshIntervalMsNull: Self = StObject.set(x, "refreshIntervalMs", null)
    
    inline def setRefreshIntervalMsUndefined: Self = StObject.set(x, "refreshIntervalMs", js.undefined)
  }
}
