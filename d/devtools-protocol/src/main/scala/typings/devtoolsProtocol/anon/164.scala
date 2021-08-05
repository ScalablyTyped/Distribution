package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.GenerateTestReportRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `164` extends StObject {
  
  var paramsType: js.Array[GenerateTestReportRequest]
  
  var returnType: Unit
}
object `164` {
  
  inline def apply(paramsType: js.Array[GenerateTestReportRequest], returnType: Unit): `164` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`164`]
  }
  
  extension [Self <: `164`](x: Self) {
    
    inline def setParamsType(value: js.Array[GenerateTestReportRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GenerateTestReportRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
