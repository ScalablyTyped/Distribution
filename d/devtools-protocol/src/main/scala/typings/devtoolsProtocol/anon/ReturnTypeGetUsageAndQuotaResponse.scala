package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.GetUsageAndQuotaRequest
import typings.devtoolsProtocol.mod.Protocol.Storage.GetUsageAndQuotaResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetUsageAndQuotaResponse extends StObject {
  
  var paramsType: js.Array[GetUsageAndQuotaRequest]
  
  var returnType: GetUsageAndQuotaResponse
}
object ReturnTypeGetUsageAndQuotaResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetUsageAndQuotaRequest], returnType: GetUsageAndQuotaResponse): ReturnTypeGetUsageAndQuotaResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetUsageAndQuotaResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetUsageAndQuotaResponseMutableBuilder[Self <: ReturnTypeGetUsageAndQuotaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetUsageAndQuotaRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetUsageAndQuotaRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetUsageAndQuotaResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
