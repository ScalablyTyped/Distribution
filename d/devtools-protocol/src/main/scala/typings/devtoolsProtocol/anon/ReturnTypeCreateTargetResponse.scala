package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.CreateTargetRequest
import typings.devtoolsProtocol.mod.Protocol.Target.CreateTargetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeCreateTargetResponse extends StObject {
  
  var paramsType: js.Array[CreateTargetRequest]
  
  var returnType: CreateTargetResponse
}
object ReturnTypeCreateTargetResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[CreateTargetRequest], returnType: CreateTargetResponse): ReturnTypeCreateTargetResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCreateTargetResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeCreateTargetResponseMutableBuilder[Self <: ReturnTypeCreateTargetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[CreateTargetRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: CreateTargetRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: CreateTargetResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
