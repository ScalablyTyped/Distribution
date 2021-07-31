package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.SearchInResourceRequest
import typings.devtoolsProtocol.mod.Protocol.Page.SearchInResourceResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeSearchInResourceResponse extends StObject {
  
  var paramsType: js.Array[SearchInResourceRequest]
  
  var returnType: SearchInResourceResponse
}
object ReturnTypeSearchInResourceResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SearchInResourceRequest], returnType: SearchInResourceResponse): ReturnTypeSearchInResourceResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSearchInResourceResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSearchInResourceResponseMutableBuilder[Self <: ReturnTypeSearchInResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SearchInResourceRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SearchInResourceRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: SearchInResourceResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
