package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.GetPropertiesRequest
import typings.devtoolsProtocol.mod.Protocol.Runtime.GetPropertiesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetPropertiesResponse extends StObject {
  
  var paramsType: js.Array[GetPropertiesRequest] = js.native
  
  var returnType: GetPropertiesResponse = js.native
}
object ReturnTypeGetPropertiesResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetPropertiesRequest], returnType: GetPropertiesResponse): ReturnTypeGetPropertiesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetPropertiesResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetPropertiesResponseMutableBuilder[Self <: ReturnTypeGetPropertiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetPropertiesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetPropertiesRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetPropertiesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
