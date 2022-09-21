package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Browser.GetHistogramRequest
import typings.devtoolsProtocol.mod.Protocol.Browser.GetHistogramResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetHistogramResponse extends StObject {
  
  var paramsType: js.Array[GetHistogramRequest]
  
  var returnType: GetHistogramResponse
}
object ReturnTypeGetHistogramResponse {
  
  inline def apply(paramsType: js.Array[GetHistogramRequest], returnType: GetHistogramResponse): ReturnTypeGetHistogramResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetHistogramResponse]
  }
  
  extension [Self <: ReturnTypeGetHistogramResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetHistogramRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetHistogramRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetHistogramResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
