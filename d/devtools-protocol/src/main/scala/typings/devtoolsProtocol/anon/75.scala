package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOMDebugger.SetDOMBreakpointRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `75` extends StObject {
  
  var paramsType: js.Array[SetDOMBreakpointRequest]
  
  var returnType: Unit
}
object `75` {
  
  inline def apply(paramsType: js.Array[SetDOMBreakpointRequest], returnType: Unit): `75` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`75`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `75`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetDOMBreakpointRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetDOMBreakpointRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
