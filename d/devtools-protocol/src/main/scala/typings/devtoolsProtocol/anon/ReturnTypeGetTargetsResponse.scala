package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.GetTargetsRequest
import typings.devtoolsProtocol.mod.Protocol.Target.GetTargetsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetTargetsResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetTargetsRequest]]
  
  var returnType: GetTargetsResponse
}
object ReturnTypeGetTargetsResponse {
  
  inline def apply(paramsType: js.Array[js.UndefOr[GetTargetsRequest]], returnType: GetTargetsResponse): ReturnTypeGetTargetsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetTargetsResponse]
  }
  
  extension [Self <: ReturnTypeGetTargetsResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[GetTargetsRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[GetTargetsRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetTargetsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
