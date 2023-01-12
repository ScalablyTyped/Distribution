package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetExtraHTTPHeadersRequest extends StObject {
  
  /**
    * Map with extra HTTP headers.
    */
  var headers: Headers
}
object SetExtraHTTPHeadersRequest {
  
  inline def apply(headers: Headers): SetExtraHTTPHeadersRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetExtraHTTPHeadersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetExtraHTTPHeadersRequest] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
