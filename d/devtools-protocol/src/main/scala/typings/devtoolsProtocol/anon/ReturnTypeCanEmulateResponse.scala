package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Emulation.CanEmulateResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeCanEmulateResponse extends StObject {
  
  var paramsType: js.Array[Any]
  
  var returnType: CanEmulateResponse
}
object ReturnTypeCanEmulateResponse {
  
  inline def apply(paramsType: js.Array[Any], returnType: CanEmulateResponse): ReturnTypeCanEmulateResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCanEmulateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeCanEmulateResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: Any*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: CanEmulateResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
