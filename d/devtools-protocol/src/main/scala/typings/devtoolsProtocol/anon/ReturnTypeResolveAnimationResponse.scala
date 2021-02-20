package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Animation.ResolveAnimationRequest
import typings.devtoolsProtocol.mod.Protocol.Animation.ResolveAnimationResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeResolveAnimationResponse extends StObject {
  
  var paramsType: js.Array[ResolveAnimationRequest] = js.native
  
  var returnType: ResolveAnimationResponse = js.native
}
object ReturnTypeResolveAnimationResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[ResolveAnimationRequest], returnType: ResolveAnimationResponse): ReturnTypeResolveAnimationResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeResolveAnimationResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeResolveAnimationResponseMutableBuilder[Self <: ReturnTypeResolveAnimationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[ResolveAnimationRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: ResolveAnimationRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: ResolveAnimationResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
