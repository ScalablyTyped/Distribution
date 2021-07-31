package typings.devtoolsProtocol.mod.Protocol.Audits

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEncodedResponseResponse extends StObject {
  
  /**
    * The encoded body as a base64 string. Omitted if sizeOnly is true.
    */
  var body: js.UndefOr[String] = js.undefined
  
  /**
    * Size after re-encoding.
    */
  var encodedSize: integer
  
  /**
    * Size before re-encoding.
    */
  var originalSize: integer
}
object GetEncodedResponseResponse {
  
  @scala.inline
  def apply(encodedSize: integer, originalSize: integer): GetEncodedResponseResponse = {
    val __obj = js.Dynamic.literal(encodedSize = encodedSize.asInstanceOf[js.Any], originalSize = originalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEncodedResponseResponse]
  }
  
  @scala.inline
  implicit class GetEncodedResponseResponseMutableBuilder[Self <: GetEncodedResponseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setEncodedSize(value: integer): Self = StObject.set(x, "encodedSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalSize(value: integer): Self = StObject.set(x, "originalSize", value.asInstanceOf[js.Any])
  }
}
