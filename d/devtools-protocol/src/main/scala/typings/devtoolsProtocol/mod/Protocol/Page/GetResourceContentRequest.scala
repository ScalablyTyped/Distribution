package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceContentRequest extends StObject {
  
  /**
    * Frame id to get resource for.
    */
  var frameId: FrameId
  
  /**
    * URL of the resource to get content for.
    */
  var url: String
}
object GetResourceContentRequest {
  
  inline def apply(frameId: FrameId, url: String): GetResourceContentRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceContentRequest]
  }
  
  extension [Self <: GetResourceContentRequest](x: Self) {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
