package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The metadata for the Operation returned by UpdateCluster.
  */
trait SchemaUpdateClusterMetadata extends StObject {
  
  /**
    * The time at which the operation failed or was completed successfully.
    */
  var finishTime: js.UndefOr[String] = js.undefined
  
  /**
    * The request that prompted the initiation of this UpdateCluster operation.
    */
  var originalRequest: js.UndefOr[SchemaCluster] = js.undefined
  
  /**
    * The time at which the original request was received.
    */
  var requestTime: js.UndefOr[String] = js.undefined
}
object SchemaUpdateClusterMetadata {
  
  inline def apply(): SchemaUpdateClusterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateClusterMetadata]
  }
  
  extension [Self <: SchemaUpdateClusterMetadata](x: Self) {
    
    inline def setFinishTime(value: String): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    inline def setFinishTimeUndefined: Self = StObject.set(x, "finishTime", js.undefined)
    
    inline def setOriginalRequest(value: SchemaCluster): Self = StObject.set(x, "originalRequest", value.asInstanceOf[js.Any])
    
    inline def setOriginalRequestUndefined: Self = StObject.set(x, "originalRequest", js.undefined)
    
    inline def setRequestTime(value: String): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeUndefined: Self = StObject.set(x, "requestTime", js.undefined)
  }
}
