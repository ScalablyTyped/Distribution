package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Schema.GetDomainsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetDomainsResponse extends StObject {
  
  var paramsType: js.Array[js.Any] = js.native
  
  var returnType: GetDomainsResponse = js.native
}
object ReturnTypeGetDomainsResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: GetDomainsResponse): ReturnTypeGetDomainsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetDomainsResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetDomainsResponseMutableBuilder[Self <: ReturnTypeGetDomainsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetDomainsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
