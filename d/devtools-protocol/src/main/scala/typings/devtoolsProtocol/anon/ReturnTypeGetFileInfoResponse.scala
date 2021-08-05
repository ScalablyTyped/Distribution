package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetFileInfoRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetFileInfoResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetFileInfoResponse extends StObject {
  
  var paramsType: js.Array[GetFileInfoRequest]
  
  var returnType: GetFileInfoResponse
}
object ReturnTypeGetFileInfoResponse {
  
  inline def apply(paramsType: js.Array[GetFileInfoRequest], returnType: GetFileInfoResponse): ReturnTypeGetFileInfoResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetFileInfoResponse]
  }
  
  extension [Self <: ReturnTypeGetFileInfoResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetFileInfoRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetFileInfoRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: GetFileInfoResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
