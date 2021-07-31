package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.GetNavigationHistoryResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetNavigationHistoryResponse extends StObject {
  
  var paramsType: js.Array[js.Any]
  
  var returnType: GetNavigationHistoryResponse
}
object ReturnTypeGetNavigationHistoryResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: GetNavigationHistoryResponse): ReturnTypeGetNavigationHistoryResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetNavigationHistoryResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetNavigationHistoryResponseMutableBuilder[Self <: ReturnTypeGetNavigationHistoryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetNavigationHistoryResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
