package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.InsertTextRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `114` extends StObject {
  
  var paramsType: js.Array[InsertTextRequest]
  
  var returnType: Unit
}
object `114` {
  
  inline def apply(paramsType: js.Array[InsertTextRequest], returnType: Unit): `114` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`114`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `114`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[InsertTextRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: InsertTextRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
