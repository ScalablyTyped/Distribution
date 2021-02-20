package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadNetworkResourceResponse extends StObject {
  
  var resource: LoadNetworkResourcePageResult = js.native
}
object LoadNetworkResourceResponse {
  
  @scala.inline
  def apply(resource: LoadNetworkResourcePageResult): LoadNetworkResourceResponse = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadNetworkResourceResponse]
  }
  
  @scala.inline
  implicit class LoadNetworkResourceResponseMutableBuilder[Self <: LoadNetworkResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: LoadNetworkResourcePageResult): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
