package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.DispatchKeyEventRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `110` extends StObject {
  
  var paramsType: js.Array[DispatchKeyEventRequest]
  
  var returnType: Unit
}
object `110` {
  
  inline def apply(paramsType: js.Array[DispatchKeyEventRequest], returnType: Unit): `110` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`110`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `110`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[DispatchKeyEventRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DispatchKeyEventRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
