package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Profiler.GetBestEffortCoverageResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetBestEffortCoverageResponse extends StObject {
  
  var paramsType: js.Array[js.Any] = js.native
  
  var returnType: GetBestEffortCoverageResponse = js.native
}
object ReturnTypeGetBestEffortCoverageResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: GetBestEffortCoverageResponse): ReturnTypeGetBestEffortCoverageResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetBestEffortCoverageResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetBestEffortCoverageResponseMutableBuilder[Self <: ReturnTypeGetBestEffortCoverageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetBestEffortCoverageResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
