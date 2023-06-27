package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.FedCm.SelectAccountRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `261` extends StObject {
  
  var paramsType: js.Array[SelectAccountRequest]
  
  var returnType: Unit
}
object `261` {
  
  inline def apply(paramsType: js.Array[SelectAccountRequest], returnType: Unit): `261` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`261`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `261`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SelectAccountRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SelectAccountRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
