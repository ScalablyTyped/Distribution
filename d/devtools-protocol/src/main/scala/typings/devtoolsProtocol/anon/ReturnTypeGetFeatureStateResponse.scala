package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.SystemInfo.GetFeatureStateRequest
import typings.devtoolsProtocol.mod.Protocol.SystemInfo.GetFeatureStateResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetFeatureStateResponse extends StObject {
  
  var paramsType: js.Array[GetFeatureStateRequest]
  
  var returnType: GetFeatureStateResponse
}
object ReturnTypeGetFeatureStateResponse {
  
  inline def apply(paramsType: js.Array[GetFeatureStateRequest], returnType: GetFeatureStateResponse): ReturnTypeGetFeatureStateResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetFeatureStateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeGetFeatureStateResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[GetFeatureStateRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetFeatureStateRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetFeatureStateResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
