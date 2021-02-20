package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IndexedDB.GetMetadataRequest
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.GetMetadataResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetMetadataResponse extends StObject {
  
  var paramsType: js.Array[GetMetadataRequest] = js.native
  
  var returnType: GetMetadataResponse = js.native
}
object ReturnTypeGetMetadataResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetMetadataRequest], returnType: GetMetadataResponse): ReturnTypeGetMetadataResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetMetadataResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetMetadataResponseMutableBuilder[Self <: ReturnTypeGetMetadataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetMetadataRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetMetadataRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetMetadataResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
