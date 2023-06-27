package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.EventBreakpoints.SetInstrumentationBreakpointRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `79` extends StObject {
  
  var paramsType: js.Array[SetInstrumentationBreakpointRequest]
  
  var returnType: Unit
}
object `79` {
  
  inline def apply(paramsType: js.Array[SetInstrumentationBreakpointRequest], returnType: Unit): `79` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`79`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `79`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetInstrumentationBreakpointRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetInstrumentationBreakpointRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
