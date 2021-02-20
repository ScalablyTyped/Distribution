package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.RunScriptRequest
import typings.devtoolsProtocol.mod.Protocol.Runtime.RunScriptResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeRunScriptResponse extends StObject {
  
  var paramsType: js.Array[RunScriptRequest] = js.native
  
  var returnType: RunScriptResponse = js.native
}
object ReturnTypeRunScriptResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[RunScriptRequest], returnType: RunScriptResponse): ReturnTypeRunScriptResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRunScriptResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeRunScriptResponseMutableBuilder[Self <: ReturnTypeRunScriptResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[RunScriptRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: RunScriptRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: RunScriptResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
