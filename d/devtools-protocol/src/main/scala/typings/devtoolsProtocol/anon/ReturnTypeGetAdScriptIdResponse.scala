package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.GetAdScriptIdRequest
import typings.devtoolsProtocol.mod.Protocol.Page.GetAdScriptIdResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetAdScriptIdResponse extends StObject {
  
  var paramsType: js.Array[GetAdScriptIdRequest]
  
  var returnType: GetAdScriptIdResponse
}
object ReturnTypeGetAdScriptIdResponse {
  
  inline def apply(paramsType: js.Array[GetAdScriptIdRequest], returnType: GetAdScriptIdResponse): ReturnTypeGetAdScriptIdResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetAdScriptIdResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeGetAdScriptIdResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[GetAdScriptIdRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetAdScriptIdRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetAdScriptIdResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
