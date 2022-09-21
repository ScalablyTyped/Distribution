package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.GetHeapUsageResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetHeapUsageResponse extends StObject {
  
  var paramsType: js.Array[Any]
  
  var returnType: GetHeapUsageResponse
}
object ReturnTypeGetHeapUsageResponse {
  
  inline def apply(paramsType: js.Array[Any], returnType: GetHeapUsageResponse): ReturnTypeGetHeapUsageResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetHeapUsageResponse]
  }
  
  extension [Self <: ReturnTypeGetHeapUsageResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: Any*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetHeapUsageResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
