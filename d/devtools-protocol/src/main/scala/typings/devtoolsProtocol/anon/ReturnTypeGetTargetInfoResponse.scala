package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.GetTargetInfoRequest
import typings.devtoolsProtocol.mod.Protocol.Target.GetTargetInfoResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetTargetInfoResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetTargetInfoRequest]]
  
  var returnType: GetTargetInfoResponse
}
object ReturnTypeGetTargetInfoResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[GetTargetInfoRequest]], returnType: GetTargetInfoResponse): ReturnTypeGetTargetInfoResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetTargetInfoResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetTargetInfoResponseMutableBuilder[Self <: ReturnTypeGetTargetInfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[GetTargetInfoRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[GetTargetInfoRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetTargetInfoResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
