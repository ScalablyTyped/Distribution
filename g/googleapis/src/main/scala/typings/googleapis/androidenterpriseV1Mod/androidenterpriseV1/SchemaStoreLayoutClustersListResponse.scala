package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStoreLayoutClustersListResponse extends StObject {
  
  /**
    * A store cluster of an enterprise.
    */
  var cluster: js.UndefOr[js.Array[SchemaStoreCluster]] = js.undefined
}
object SchemaStoreLayoutClustersListResponse {
  
  inline def apply(): SchemaStoreLayoutClustersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStoreLayoutClustersListResponse]
  }
  
  extension [Self <: SchemaStoreLayoutClustersListResponse](x: Self) {
    
    inline def setCluster(value: js.Array[SchemaStoreCluster]): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setClusterVarargs(value: SchemaStoreCluster*): Self = StObject.set(x, "cluster", js.Array(value*))
  }
}
