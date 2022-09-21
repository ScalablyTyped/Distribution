package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMultiClusterRoutingUseAny extends StObject {
  
  /**
    * The set of clusters to route to. The order is ignored; clusters will be tried in order of distance. If left empty, all clusters are eligible.
    */
  var clusterIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaMultiClusterRoutingUseAny {
  
  inline def apply(): SchemaMultiClusterRoutingUseAny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMultiClusterRoutingUseAny]
  }
  
  extension [Self <: SchemaMultiClusterRoutingUseAny](x: Self) {
    
    inline def setClusterIds(value: js.Array[String]): Self = StObject.set(x, "clusterIds", value.asInstanceOf[js.Any])
    
    inline def setClusterIdsNull: Self = StObject.set(x, "clusterIds", null)
    
    inline def setClusterIdsUndefined: Self = StObject.set(x, "clusterIds", js.undefined)
    
    inline def setClusterIdsVarargs(value: String*): Self = StObject.set(x, "clusterIds", js.Array(value*))
  }
}
