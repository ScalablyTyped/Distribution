package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.SetBlockedURLsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `135` extends StObject {
  
  var paramsType: js.Array[SetBlockedURLsRequest]
  
  var returnType: Unit
}
object `135` {
  
  inline def apply(paramsType: js.Array[SetBlockedURLsRequest], returnType: Unit): `135` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`135`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `135`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetBlockedURLsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetBlockedURLsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
