package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOMDebugger.SetBreakOnCSPViolationRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `74` extends StObject {
  
  var paramsType: js.Array[SetBreakOnCSPViolationRequest]
  
  var returnType: Unit
}
object `74` {
  
  inline def apply(paramsType: js.Array[SetBreakOnCSPViolationRequest], returnType: Unit): `74` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`74`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `74`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetBreakOnCSPViolationRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetBreakOnCSPViolationRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
