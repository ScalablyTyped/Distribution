package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.CreateIsolatedWorldRequest
import typings.devtoolsProtocol.mod.Protocol.Page.CreateIsolatedWorldResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeCreateIsolatedWorldResponse extends StObject {
  
  var paramsType: js.Array[CreateIsolatedWorldRequest] = js.native
  
  var returnType: CreateIsolatedWorldResponse = js.native
}
object ReturnTypeCreateIsolatedWorldResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[CreateIsolatedWorldRequest], returnType: CreateIsolatedWorldResponse): ReturnTypeCreateIsolatedWorldResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCreateIsolatedWorldResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeCreateIsolatedWorldResponseMutableBuilder[Self <: ReturnTypeCreateIsolatedWorldResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[CreateIsolatedWorldRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: CreateIsolatedWorldRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: CreateIsolatedWorldResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
