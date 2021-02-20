package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.AddRuleRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.AddRuleResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeAddRuleResponse extends StObject {
  
  var paramsType: js.Array[AddRuleRequest] = js.native
  
  var returnType: AddRuleResponse = js.native
}
object ReturnTypeAddRuleResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[AddRuleRequest], returnType: AddRuleResponse): ReturnTypeAddRuleResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeAddRuleResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeAddRuleResponseMutableBuilder[Self <: ReturnTypeAddRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[AddRuleRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: AddRuleRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: AddRuleResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
