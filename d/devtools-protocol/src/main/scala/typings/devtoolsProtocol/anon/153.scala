package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowFPSCounterRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `153` extends StObject {
  
  var paramsType: js.Array[SetShowFPSCounterRequest]
  
  var returnType: Unit
}
object `153` {
  
  inline def apply(paramsType: js.Array[SetShowFPSCounterRequest], returnType: Unit): `153` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`153`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `153`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetShowFPSCounterRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetShowFPSCounterRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
