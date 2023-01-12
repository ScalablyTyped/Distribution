package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetFullAXTreeRequest
import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetFullAXTreeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetFullAXTreeResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetFullAXTreeRequest]]
  
  var returnType: GetFullAXTreeResponse
}
object ReturnTypeGetFullAXTreeResponse {
  
  inline def apply(paramsType: js.Array[js.UndefOr[GetFullAXTreeRequest]], returnType: GetFullAXTreeResponse): ReturnTypeGetFullAXTreeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetFullAXTreeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeGetFullAXTreeResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[js.UndefOr[GetFullAXTreeRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[GetFullAXTreeRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetFullAXTreeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
