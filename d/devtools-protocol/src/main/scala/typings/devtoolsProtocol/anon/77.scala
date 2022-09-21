package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.EventBreakpoints.RemoveInstrumentationBreakpointRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `77` extends StObject {
  
  var paramsType: js.Array[RemoveInstrumentationBreakpointRequest]
  
  var returnType: Unit
}
object `77` {
  
  inline def apply(paramsType: js.Array[RemoveInstrumentationBreakpointRequest], returnType: Unit): `77` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`77`]
  }
  
  extension [Self <: `77`](x: Self) {
    
    inline def setParamsType(value: js.Array[RemoveInstrumentationBreakpointRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: RemoveInstrumentationBreakpointRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
