package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Emulation.SetDeviceMetricsOverrideRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `89` extends StObject {
  
  var paramsType: js.Array[SetDeviceMetricsOverrideRequest]
  
  var returnType: Unit
}
object `89` {
  
  inline def apply(paramsType: js.Array[SetDeviceMetricsOverrideRequest], returnType: Unit): `89` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`89`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `89`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetDeviceMetricsOverrideRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetDeviceMetricsOverrideRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
