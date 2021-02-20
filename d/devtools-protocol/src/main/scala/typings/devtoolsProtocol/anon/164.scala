package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.GenerateTestReportRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `164` extends StObject {
  
  var paramsType: js.Array[GenerateTestReportRequest] = js.native
  
  var returnType: Unit = js.native
}
object `164` {
  
  @scala.inline
  def apply(paramsType: js.Array[GenerateTestReportRequest], returnType: Unit): `164` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`164`]
  }
  
  @scala.inline
  implicit class `164MutableBuilder`[Self <: `164`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GenerateTestReportRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GenerateTestReportRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
