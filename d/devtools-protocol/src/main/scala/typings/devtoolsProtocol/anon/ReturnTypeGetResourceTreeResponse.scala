package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.GetResourceTreeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetResourceTreeResponse extends StObject {
  
  var paramsType: js.Array[js.Any]
  
  var returnType: GetResourceTreeResponse
}
object ReturnTypeGetResourceTreeResponse {
  
  inline def apply(paramsType: js.Array[js.Any], returnType: GetResourceTreeResponse): ReturnTypeGetResourceTreeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetResourceTreeResponse]
  }
  
  extension [Self <: ReturnTypeGetResourceTreeResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: GetResourceTreeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
