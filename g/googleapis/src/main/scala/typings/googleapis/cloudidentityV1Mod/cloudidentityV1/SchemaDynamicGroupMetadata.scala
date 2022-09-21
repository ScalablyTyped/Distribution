package typings.googleapis.cloudidentityV1Mod.cloudidentityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDynamicGroupMetadata extends StObject {
  
  /**
    * Memberships will be the union of all queries. Only one entry with USER resource is currently supported. Customers can create up to 100 dynamic groups.
    */
  var queries: js.UndefOr[js.Array[SchemaDynamicGroupQuery]] = js.undefined
  
  /**
    * Output only. Status of the dynamic group.
    */
  var status: js.UndefOr[SchemaDynamicGroupStatus] = js.undefined
}
object SchemaDynamicGroupMetadata {
  
  inline def apply(): SchemaDynamicGroupMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDynamicGroupMetadata]
  }
  
  extension [Self <: SchemaDynamicGroupMetadata](x: Self) {
    
    inline def setQueries(value: js.Array[SchemaDynamicGroupQuery]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
    
    inline def setQueriesVarargs(value: SchemaDynamicGroupQuery*): Self = StObject.set(x, "queries", js.Array(value*))
    
    inline def setStatus(value: SchemaDynamicGroupStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
