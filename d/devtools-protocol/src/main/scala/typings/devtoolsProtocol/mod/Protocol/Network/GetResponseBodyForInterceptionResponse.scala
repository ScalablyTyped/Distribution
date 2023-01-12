package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponseBodyForInterceptionResponse extends StObject {
  
  /**
    * True, if content was sent as base64.
    */
  var base64Encoded: Boolean
  
  /**
    * Response body.
    */
  var body: String
}
object GetResponseBodyForInterceptionResponse {
  
  inline def apply(base64Encoded: Boolean, body: String): GetResponseBodyForInterceptionResponse = {
    val __obj = js.Dynamic.literal(base64Encoded = base64Encoded.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponseBodyForInterceptionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponseBodyForInterceptionResponse] (val x: Self) extends AnyVal {
    
    inline def setBase64Encoded(value: Boolean): Self = StObject.set(x, "base64Encoded", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
