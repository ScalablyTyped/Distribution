package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Profiler.StopResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeStopResponse extends StObject {
  
  var paramsType: js.Array[js.Any]
  
  var returnType: StopResponse
}
object ReturnTypeStopResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: StopResponse): ReturnTypeStopResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeStopResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeStopResponseMutableBuilder[Self <: ReturnTypeStopResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: StopResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
