package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.ForcePseudoStateRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  var paramsType: js.Array[ForcePseudoStateRequest]
  
  var returnType: Unit
}
object `45` {
  
  inline def apply(paramsType: js.Array[ForcePseudoStateRequest], returnType: Unit): `45` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`45`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `45`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[ForcePseudoStateRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ForcePseudoStateRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
