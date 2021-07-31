package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.GetLayoutMetricsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetLayoutMetricsResponse extends StObject {
  
  var paramsType: js.Array[js.Any]
  
  var returnType: GetLayoutMetricsResponse
}
object ReturnTypeGetLayoutMetricsResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: GetLayoutMetricsResponse): ReturnTypeGetLayoutMetricsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetLayoutMetricsResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetLayoutMetricsResponseMutableBuilder[Self <: ReturnTypeGetLayoutMetricsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetLayoutMetricsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
