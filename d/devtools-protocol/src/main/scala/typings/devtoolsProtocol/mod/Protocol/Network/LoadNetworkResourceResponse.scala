package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadNetworkResourceResponse extends StObject {
  
  var resource: LoadNetworkResourcePageResult
}
object LoadNetworkResourceResponse {
  
  inline def apply(resource: LoadNetworkResourcePageResult): LoadNetworkResourceResponse = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadNetworkResourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadNetworkResourceResponse] (val x: Self) extends AnyVal {
    
    inline def setResource(value: LoadNetworkResourcePageResult): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
