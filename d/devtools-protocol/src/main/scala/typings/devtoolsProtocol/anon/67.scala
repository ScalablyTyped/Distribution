package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.SetInspectedNodeRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `67` extends StObject {
  
  var paramsType: js.Array[SetInspectedNodeRequest]
  
  var returnType: Unit
}
object `67` {
  
  inline def apply(paramsType: js.Array[SetInspectedNodeRequest], returnType: Unit): `67` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`67`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `67`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetInspectedNodeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetInspectedNodeRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
