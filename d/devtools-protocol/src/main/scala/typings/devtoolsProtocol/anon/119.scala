package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.SetIgnoreInputEventsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `119` extends StObject {
  
  var paramsType: js.Array[SetIgnoreInputEventsRequest]
  
  var returnType: Unit
}
object `119` {
  
  inline def apply(paramsType: js.Array[SetIgnoreInputEventsRequest], returnType: Unit): `119` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`119`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `119`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetIgnoreInputEventsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetIgnoreInputEventsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
