package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Browser.SetPermissionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `36` extends StObject {
  
  var paramsType: js.Array[SetPermissionRequest]
  
  var returnType: Unit
}
object `36` {
  
  inline def apply(paramsType: js.Array[SetPermissionRequest], returnType: Unit): `36` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`36`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `36`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetPermissionRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetPermissionRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
