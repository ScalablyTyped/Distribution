package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Emulation.SetFocusEmulationEnabledRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `85` extends StObject {
  
  var paramsType: js.Array[SetFocusEmulationEnabledRequest]
  
  var returnType: Unit
}
object `85` {
  
  inline def apply(paramsType: js.Array[SetFocusEmulationEnabledRequest], returnType: Unit): `85` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`85`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `85`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetFocusEmulationEnabledRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetFocusEmulationEnabledRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
