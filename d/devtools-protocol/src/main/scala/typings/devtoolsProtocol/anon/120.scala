package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.SetDataSizeLimitsForTestRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `120` extends StObject {
  
  var paramsType: js.Array[SetDataSizeLimitsForTestRequest]
  
  var returnType: Unit
}
object `120` {
  
  inline def apply(paramsType: js.Array[SetDataSizeLimitsForTestRequest], returnType: Unit): `120` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`120`]
  }
  
  extension [Self <: `120`](x: Self) {
    
    inline def setParamsType(value: js.Array[SetDataSizeLimitsForTestRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetDataSizeLimitsForTestRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
