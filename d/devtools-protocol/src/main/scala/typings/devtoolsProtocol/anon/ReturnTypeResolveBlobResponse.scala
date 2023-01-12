package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IO.ResolveBlobRequest
import typings.devtoolsProtocol.mod.Protocol.IO.ResolveBlobResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeResolveBlobResponse extends StObject {
  
  var paramsType: js.Array[ResolveBlobRequest]
  
  var returnType: ResolveBlobResponse
}
object ReturnTypeResolveBlobResponse {
  
  inline def apply(paramsType: js.Array[ResolveBlobRequest], returnType: ResolveBlobResponse): ReturnTypeResolveBlobResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeResolveBlobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeResolveBlobResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[ResolveBlobRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ResolveBlobRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: ResolveBlobResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
