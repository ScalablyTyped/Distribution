package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaNetworkEndpointGroupsDetachEndpointsRequest extends StObject {
  
  /**
    * The list of network endpoints to be detached.
    */
  var networkEndpoints: js.UndefOr[js.Array[SchemaNetworkEndpoint]] = js.native
}
object SchemaNetworkEndpointGroupsDetachEndpointsRequest {
  
  @scala.inline
  def apply(): SchemaNetworkEndpointGroupsDetachEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroupsDetachEndpointsRequest]
  }
  
  @scala.inline
  implicit class SchemaNetworkEndpointGroupsDetachEndpointsRequestMutableBuilder[Self <: SchemaNetworkEndpointGroupsDetachEndpointsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkEndpoints(value: js.Array[SchemaNetworkEndpoint]): Self = StObject.set(x, "networkEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkEndpointsUndefined: Self = StObject.set(x, "networkEndpoints", js.undefined)
    
    @scala.inline
    def setNetworkEndpointsVarargs(value: SchemaNetworkEndpoint*): Self = StObject.set(x, "networkEndpoints", js.Array(value :_*))
  }
}
