package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkEndpointGroupsAttachEndpointsRequest extends StObject {
  
  /**
    * The list of network endpoints to be attached.
    */
  var networkEndpoints: js.UndefOr[js.Array[SchemaNetworkEndpoint]] = js.undefined
}
object SchemaNetworkEndpointGroupsAttachEndpointsRequest {
  
  @scala.inline
  def apply(): SchemaNetworkEndpointGroupsAttachEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroupsAttachEndpointsRequest]
  }
  
  @scala.inline
  implicit class SchemaNetworkEndpointGroupsAttachEndpointsRequestMutableBuilder[Self <: SchemaNetworkEndpointGroupsAttachEndpointsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkEndpoints(value: js.Array[SchemaNetworkEndpoint]): Self = StObject.set(x, "networkEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkEndpointsUndefined: Self = StObject.set(x, "networkEndpoints", js.undefined)
    
    @scala.inline
    def setNetworkEndpointsVarargs(value: SchemaNetworkEndpoint*): Self = StObject.set(x, "networkEndpoints", js.Array(value :_*))
  }
}
