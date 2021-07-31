package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.GetMediaQueriesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetMediaQueriesResponse extends StObject {
  
  var paramsType: js.Array[js.Any]
  
  var returnType: GetMediaQueriesResponse
}
object ReturnTypeGetMediaQueriesResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: GetMediaQueriesResponse): ReturnTypeGetMediaQueriesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetMediaQueriesResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetMediaQueriesResponseMutableBuilder[Self <: ReturnTypeGetMediaQueriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetMediaQueriesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
