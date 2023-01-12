package typings.devtoolsProtocol.mod.Protocol.Fetch

import typings.devtoolsProtocol.mod.Protocol.Network.ErrorReason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailRequestRequest extends StObject {
  
  /**
    * Causes the request to fail with the given reason.
    */
  var errorReason: ErrorReason
  
  /**
    * An id the client received in requestPaused event.
    */
  var requestId: RequestId
}
object FailRequestRequest {
  
  inline def apply(errorReason: ErrorReason, requestId: RequestId): FailRequestRequest = {
    val __obj = js.Dynamic.literal(errorReason = errorReason.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailRequestRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailRequestRequest] (val x: Self) extends AnyVal {
    
    inline def setErrorReason(value: ErrorReason): Self = StObject.set(x, "errorReason", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
