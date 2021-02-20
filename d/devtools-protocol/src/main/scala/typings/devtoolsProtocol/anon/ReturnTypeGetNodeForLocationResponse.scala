package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetNodeForLocationRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetNodeForLocationResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetNodeForLocationResponse extends StObject {
  
  var paramsType: js.Array[GetNodeForLocationRequest] = js.native
  
  var returnType: GetNodeForLocationResponse = js.native
}
object ReturnTypeGetNodeForLocationResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetNodeForLocationRequest], returnType: GetNodeForLocationResponse): ReturnTypeGetNodeForLocationResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetNodeForLocationResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetNodeForLocationResponseMutableBuilder[Self <: ReturnTypeGetNodeForLocationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetNodeForLocationRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetNodeForLocationRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetNodeForLocationResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
