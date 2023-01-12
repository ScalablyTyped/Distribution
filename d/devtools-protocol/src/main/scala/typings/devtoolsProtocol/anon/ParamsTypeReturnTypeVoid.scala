package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.RemoveBreakpointRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsTypeReturnTypeVoid extends StObject {
  
  var paramsType: js.Array[RemoveBreakpointRequest]
  
  var returnType: Unit
}
object ParamsTypeReturnTypeVoid {
  
  inline def apply(paramsType: js.Array[RemoveBreakpointRequest], returnType: Unit): ParamsTypeReturnTypeVoid = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsTypeReturnTypeVoid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParamsTypeReturnTypeVoid] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[RemoveBreakpointRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: RemoveBreakpointRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
