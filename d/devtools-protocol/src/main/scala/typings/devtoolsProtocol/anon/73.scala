package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOMDebugger.RemoveXHRBreakpointRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `73` extends StObject {
  
  var paramsType: js.Array[RemoveXHRBreakpointRequest]
  
  var returnType: Unit
}
object `73` {
  
  inline def apply(paramsType: js.Array[RemoveXHRBreakpointRequest], returnType: Unit): `73` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`73`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `73`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[RemoveXHRBreakpointRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: RemoveXHRBreakpointRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
