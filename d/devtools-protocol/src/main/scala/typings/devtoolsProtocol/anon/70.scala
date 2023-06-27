package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOMDebugger.RemoveDOMBreakpointRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `70` extends StObject {
  
  var paramsType: js.Array[RemoveDOMBreakpointRequest]
  
  var returnType: Unit
}
object `70` {
  
  inline def apply(paramsType: js.Array[RemoveDOMBreakpointRequest], returnType: Unit): `70` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`70`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `70`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[RemoveDOMBreakpointRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: RemoveDOMBreakpointRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
