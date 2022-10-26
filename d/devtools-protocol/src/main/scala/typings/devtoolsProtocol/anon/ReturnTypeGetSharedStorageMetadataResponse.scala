package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.GetSharedStorageMetadataRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.GetSharedStorageMetadataResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetSharedStorageMetadataResponse extends StObject {
  
  var paramsType: js.Array[GetSharedStorageMetadataRequest]
  
  var returnType: GetSharedStorageMetadataResponse
}
object ReturnTypeGetSharedStorageMetadataResponse {
  
  inline def apply(
    paramsType: js.Array[GetSharedStorageMetadataRequest],
    returnType: GetSharedStorageMetadataResponse
  ): ReturnTypeGetSharedStorageMetadataResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetSharedStorageMetadataResponse]
  }
  
  extension [Self <: ReturnTypeGetSharedStorageMetadataResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetSharedStorageMetadataRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetSharedStorageMetadataRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetSharedStorageMetadataResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
