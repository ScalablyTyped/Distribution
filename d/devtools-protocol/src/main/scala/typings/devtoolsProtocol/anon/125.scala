package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Log.StartViolationsReportRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `125` extends StObject {
  
  var paramsType: js.Array[StartViolationsReportRequest]
  
  var returnType: Unit
}
object `125` {
  
  inline def apply(paramsType: js.Array[StartViolationsReportRequest], returnType: Unit): `125` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`125`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `125`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[StartViolationsReportRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: StartViolationsReportRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
