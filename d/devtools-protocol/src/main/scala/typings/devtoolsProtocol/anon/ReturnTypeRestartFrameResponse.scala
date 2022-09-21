package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.RestartFrameRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.RestartFrameResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeRestartFrameResponse extends StObject {
  
  var paramsType: js.Array[RestartFrameRequest]
  
  var returnType: RestartFrameResponse
}
object ReturnTypeRestartFrameResponse {
  
  inline def apply(paramsType: js.Array[RestartFrameRequest], returnType: RestartFrameResponse): ReturnTypeRestartFrameResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRestartFrameResponse]
  }
  
  extension [Self <: ReturnTypeRestartFrameResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[RestartFrameRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: RestartFrameRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: RestartFrameResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
