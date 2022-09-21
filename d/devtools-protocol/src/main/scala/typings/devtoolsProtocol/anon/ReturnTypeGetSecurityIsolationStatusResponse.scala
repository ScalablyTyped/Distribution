package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.GetSecurityIsolationStatusRequest
import typings.devtoolsProtocol.mod.Protocol.Network.GetSecurityIsolationStatusResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetSecurityIsolationStatusResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetSecurityIsolationStatusRequest]]
  
  var returnType: GetSecurityIsolationStatusResponse
}
object ReturnTypeGetSecurityIsolationStatusResponse {
  
  inline def apply(
    paramsType: js.Array[js.UndefOr[GetSecurityIsolationStatusRequest]],
    returnType: GetSecurityIsolationStatusResponse
  ): ReturnTypeGetSecurityIsolationStatusResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetSecurityIsolationStatusResponse]
  }
  
  extension [Self <: ReturnTypeGetSecurityIsolationStatusResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[GetSecurityIsolationStatusRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[GetSecurityIsolationStatusRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetSecurityIsolationStatusResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
