package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.MoveToRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.MoveToResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeMoveToResponse extends StObject {
  
  var paramsType: js.Array[MoveToRequest] = js.native
  
  var returnType: MoveToResponse = js.native
}
object ReturnTypeMoveToResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[MoveToRequest], returnType: MoveToResponse): ReturnTypeMoveToResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeMoveToResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeMoveToResponseMutableBuilder[Self <: ReturnTypeMoveToResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[MoveToRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: MoveToRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: MoveToResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
