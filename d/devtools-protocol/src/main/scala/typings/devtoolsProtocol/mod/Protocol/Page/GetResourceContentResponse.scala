package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceContentResponse extends StObject {
  
  /**
    * True, if content was served as base64.
    */
  var base64Encoded: Boolean
  
  /**
    * Resource content.
    */
  var content: String
}
object GetResourceContentResponse {
  
  inline def apply(base64Encoded: Boolean, content: String): GetResourceContentResponse = {
    val __obj = js.Dynamic.literal(base64Encoded = base64Encoded.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceContentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourceContentResponse] (val x: Self) extends AnyVal {
    
    inline def setBase64Encoded(value: Boolean): Self = StObject.set(x, "base64Encoded", value.asInstanceOf[js.Any])
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
