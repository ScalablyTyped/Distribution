package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOMStorage.SetDOMStorageItemRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `83` extends StObject {
  
  var paramsType: js.Array[SetDOMStorageItemRequest]
  
  var returnType: Unit
}
object `83` {
  
  inline def apply(paramsType: js.Array[SetDOMStorageItemRequest], returnType: Unit): `83` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`83`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `83`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[SetDOMStorageItemRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetDOMStorageItemRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
