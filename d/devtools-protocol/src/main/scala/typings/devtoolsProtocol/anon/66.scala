package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.SetNodeStackTracesEnabledRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `66` extends StObject {
  
  var paramsType: js.Array[SetNodeStackTracesEnabledRequest]
  
  var returnType: Unit
}
object `66` {
  
  inline def apply(paramsType: js.Array[SetNodeStackTracesEnabledRequest], returnType: Unit): `66` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`66`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `66`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetNodeStackTracesEnabledRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetNodeStackTracesEnabledRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
