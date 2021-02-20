package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.CloseTargetRequest
import typings.devtoolsProtocol.mod.Protocol.Target.CloseTargetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeCloseTargetResponse extends StObject {
  
  var paramsType: js.Array[CloseTargetRequest] = js.native
  
  var returnType: CloseTargetResponse = js.native
}
object ReturnTypeCloseTargetResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[CloseTargetRequest], returnType: CloseTargetResponse): ReturnTypeCloseTargetResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCloseTargetResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeCloseTargetResponseMutableBuilder[Self <: ReturnTypeCloseTargetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[CloseTargetRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: CloseTargetRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: CloseTargetResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
