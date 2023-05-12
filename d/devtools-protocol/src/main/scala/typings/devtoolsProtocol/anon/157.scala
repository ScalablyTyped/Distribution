package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.SetShowLayoutShiftRegionsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `157` extends StObject {
  
  var paramsType: js.Array[SetShowLayoutShiftRegionsRequest]
  
  var returnType: Unit
}
object `157` {
  
  inline def apply(paramsType: js.Array[SetShowLayoutShiftRegionsRequest], returnType: Unit): `157` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`157`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `157`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetShowLayoutShiftRegionsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetShowLayoutShiftRegionsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
