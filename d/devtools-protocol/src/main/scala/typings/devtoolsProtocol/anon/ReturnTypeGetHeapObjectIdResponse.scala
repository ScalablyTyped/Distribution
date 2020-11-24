package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.GetHeapObjectIdRequest
import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.GetHeapObjectIdResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetHeapObjectIdResponse extends js.Object {
  
  var paramsType: js.Array[GetHeapObjectIdRequest] = js.native
  
  var returnType: GetHeapObjectIdResponse = js.native
}
object ReturnTypeGetHeapObjectIdResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetHeapObjectIdRequest], returnType: GetHeapObjectIdResponse): ReturnTypeGetHeapObjectIdResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetHeapObjectIdResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetHeapObjectIdResponseOps[Self <: ReturnTypeGetHeapObjectIdResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParamsTypeVarargs(value: GetHeapObjectIdRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[GetHeapObjectIdRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetHeapObjectIdResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
