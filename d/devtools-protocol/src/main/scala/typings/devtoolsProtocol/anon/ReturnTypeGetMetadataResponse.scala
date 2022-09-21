package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IndexedDB.GetMetadataRequest
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.GetMetadataResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetMetadataResponse extends StObject {
  
  var paramsType: js.Array[GetMetadataRequest]
  
  var returnType: GetMetadataResponse
}
object ReturnTypeGetMetadataResponse {
  
  inline def apply(paramsType: js.Array[GetMetadataRequest], returnType: GetMetadataResponse): ReturnTypeGetMetadataResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetMetadataResponse]
  }
  
  extension [Self <: ReturnTypeGetMetadataResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetMetadataRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetMetadataRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetMetadataResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
