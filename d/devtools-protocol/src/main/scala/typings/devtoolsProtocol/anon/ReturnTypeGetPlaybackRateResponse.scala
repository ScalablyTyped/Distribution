package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Animation.GetPlaybackRateResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetPlaybackRateResponse extends StObject {
  
  var paramsType: js.Array[Any]
  
  var returnType: GetPlaybackRateResponse
}
object ReturnTypeGetPlaybackRateResponse {
  
  inline def apply(paramsType: js.Array[Any], returnType: GetPlaybackRateResponse): ReturnTypeGetPlaybackRateResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetPlaybackRateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeGetPlaybackRateResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: Any*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetPlaybackRateResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
