package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOMStorage.RemoveDOMStorageItemRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `82` extends StObject {
  
  var paramsType: js.Array[RemoveDOMStorageItemRequest]
  
  var returnType: Unit
}
object `82` {
  
  inline def apply(paramsType: js.Array[RemoveDOMStorageItemRequest], returnType: Unit): `82` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`82`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `82`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[RemoveDOMStorageItemRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: RemoveDOMStorageItemRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
