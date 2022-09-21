package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkEndpointGroupsListEndpointsRequest extends StObject {
  
  /**
    * Optional list of endpoints to query. This is a more efficient but also limited version of filter parameter. Endpoints in the filter must have ip_address and port fields populated, other fields are not supported.
    */
  var endpointFilters: js.UndefOr[js.Array[SchemaNetworkEndpointGroupsListEndpointsRequestNetworkEndpointFilter]] = js.undefined
  
  /**
    * Optional query parameter for showing the health status of each network endpoint. Valid options are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints will not be provided.
    */
  var healthStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaNetworkEndpointGroupsListEndpointsRequest {
  
  inline def apply(): SchemaNetworkEndpointGroupsListEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroupsListEndpointsRequest]
  }
  
  extension [Self <: SchemaNetworkEndpointGroupsListEndpointsRequest](x: Self) {
    
    inline def setEndpointFilters(value: js.Array[SchemaNetworkEndpointGroupsListEndpointsRequestNetworkEndpointFilter]): Self = StObject.set(x, "endpointFilters", value.asInstanceOf[js.Any])
    
    inline def setEndpointFiltersUndefined: Self = StObject.set(x, "endpointFilters", js.undefined)
    
    inline def setEndpointFiltersVarargs(value: SchemaNetworkEndpointGroupsListEndpointsRequestNetworkEndpointFilter*): Self = StObject.set(x, "endpointFilters", js.Array(value*))
    
    inline def setHealthStatus(value: String): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusNull: Self = StObject.set(x, "healthStatus", null)
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
  }
}
