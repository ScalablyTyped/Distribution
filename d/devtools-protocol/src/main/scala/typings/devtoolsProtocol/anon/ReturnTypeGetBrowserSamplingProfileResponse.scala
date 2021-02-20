package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Memory.GetBrowserSamplingProfileResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetBrowserSamplingProfileResponse extends StObject {
  
  var paramsType: js.Array[js.Any] = js.native
  
  var returnType: GetBrowserSamplingProfileResponse = js.native
}
object ReturnTypeGetBrowserSamplingProfileResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.Any], returnType: GetBrowserSamplingProfileResponse): ReturnTypeGetBrowserSamplingProfileResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetBrowserSamplingProfileResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetBrowserSamplingProfileResponseMutableBuilder[Self <: ReturnTypeGetBrowserSamplingProfileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetBrowserSamplingProfileResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
