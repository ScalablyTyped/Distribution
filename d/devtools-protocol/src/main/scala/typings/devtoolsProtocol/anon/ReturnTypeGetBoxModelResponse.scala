package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetBoxModelRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetBoxModelResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetBoxModelResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetBoxModelRequest]]
  
  var returnType: GetBoxModelResponse
}
object ReturnTypeGetBoxModelResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[GetBoxModelRequest]], returnType: GetBoxModelResponse): ReturnTypeGetBoxModelResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetBoxModelResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetBoxModelResponseMutableBuilder[Self <: ReturnTypeGetBoxModelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[GetBoxModelRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[GetBoxModelRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetBoxModelResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
