package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.ForcePseudoStateRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39` extends StObject {
  
  var paramsType: js.Array[ForcePseudoStateRequest]
  
  var returnType: Unit
}
object `39` {
  
  inline def apply(paramsType: js.Array[ForcePseudoStateRequest], returnType: Unit): `39` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`39`]
  }
  
  extension [Self <: `39`](x: Self) {
    
    inline def setParamsType(value: js.Array[ForcePseudoStateRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ForcePseudoStateRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
