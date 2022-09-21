package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetPartialAXTreeRequest
import typings.devtoolsProtocol.mod.Protocol.Accessibility.GetPartialAXTreeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetPartialAXTreeResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetPartialAXTreeRequest]]
  
  var returnType: GetPartialAXTreeResponse
}
object ReturnTypeGetPartialAXTreeResponse {
  
  inline def apply(paramsType: js.Array[js.UndefOr[GetPartialAXTreeRequest]], returnType: GetPartialAXTreeResponse): ReturnTypeGetPartialAXTreeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetPartialAXTreeResponse]
  }
  
  extension [Self <: ReturnTypeGetPartialAXTreeResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[GetPartialAXTreeRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[GetPartialAXTreeRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetPartialAXTreeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
