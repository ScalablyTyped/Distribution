package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResourceContentResponse extends StObject {
  
  /**
    * True, if content was served as base64.
    */
  var base64Encoded: Boolean = js.native
  
  /**
    * Resource content.
    */
  var content: String = js.native
}
object GetResourceContentResponse {
  
  @scala.inline
  def apply(base64Encoded: Boolean, content: String): GetResourceContentResponse = {
    val __obj = js.Dynamic.literal(base64Encoded = base64Encoded.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceContentResponse]
  }
  
  @scala.inline
  implicit class GetResourceContentResponseMutableBuilder[Self <: GetResourceContentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase64Encoded(value: Boolean): Self = StObject.set(x, "base64Encoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
