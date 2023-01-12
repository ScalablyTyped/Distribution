package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.SetIgnoreInputEventsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `116` extends StObject {
  
  var paramsType: js.Array[SetIgnoreInputEventsRequest]
  
  var returnType: Unit
}
object `116` {
  
  inline def apply(paramsType: js.Array[SetIgnoreInputEventsRequest], returnType: Unit): `116` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`116`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `116`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetIgnoreInputEventsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetIgnoreInputEventsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
