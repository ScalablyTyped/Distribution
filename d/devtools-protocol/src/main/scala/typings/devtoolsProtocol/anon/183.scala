package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.SetTouchEmulationEnabledRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `183` extends StObject {
  
  var paramsType: js.Array[SetTouchEmulationEnabledRequest]
  
  var returnType: Unit
}
object `183` {
  
  inline def apply(paramsType: js.Array[SetTouchEmulationEnabledRequest], returnType: Unit): `183` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`183`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `183`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetTouchEmulationEnabledRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetTouchEmulationEnabledRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
