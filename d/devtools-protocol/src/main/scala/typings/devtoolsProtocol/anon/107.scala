package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Log.StartViolationsReportRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `107` extends StObject {
  
  var paramsType: js.Array[StartViolationsReportRequest]
  
  var returnType: Unit
}
object `107` {
  
  inline def apply(paramsType: js.Array[StartViolationsReportRequest], returnType: Unit): `107` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`107`]
  }
  
  extension [Self <: `107`](x: Self) {
    
    inline def setParamsType(value: js.Array[StartViolationsReportRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: StartViolationsReportRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
