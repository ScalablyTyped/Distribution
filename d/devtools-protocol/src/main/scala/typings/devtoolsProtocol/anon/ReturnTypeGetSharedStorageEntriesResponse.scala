package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.GetSharedStorageEntriesRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.GetSharedStorageEntriesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetSharedStorageEntriesResponse extends StObject {
  
  var paramsType: js.Array[GetSharedStorageEntriesRequest]
  
  var returnType: GetSharedStorageEntriesResponse
}
object ReturnTypeGetSharedStorageEntriesResponse {
  
  inline def apply(paramsType: js.Array[GetSharedStorageEntriesRequest], returnType: GetSharedStorageEntriesResponse): ReturnTypeGetSharedStorageEntriesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetSharedStorageEntriesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeGetSharedStorageEntriesResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[GetSharedStorageEntriesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetSharedStorageEntriesRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetSharedStorageEntriesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
