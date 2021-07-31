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
  
  @scala.inline
  def apply(paramsType: js.Array[RemoveDOMStorageItemRequest], returnType: Unit): `71` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`71`]
  }
  
  @scala.inline
  implicit class `71MutableBuilder`[Self <: `71`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[RemoveDOMStorageItemRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: RemoveDOMStorageItemRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
