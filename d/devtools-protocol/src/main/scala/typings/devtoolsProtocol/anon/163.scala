package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.DeleteCookieRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `163` extends StObject {
  
  var paramsType: js.Array[DeleteCookieRequest]
  
  var returnType: Unit
}
object `163` {
  
  inline def apply(paramsType: js.Array[DeleteCookieRequest], returnType: Unit): `163` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`163`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `163`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[DeleteCookieRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DeleteCookieRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
