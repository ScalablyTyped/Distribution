package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Autofill.TriggerRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30` extends StObject {
  
  var paramsType: js.Array[TriggerRequest]
  
  var returnType: Unit
}
object `30` {
  
  inline def apply(paramsType: js.Array[TriggerRequest], returnType: Unit): `30` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`30`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `30`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[TriggerRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: TriggerRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
