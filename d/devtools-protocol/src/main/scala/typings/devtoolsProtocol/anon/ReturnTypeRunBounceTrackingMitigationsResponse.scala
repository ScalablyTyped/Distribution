package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Storage.RunBounceTrackingMitigationsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeRunBounceTrackingMitigationsResponse extends StObject {
  
  var paramsType: js.Array[Any]
  
  var returnType: RunBounceTrackingMitigationsResponse
}
object ReturnTypeRunBounceTrackingMitigationsResponse {
  
  inline def apply(paramsType: js.Array[Any], returnType: RunBounceTrackingMitigationsResponse): ReturnTypeRunBounceTrackingMitigationsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRunBounceTrackingMitigationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeRunBounceTrackingMitigationsResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: Any*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: RunBounceTrackingMitigationsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
