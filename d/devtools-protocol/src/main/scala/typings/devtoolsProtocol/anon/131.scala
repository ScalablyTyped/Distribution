package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.ReplayXHRRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `131` extends StObject {
  
  var paramsType: js.Array[ReplayXHRRequest]
  
  var returnType: Unit
}
object `131` {
  
  inline def apply(paramsType: js.Array[ReplayXHRRequest], returnType: Unit): `131` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`131`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `131`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[ReplayXHRRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ReplayXHRRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
