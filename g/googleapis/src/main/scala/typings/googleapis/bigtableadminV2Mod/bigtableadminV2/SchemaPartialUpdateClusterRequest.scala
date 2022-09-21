package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPartialUpdateClusterRequest extends StObject {
  
  /**
    * Required. The Cluster which contains the partial updates to be applied, subject to the update_mask.
    */
  var cluster: js.UndefOr[SchemaCluster] = js.undefined
  
  /**
    * Required. The subset of Cluster fields which should be replaced.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaPartialUpdateClusterRequest {
  
  inline def apply(): SchemaPartialUpdateClusterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartialUpdateClusterRequest]
  }
  
  extension [Self <: SchemaPartialUpdateClusterRequest](x: Self) {
    
    inline def setCluster(value: SchemaCluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
