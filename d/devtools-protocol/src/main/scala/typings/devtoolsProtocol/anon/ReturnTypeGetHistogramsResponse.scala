package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Browser.GetHistogramsRequest
import typings.devtoolsProtocol.mod.Protocol.Browser.GetHistogramsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetHistogramsResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetHistogramsRequest]]
  
  var returnType: GetHistogramsResponse
}
object ReturnTypeGetHistogramsResponse {
  
  inline def apply(paramsType: js.Array[js.UndefOr[GetHistogramsRequest]], returnType: GetHistogramsResponse): ReturnTypeGetHistogramsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetHistogramsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeGetHistogramsResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[js.UndefOr[GetHistogramsRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[GetHistogramsRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetHistogramsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
