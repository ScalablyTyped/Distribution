package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOMDebugger.SetEventListenerBreakpointRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `76` extends StObject {
  
  var paramsType: js.Array[SetEventListenerBreakpointRequest]
  
  var returnType: Unit
}
object `76` {
  
  inline def apply(paramsType: js.Array[SetEventListenerBreakpointRequest], returnType: Unit): `76` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`76`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `76`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetEventListenerBreakpointRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetEventListenerBreakpointRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
