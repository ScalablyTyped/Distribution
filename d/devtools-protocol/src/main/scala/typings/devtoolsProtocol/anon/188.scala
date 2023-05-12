package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.GenerateTestReportRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `188` extends StObject {
  
  var paramsType: js.Array[GenerateTestReportRequest]
  
  var returnType: Unit
}
object `188` {
  
  inline def apply(paramsType: js.Array[GenerateTestReportRequest], returnType: Unit): `188` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`188`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `188`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[GenerateTestReportRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GenerateTestReportRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
