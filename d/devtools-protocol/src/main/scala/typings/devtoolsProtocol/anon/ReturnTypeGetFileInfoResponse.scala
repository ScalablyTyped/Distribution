package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetFileInfoRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetFileInfoResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetFileInfoResponse extends StObject {
  
  var paramsType: js.Array[GetFileInfoRequest] = js.native
  
  var returnType: GetFileInfoResponse = js.native
}
object ReturnTypeGetFileInfoResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetFileInfoRequest], returnType: GetFileInfoResponse): ReturnTypeGetFileInfoResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetFileInfoResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetFileInfoResponseMutableBuilder[Self <: ReturnTypeGetFileInfoResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetFileInfoRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetFileInfoRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetFileInfoResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
