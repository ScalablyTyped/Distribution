package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.ResolveNodeRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.ResolveNodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeResolveNodeResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[ResolveNodeRequest]]
  
  var returnType: ResolveNodeResponse
}
object ReturnTypeResolveNodeResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[ResolveNodeRequest]], returnType: ResolveNodeResponse): ReturnTypeResolveNodeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeResolveNodeResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeResolveNodeResponseMutableBuilder[Self <: ReturnTypeResolveNodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[ResolveNodeRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[ResolveNodeRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: ResolveNodeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
