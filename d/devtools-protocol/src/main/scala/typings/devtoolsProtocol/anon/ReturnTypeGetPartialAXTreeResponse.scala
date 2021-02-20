package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetPartialAXTreeRequest
import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetPartialAXTreeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetPartialAXTreeResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetPartialAXTreeRequest]] = js.native
  
  var returnType: GetPartialAXTreeResponse = js.native
}
object ReturnTypeGetPartialAXTreeResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[GetPartialAXTreeRequest]], returnType: GetPartialAXTreeResponse): ReturnTypeGetPartialAXTreeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetPartialAXTreeResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetPartialAXTreeResponseMutableBuilder[Self <: ReturnTypeGetPartialAXTreeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[GetPartialAXTreeRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[GetPartialAXTreeRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetPartialAXTreeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
