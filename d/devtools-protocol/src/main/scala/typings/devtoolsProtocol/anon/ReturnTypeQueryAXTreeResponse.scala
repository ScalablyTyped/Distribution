package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Accessibility.QueryAXTreeRequest
import typings.devtoolsProtocol.mod.Protocol.Accessibility.QueryAXTreeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeQueryAXTreeResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[QueryAXTreeRequest]] = js.native
  
  var returnType: QueryAXTreeResponse = js.native
}
object ReturnTypeQueryAXTreeResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[QueryAXTreeRequest]], returnType: QueryAXTreeResponse): ReturnTypeQueryAXTreeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeQueryAXTreeResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeQueryAXTreeResponseMutableBuilder[Self <: ReturnTypeQueryAXTreeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[QueryAXTreeRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[QueryAXTreeRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: QueryAXTreeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
