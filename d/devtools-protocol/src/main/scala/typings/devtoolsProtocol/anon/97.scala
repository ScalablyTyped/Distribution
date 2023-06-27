package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Emulation.SetNavigatorOverridesRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `97` extends StObject {
  
  var paramsType: js.Array[SetNavigatorOverridesRequest]
  
  var returnType: Unit
}
object `97` {
  
  inline def apply(paramsType: js.Array[SetNavigatorOverridesRequest], returnType: Unit): `97` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`97`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `97`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetNavigatorOverridesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetNavigatorOverridesRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
