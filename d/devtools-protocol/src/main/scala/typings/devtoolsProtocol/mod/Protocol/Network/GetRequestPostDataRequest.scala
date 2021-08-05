package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRequestPostDataRequest extends StObject {
  
  /**
    * Identifier of the network request to get content for.
    */
  var requestId: RequestId
}
object GetRequestPostDataRequest {
  
  inline def apply(requestId: RequestId): GetRequestPostDataRequest = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRequestPostDataRequest]
  }
  
  extension [Self <: GetRequestPostDataRequest](x: Self) {
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
