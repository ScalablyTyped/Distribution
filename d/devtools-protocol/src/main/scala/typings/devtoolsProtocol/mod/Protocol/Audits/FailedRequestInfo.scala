package typings.devtoolsProtocol.mod.Protocol.Audits

import typings.devtoolsProtocol.mod.Protocol.Network.RequestId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedRequestInfo extends StObject {
  
  /**
    * The failure message for the failed request.
    */
  var failureMessage: String
  
  var requestId: js.UndefOr[RequestId] = js.undefined
  
  /**
    * The URL that failed to load.
    */
  var url: String
}
object FailedRequestInfo {
  
  inline def apply(failureMessage: String, url: String): FailedRequestInfo = {
    val __obj = js.Dynamic.literal(failureMessage = failureMessage.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedRequestInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailedRequestInfo] (val x: Self) extends AnyVal {
    
    inline def setFailureMessage(value: String): Self = StObject.set(x, "failureMessage", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
