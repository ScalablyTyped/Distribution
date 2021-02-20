package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.GetPlatformFontsForNodeRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetPlatformFontsForNodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetPlatformFontsForNodeResponse extends StObject {
  
  var paramsType: js.Array[GetPlatformFontsForNodeRequest] = js.native
  
  var returnType: GetPlatformFontsForNodeResponse = js.native
}
object ReturnTypeGetPlatformFontsForNodeResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetPlatformFontsForNodeRequest], returnType: GetPlatformFontsForNodeResponse): ReturnTypeGetPlatformFontsForNodeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetPlatformFontsForNodeResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetPlatformFontsForNodeResponseMutableBuilder[Self <: ReturnTypeGetPlatformFontsForNodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetPlatformFontsForNodeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetPlatformFontsForNodeRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetPlatformFontsForNodeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
