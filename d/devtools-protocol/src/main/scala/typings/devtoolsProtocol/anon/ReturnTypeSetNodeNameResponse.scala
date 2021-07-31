package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.SetNodeNameRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.SetNodeNameResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeSetNodeNameResponse extends StObject {
  
  var paramsType: js.Array[SetNodeNameRequest]
  
  var returnType: SetNodeNameResponse
}
object ReturnTypeSetNodeNameResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SetNodeNameRequest], returnType: SetNodeNameResponse): ReturnTypeSetNodeNameResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetNodeNameResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetNodeNameResponseMutableBuilder[Self <: ReturnTypeSetNodeNameResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetNodeNameRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetNodeNameRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: SetNodeNameResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
