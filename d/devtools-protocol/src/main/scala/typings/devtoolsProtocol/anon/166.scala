package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.DeleteCookieRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `166` extends StObject {
  
  var paramsType: js.Array[DeleteCookieRequest]
  
  var returnType: Unit
}
object `166` {
  
  inline def apply(paramsType: js.Array[DeleteCookieRequest], returnType: Unit): `166` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`166`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `166`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[DeleteCookieRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DeleteCookieRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
