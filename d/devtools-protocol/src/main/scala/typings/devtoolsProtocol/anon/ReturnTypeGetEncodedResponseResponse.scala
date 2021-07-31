package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Audits.GetEncodedResponseRequest
import typings.devtoolsProtocol.mod.Protocol.Audits.GetEncodedResponseResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetEncodedResponseResponse extends StObject {
  
  var paramsType: js.Array[GetEncodedResponseRequest]
  
  var returnType: GetEncodedResponseResponse
}
object ReturnTypeGetEncodedResponseResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetEncodedResponseRequest], returnType: GetEncodedResponseResponse): ReturnTypeGetEncodedResponseResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetEncodedResponseResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetEncodedResponseResponseMutableBuilder[Self <: ReturnTypeGetEncodedResponseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetEncodedResponseRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetEncodedResponseRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetEncodedResponseResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
