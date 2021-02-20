package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.TakeCoverageDeltaResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeTakeCoverageDeltaResponse extends StObject {
  
  var paramsType: js.Array[js.Any] = js.native
  
  var returnType: TakeCoverageDeltaResponse = js.native
}
object ReturnTypeTakeCoverageDeltaResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: TakeCoverageDeltaResponse): ReturnTypeTakeCoverageDeltaResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeTakeCoverageDeltaResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeTakeCoverageDeltaResponseMutableBuilder[Self <: ReturnTypeTakeCoverageDeltaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: TakeCoverageDeltaResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
