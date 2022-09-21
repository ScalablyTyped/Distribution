package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.GetStorageKeyForFrameRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.GetStorageKeyForFrameResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetStorageKeyForFrameResponse extends StObject {
  
  var paramsType: js.Array[GetStorageKeyForFrameRequest]
  
  var returnType: GetStorageKeyForFrameResponse
}
object ReturnTypeGetStorageKeyForFrameResponse {
  
  inline def apply(paramsType: js.Array[GetStorageKeyForFrameRequest], returnType: GetStorageKeyForFrameResponse): ReturnTypeGetStorageKeyForFrameResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetStorageKeyForFrameResponse]
  }
  
  extension [Self <: ReturnTypeGetStorageKeyForFrameResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetStorageKeyForFrameRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetStorageKeyForFrameRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetStorageKeyForFrameResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
