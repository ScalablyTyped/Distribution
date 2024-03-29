package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSingleClusterRouting extends StObject {
  
  /**
    * Whether or not `CheckAndMutateRow` and `ReadModifyWriteRow` requests are allowed by this app profile. It is unsafe to send these requests to the same table/row/column in multiple clusters.
    */
  var allowTransactionalWrites: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The cluster to which read/write requests should be routed.
    */
  var clusterId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSingleClusterRouting {
  
  inline def apply(): SchemaSingleClusterRouting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSingleClusterRouting]
  }
  
  extension [Self <: SchemaSingleClusterRouting](x: Self) {
    
    inline def setAllowTransactionalWrites(value: Boolean): Self = StObject.set(x, "allowTransactionalWrites", value.asInstanceOf[js.Any])
    
    inline def setAllowTransactionalWritesNull: Self = StObject.set(x, "allowTransactionalWrites", null)
    
    inline def setAllowTransactionalWritesUndefined: Self = StObject.set(x, "allowTransactionalWrites", js.undefined)
    
    inline def setClusterId(value: String): Self = StObject.set(x, "clusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdNull: Self = StObject.set(x, "clusterId", null)
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "clusterId", js.undefined)
  }
}
