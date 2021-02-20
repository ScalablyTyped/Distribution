package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.GetBrowserContextsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetBrowserContextsResponse extends StObject {
  
  var paramsType: js.Array[js.Any] = js.native
  
  var returnType: GetBrowserContextsResponse = js.native
}
object ReturnTypeGetBrowserContextsResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: GetBrowserContextsResponse): ReturnTypeGetBrowserContextsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetBrowserContextsResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetBrowserContextsResponseMutableBuilder[Self <: ReturnTypeGetBrowserContextsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetBrowserContextsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
