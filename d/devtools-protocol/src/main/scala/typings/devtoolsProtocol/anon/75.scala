package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Emulation.SetCPUThrottlingRateRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `75` extends StObject {
  
  var paramsType: js.Array[SetCPUThrottlingRateRequest]
  
  var returnType: Unit
}
object `75` {
  
  inline def apply(paramsType: js.Array[SetCPUThrottlingRateRequest], returnType: Unit): `75` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`75`]
  }
  
  extension [Self <: `75`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetCPUThrottlingRateRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetCPUThrottlingRateRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
