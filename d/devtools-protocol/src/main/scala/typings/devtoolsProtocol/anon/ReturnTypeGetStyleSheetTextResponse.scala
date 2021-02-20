package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.GetStyleSheetTextRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetStyleSheetTextResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetStyleSheetTextResponse extends StObject {
  
  var paramsType: js.Array[GetStyleSheetTextRequest] = js.native
  
  var returnType: GetStyleSheetTextResponse = js.native
}
object ReturnTypeGetStyleSheetTextResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetStyleSheetTextRequest], returnType: GetStyleSheetTextResponse): ReturnTypeGetStyleSheetTextResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetStyleSheetTextResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetStyleSheetTextResponseMutableBuilder[Self <: ReturnTypeGetStyleSheetTextResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetStyleSheetTextRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetStyleSheetTextRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetStyleSheetTextResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
