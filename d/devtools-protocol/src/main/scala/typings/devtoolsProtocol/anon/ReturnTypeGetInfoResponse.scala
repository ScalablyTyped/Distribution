package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.SystemInfo.GetInfoResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetInfoResponse extends StObject {
  
  var paramsType: js.Array[js.Any] = js.native
  
  var returnType: GetInfoResponse = js.native
}
object ReturnTypeGetInfoResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: GetInfoResponse): ReturnTypeGetInfoResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetInfoResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetInfoResponseMutableBuilder[Self <: ReturnTypeGetInfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetInfoResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
