package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.EnableReportingApiRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `140` extends StObject {
  
  var paramsType: js.Array[EnableReportingApiRequest]
  
  var returnType: Unit
}
object `140` {
  
  inline def apply(paramsType: js.Array[EnableReportingApiRequest], returnType: Unit): `140` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`140`]
  }
  
  extension [Self <: `140`](x: Self) {
    
    inline def setParamsType(value: js.Array[EnableReportingApiRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: EnableReportingApiRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
