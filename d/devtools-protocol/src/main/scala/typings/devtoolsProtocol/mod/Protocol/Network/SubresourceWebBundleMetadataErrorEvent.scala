package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubresourceWebBundleMetadataErrorEvent extends StObject {
  
  /**
    * Error message
    */
  var errorMessage: String
  
  /**
    * Request identifier. Used to match this information to another event.
    */
  var requestId: RequestId
}
object SubresourceWebBundleMetadataErrorEvent {
  
  inline def apply(errorMessage: String, requestId: RequestId): SubresourceWebBundleMetadataErrorEvent = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubresourceWebBundleMetadataErrorEvent]
  }
  
  extension [Self <: SubresourceWebBundleMetadataErrorEvent](x: Self) {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
