package typings.devtoolsProtocol.mod.Protocol.Audits

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEncodedResponseResponse extends StObject {
  
  /**
    * The encoded body as a base64 string. Omitted if sizeOnly is true. (Encoded as a base64 string when passed over JSON)
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
  
  inline def apply(encodedSize: integer, originalSize: integer): GetEncodedResponseResponse = {
    val __obj = js.Dynamic.literal(encodedSize = encodedSize.asInstanceOf[js.Any], originalSize = originalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEncodedResponseResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEncodedResponseResponse] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setEncodedSize(value: integer): Self = StObject.set(x, "encodedSize", value.asInstanceOf[js.Any])
    
    inline def setOriginalSize(value: integer): Self = StObject.set(x, "originalSize", value.asInstanceOf[js.Any])
  }
}
