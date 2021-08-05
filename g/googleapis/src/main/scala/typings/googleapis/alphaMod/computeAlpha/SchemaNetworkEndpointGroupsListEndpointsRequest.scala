package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkEndpointGroupsListEndpointsRequest extends StObject {
  
  /**
    * Optional query parameter for showing the health status of each network
    * endpoint. Valid options are SKIP or SHOW. If you don&#39;t specifiy this
    * parameter, the health status of network endpoints will not be provided.
    */
  var healthStatus: js.UndefOr[String] = js.undefined
}
object SchemaNetworkEndpointGroupsListEndpointsRequest {
  
  inline def apply(): SchemaNetworkEndpointGroupsListEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroupsListEndpointsRequest]
  }
  
  extension [Self <: SchemaNetworkEndpointGroupsListEndpointsRequest](x: Self) {
    
    inline def setHealthStatus(value: String): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
  }
}
