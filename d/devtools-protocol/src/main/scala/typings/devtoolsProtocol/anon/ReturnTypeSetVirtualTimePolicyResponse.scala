package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Emulation.SetVirtualTimePolicyRequest
import typings.devtoolsProtocol.mod.Protocol.Emulation.SetVirtualTimePolicyResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeSetVirtualTimePolicyResponse extends StObject {
  
  var paramsType: js.Array[SetVirtualTimePolicyRequest]
  
  var returnType: SetVirtualTimePolicyResponse
}
object ReturnTypeSetVirtualTimePolicyResponse {
  
  inline def apply(paramsType: js.Array[SetVirtualTimePolicyRequest], returnType: SetVirtualTimePolicyResponse): ReturnTypeSetVirtualTimePolicyResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetVirtualTimePolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeSetVirtualTimePolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetVirtualTimePolicyRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetVirtualTimePolicyRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: SetVirtualTimePolicyResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
