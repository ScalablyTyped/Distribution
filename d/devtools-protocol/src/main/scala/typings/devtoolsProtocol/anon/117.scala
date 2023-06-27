package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.DispatchTouchEventRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `117` extends StObject {
  
  var paramsType: js.Array[DispatchTouchEventRequest]
  
  var returnType: Unit
}
object `117` {
  
  inline def apply(paramsType: js.Array[DispatchTouchEventRequest], returnType: Unit): `117` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`117`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `117`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[DispatchTouchEventRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DispatchTouchEventRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
