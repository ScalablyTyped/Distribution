package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubresourceWebBundleInnerResponseErrorEvent extends StObject {
  
  /**
    * Bundle request identifier. Used to match this information to another event.
    * This made be absent in case when the instrumentation was enabled only
    * after webbundle was parsed.
    */
  var bundleRequestId: js.UndefOr[RequestId] = js.undefined
  
  /**
    * Error message
    */
  var errorMessage: String
  
  /**
    * Request identifier of the subresource request
    */
  var innerRequestId: RequestId
  
  /**
    * URL of the subresource resource.
    */
  var innerRequestURL: String
}
object SubresourceWebBundleInnerResponseErrorEvent {
  
  inline def apply(errorMessage: String, innerRequestId: RequestId, innerRequestURL: String): SubresourceWebBundleInnerResponseErrorEvent = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], innerRequestId = innerRequestId.asInstanceOf[js.Any], innerRequestURL = innerRequestURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubresourceWebBundleInnerResponseErrorEvent]
  }
  
  extension [Self <: SubresourceWebBundleInnerResponseErrorEvent](x: Self) {
    
    inline def setBundleRequestId(value: RequestId): Self = StObject.set(x, "bundleRequestId", value.asInstanceOf[js.Any])
    
    inline def setBundleRequestIdUndefined: Self = StObject.set(x, "bundleRequestId", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setInnerRequestId(value: RequestId): Self = StObject.set(x, "innerRequestId", value.asInstanceOf[js.Any])
    
    inline def setInnerRequestURL(value: String): Self = StObject.set(x, "innerRequestURL", value.asInstanceOf[js.Any])
  }
}
