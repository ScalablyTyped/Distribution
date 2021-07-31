package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Profiler.GetRuntimeCallStatsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetRuntimeCallStatsResponse extends StObject {
  
  var paramsType: js.Array[js.Any]
  
  var returnType: GetRuntimeCallStatsResponse
}
object ReturnTypeGetRuntimeCallStatsResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: GetRuntimeCallStatsResponse): ReturnTypeGetRuntimeCallStatsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetRuntimeCallStatsResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetRuntimeCallStatsResponseMutableBuilder[Self <: ReturnTypeGetRuntimeCallStatsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetRuntimeCallStatsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
