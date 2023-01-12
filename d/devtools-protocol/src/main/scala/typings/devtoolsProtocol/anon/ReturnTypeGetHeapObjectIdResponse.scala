package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.GetHeapObjectIdRequest
import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.GetHeapObjectIdResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetHeapObjectIdResponse extends StObject {
  
  var paramsType: js.Array[GetHeapObjectIdRequest]
  
  var returnType: GetHeapObjectIdResponse
}
object ReturnTypeGetHeapObjectIdResponse {
  
  inline def apply(paramsType: js.Array[GetHeapObjectIdRequest], returnType: GetHeapObjectIdResponse): ReturnTypeGetHeapObjectIdResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetHeapObjectIdResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeGetHeapObjectIdResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[GetHeapObjectIdRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetHeapObjectIdRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetHeapObjectIdResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
