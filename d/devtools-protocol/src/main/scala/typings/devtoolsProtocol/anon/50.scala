package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CacheStorage.DeleteEntryRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `50` extends StObject {
  
  var paramsType: js.Array[DeleteEntryRequest]
  
  var returnType: Unit
}
object `50` {
  
  inline def apply(paramsType: js.Array[DeleteEntryRequest], returnType: Unit): `50` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`50`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `50`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[DeleteEntryRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DeleteEntryRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
