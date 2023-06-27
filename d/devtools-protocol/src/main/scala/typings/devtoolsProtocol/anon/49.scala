package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CacheStorage.DeleteCacheRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `49` extends StObject {
  
  var paramsType: js.Array[DeleteCacheRequest]
  
  var returnType: Unit
}
object `49` {
  
  inline def apply(paramsType: js.Array[DeleteCacheRequest], returnType: Unit): `49` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`49`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `49`] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[DeleteCacheRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: DeleteCacheRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
