package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOMStorage.RemoveDOMStorageItemRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `71` extends StObject {
  
  var paramsType: js.Array[RemoveDOMStorageItemRequest]
  
  var returnType: Unit
}
object `71` {
  
  inline def apply(paramsType: js.Array[RemoveDOMStorageItemRequest], returnType: Unit): `71` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`71`]
  }
  
  extension [Self <: `71`](x: Self) {
    
    inline def setParamsType(value: js.Array[RemoveDOMStorageItemRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: RemoveDOMStorageItemRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
