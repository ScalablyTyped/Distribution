package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponseBodyRequest extends StObject {
  
  /**
    * Identifier of the network request to get content for.
    */
  var requestId: RequestId
}
object GetResponseBodyRequest {
  
  inline def apply(requestId: RequestId): GetResponseBodyRequest = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponseBodyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponseBodyRequest] (val x: Self) extends AnyVal {
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
