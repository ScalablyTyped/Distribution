package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.RestartFrameRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.RestartFrameResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeRestartFrameResponse extends StObject {
  
  var paramsType: js.Array[RestartFrameRequest] = js.native
  
  var returnType: RestartFrameResponse = js.native
}
object ReturnTypeRestartFrameResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[RestartFrameRequest], returnType: RestartFrameResponse): ReturnTypeRestartFrameResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRestartFrameResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeRestartFrameResponseMutableBuilder[Self <: ReturnTypeRestartFrameResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[RestartFrameRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: RestartFrameRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: RestartFrameResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
