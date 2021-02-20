package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRequestPostDataRequest extends StObject {
  
  /**
    * Identifier of the network request to get content for.
    */
  var requestId: RequestId = js.native
}
object GetRequestPostDataRequest {
  
  @scala.inline
  def apply(requestId: RequestId): GetRequestPostDataRequest = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRequestPostDataRequest]
  }
  
  @scala.inline
  implicit class GetRequestPostDataRequestMutableBuilder[Self <: GetRequestPostDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
