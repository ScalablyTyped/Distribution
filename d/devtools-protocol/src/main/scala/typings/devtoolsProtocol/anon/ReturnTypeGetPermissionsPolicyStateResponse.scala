package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.GetPermissionsPolicyStateRequest
import typings.devtoolsProtocol.mod.Protocol.Page.GetPermissionsPolicyStateResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetPermissionsPolicyStateResponse extends StObject {
  
  var paramsType: js.Array[GetPermissionsPolicyStateRequest]
  
  var returnType: GetPermissionsPolicyStateResponse
}
object ReturnTypeGetPermissionsPolicyStateResponse {
  
  inline def apply(
    paramsType: js.Array[GetPermissionsPolicyStateRequest],
    returnType: GetPermissionsPolicyStateResponse
  ): ReturnTypeGetPermissionsPolicyStateResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetPermissionsPolicyStateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeGetPermissionsPolicyStateResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[GetPermissionsPolicyStateRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetPermissionsPolicyStateRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetPermissionsPolicyStateResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
