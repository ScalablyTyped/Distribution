package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.SetRuleSelectorRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetRuleSelectorResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeSetRuleSelectorResponse extends StObject {
  
  var paramsType: js.Array[SetRuleSelectorRequest]
  
  var returnType: SetRuleSelectorResponse
}
object ReturnTypeSetRuleSelectorResponse {
  
  inline def apply(paramsType: js.Array[SetRuleSelectorRequest], returnType: SetRuleSelectorResponse): ReturnTypeSetRuleSelectorResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetRuleSelectorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeSetRuleSelectorResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetRuleSelectorRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetRuleSelectorRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: SetRuleSelectorResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
