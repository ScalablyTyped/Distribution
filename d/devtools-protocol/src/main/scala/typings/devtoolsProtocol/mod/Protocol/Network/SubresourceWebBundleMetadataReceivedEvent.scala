package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubresourceWebBundleMetadataReceivedEvent extends StObject {
  
  /**
    * Request identifier. Used to match this information to another event.
    */
  var requestId: RequestId
  
  /**
    * A list of URLs of resources in the subresource Web Bundle.
    */
  var urls: js.Array[String]
}
object SubresourceWebBundleMetadataReceivedEvent {
  
  inline def apply(requestId: RequestId, urls: js.Array[String]): SubresourceWebBundleMetadataReceivedEvent = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubresourceWebBundleMetadataReceivedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubresourceWebBundleMetadataReceivedEvent] (val x: Self) extends AnyVal {
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
