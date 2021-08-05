package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDocumentContentRequest extends StObject {
  
  /**
    * Frame id to set HTML for.
    */
  var frameId: FrameId
  
  /**
    * HTML content to set.
    */
  var html: String
}
object SetDocumentContentRequest {
  
  inline def apply(frameId: FrameId, html: String): SetDocumentContentRequest = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDocumentContentRequest]
  }
  
  extension [Self <: SetDocumentContentRequest](x: Self) {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
  }
}
