package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.ReplayXHRRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `115` extends StObject {
  
  var paramsType: js.Array[ReplayXHRRequest]
  
  var returnType: Unit
}
object `115` {
  
  inline def apply(paramsType: js.Array[ReplayXHRRequest], returnType: Unit): `115` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`115`]
  }
  
  extension [Self <: `115`](x: Self) {
    
    inline def setParamsType(value: js.Array[ReplayXHRRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ReplayXHRRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
