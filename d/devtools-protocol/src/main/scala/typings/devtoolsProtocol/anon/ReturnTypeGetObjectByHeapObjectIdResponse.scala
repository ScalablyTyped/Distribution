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
  
  @scala.inline
  def apply(paramsType: js.Array[GetObjectByHeapObjectIdRequest], returnType: GetObjectByHeapObjectIdResponse): ReturnTypeGetObjectByHeapObjectIdResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetObjectByHeapObjectIdResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetObjectByHeapObjectIdResponseMutableBuilder[Self <: ReturnTypeGetObjectByHeapObjectIdResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetObjectByHeapObjectIdRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetObjectByHeapObjectIdRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetObjectByHeapObjectIdResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
