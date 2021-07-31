package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.CompileScriptRequest
import typings.devtoolsProtocol.mod.Protocol.Runtime.CompileScriptResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeCompileScriptResponse extends StObject {
  
  var paramsType: js.Array[CompileScriptRequest]
  
  var returnType: CompileScriptResponse
}
object ReturnTypeCompileScriptResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[CompileScriptRequest], returnType: CompileScriptResponse): ReturnTypeCompileScriptResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCompileScriptResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeCompileScriptResponseMutableBuilder[Self <: ReturnTypeCompileScriptResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[CompileScriptRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: CompileScriptRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: CompileScriptResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
