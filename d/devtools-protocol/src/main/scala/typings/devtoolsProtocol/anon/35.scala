package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.BackgroundService.ClearEventsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `35` extends StObject {
  
  var paramsType: js.Array[ClearEventsRequest]
  
  var returnType: Unit
}
object `35` {
  
  inline def apply(paramsType: js.Array[ClearEventsRequest], returnType: Unit): `35` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`35`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `35`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[ClearEventsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ClearEventsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
