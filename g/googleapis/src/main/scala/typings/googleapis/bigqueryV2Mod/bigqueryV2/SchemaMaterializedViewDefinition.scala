package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMaterializedViewDefinition extends StObject {
  
  /**
    * [Output-only] [TrustedTester] The time when this materialized view was
    * last modified, in milliseconds since the epoch.
    */
  var lastRefreshTime: js.UndefOr[String] = js.undefined
  
  /**
    * [Required] A query whose result is persisted.
    */
  var query: js.UndefOr[String] = js.undefined
}
object SchemaMaterializedViewDefinition {
  
  inline def apply(): SchemaMaterializedViewDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaterializedViewDefinition]
  }
  
  extension [Self <: SchemaMaterializedViewDefinition](x: Self) {
    
    inline def setLastRefreshTime(value: String): Self = StObject.set(x, "lastRefreshTime", value.asInstanceOf[js.Any])
    
    inline def setLastRefreshTimeUndefined: Self = StObject.set(x, "lastRefreshTime", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
