package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkEndpointGroupsListEndpointsRequestNetworkEndpointFilter extends StObject {
  
  var networkEndpoint: js.UndefOr[SchemaNetworkEndpoint] = js.undefined
}
object SchemaNetworkEndpointGroupsListEndpointsRequestNetworkEndpointFilter {
  
  inline def apply(): SchemaNetworkEndpointGroupsListEndpointsRequestNetworkEndpointFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroupsListEndpointsRequestNetworkEndpointFilter]
  }
  
  extension [Self <: SchemaNetworkEndpointGroupsListEndpointsRequestNetworkEndpointFilter](x: Self) {
    
    inline def setNetworkEndpoint(value: SchemaNetworkEndpoint): Self = StObject.set(x, "networkEndpoint", value.asInstanceOf[js.Any])
    
    inline def setNetworkEndpointUndefined: Self = StObject.set(x, "networkEndpoint", js.undefined)
  }
}
