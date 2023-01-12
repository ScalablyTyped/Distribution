package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.AddRuleRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.AddRuleResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeAddRuleResponse extends StObject {
  
  var paramsType: js.Array[AddRuleRequest]
  
  var returnType: AddRuleResponse
}
object ReturnTypeAddRuleResponse {
  
  inline def apply(paramsType: js.Array[AddRuleRequest], returnType: AddRuleResponse): ReturnTypeAddRuleResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeAddRuleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeAddRuleResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[AddRuleRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: AddRuleRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: AddRuleResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
