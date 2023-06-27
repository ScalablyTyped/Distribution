package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.RemoveAttributeRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `60` extends StObject {
  
  var paramsType: js.Array[RemoveAttributeRequest]
  
  var returnType: Unit
}
object `60` {
  
  inline def apply(paramsType: js.Array[RemoveAttributeRequest], returnType: Unit): `60` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`60`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `60`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[RemoveAttributeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: RemoveAttributeRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
