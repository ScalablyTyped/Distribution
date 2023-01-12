package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.GetObjectByHeapObjectIdRequest
import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.GetObjectByHeapObjectIdResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetObjectByHeapObjectIdResponse extends StObject {
  
  var paramsType: js.Array[GetObjectByHeapObjectIdRequest]
  
  var returnType: GetObjectByHeapObjectIdResponse
}
object ReturnTypeGetObjectByHeapObjectIdResponse {
  
  inline def apply(paramsType: js.Array[GetObjectByHeapObjectIdRequest], returnType: GetObjectByHeapObjectIdResponse): ReturnTypeGetObjectByHeapObjectIdResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetObjectByHeapObjectIdResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeGetObjectByHeapObjectIdResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[GetObjectByHeapObjectIdRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetObjectByHeapObjectIdRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetObjectByHeapObjectIdResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
